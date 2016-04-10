package com.emobot.opennlp;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import opennlp.tools.cmdline.parser.ParserTool;
import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.parser.Parser;
import opennlp.tools.parser.Parse;
import opennlp.tools.parser.ParserFactory;
import opennlp.tools.parser.ParserModel;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.Span;

public class SentenceAnalyser {
	
	public static void main(String[] args) throws InvalidFormatException, IOException{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Paragraph:");
		String sentence = input.nextLine();
		
		// Sentence Detection
		String[] sentences = getSentences(sentence);
		
		// Tokenize the sentence
		for(String temp: sentences)
			tokenize(temp);
		
		// Name Finder
		// findName(sentence);
		
		// Parse string
		parseString(sentence);
		
	}
	
	public static String[] getSentences(String sentence) throws InvalidFormatException, IOException {
		InputStream is = new FileInputStream("models\\en-sent.bin");
		SentenceModel model = new SentenceModel(is);
		SentenceDetectorME sdetector = new SentenceDetectorME(model);

		String sentences[] = sdetector.sentDetect(sentence);

		for(int i=0; i<sentences.length; i++)
			System.out.println(sentences[i]);
		
		is.close();
		return sentences;
	}
	
	public static String[] tokenize(String sentence) throws InvalidFormatException, IOException {
		InputStream is = new FileInputStream("models\\en-token.bin");
		TokenizerModel model = new TokenizerModel(is);
		Tokenizer tokenizer = new TokenizerME(model);
	 
		String tokens[] = tokenizer.tokenize(sentence);
	 
		for (String temp : tokens)
			System.out.println(temp);
	 
		is.close();
		return tokens;
	}
	
	public static void findName(String sentence) throws IOException {
		InputStream is = new FileInputStream("models\\en-ner-person.bin");
		TokenNameFinderModel model = new TokenNameFinderModel(is);
		NameFinderME nameFinder = new NameFinderME(model);
	 
		//String tokens[] = tokenize(sentence);
		String []tokens = new String[]{"Mike", "Smith", "is", "a", "good", "person"};
	 
		Span nameSpans[] = nameFinder.find(tokens);
	 
		for(Span s: nameSpans)
			System.out.println(s.toString());			
			
		is.close();
	}
	
	public static void parseString(String sentence) throws InvalidFormatException, IOException {
		// http://sourceforge.net/apps/mediawiki/opennlp/index.php?title=Parser#Training_Tool
		InputStream is = new FileInputStream("models\\en-parser-chunking.bin");
		ParserModel model = new ParserModel(is);
		Parser parser = ParserFactory.create(model);
	 
		Parse topParses[] = ParserTool.parseLine(sentence, parser, 1);
	 
		for (Parse p : topParses)
			p.show();
	 
		is.close();
	}
}
