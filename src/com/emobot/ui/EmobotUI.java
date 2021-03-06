package com.emobot.ui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.emobot.charts.XYLineChart;
import com.emobot.interactApi.EPANode;
import com.emobot.interactApi.EPAOutput;
import com.emobot.response.RespondAPI;


public class EmobotUI {

	private static final Color RED_COLOR = new Color(255, 0, 0); // Red
	private static final Color BLUE_COLOR = new Color(0, 0, 153); // Dark Blue;
	
	private JFrame frame;
	private JTextField txtWriteYourMessage;
	private JLabel lblNewLabel;
	private int context=0;
	private String fullChat0 = "CONVERSATION WITH Emobot:";
	private String fullChat1 = "CONVERSATION WITH Chatbot 1:";
	private String fullChat2 = "CONVERSATION WITH Chatbot 2:";
	private String fullChat3 = "CONVERSATION WITH Chatbot 3:";
	private String fullChat4 = "CONVERSATION WITH Chatbot 4:";
	private String fullChat5 = "CONVERSATION WITH Chatbot 5:";
	
	private String fullEpa0 = "EPA VALUES FOR CONVERSATION WITH Emobot:";
	private String fullEpa1 = "EPA VALUES FOR CONVERSATION WITH Chatbot 1:";
	private String fullEpa2 = "EPA VALUES FOR CONVERSATION WITH Chatbot 2:";
	private String fullEpa3 = "EPA VALUES FOR CONVERSATION WITH Chatbot 3:";
	private String fullEpa4 = "EPA VALUES FOR CONVERSATION WITH Chatbot 4:";
	private String fullEpa5 = "EPA VALUES FOR CONVERSATION WITH Chatbot 5:";
	
	private JButton btnChatbot0;
	private JButton btnChatbot1;
	private JButton btnChatbot2;
	private JButton btnChatbot3;
	private JButton btnChatbot4;
	private JButton btnChatbot5;
	
	private ArrayList<EPANode> list01 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list02 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list03 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list04 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list05 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list00 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list1 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list2 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list3 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list4 = new ArrayList<EPANode>();
	private ArrayList<EPANode> list5 = new ArrayList<EPANode>();
	
	private JButton btnSendMessage;
	private JButton btnEPAGraph0;
	private JButton btnEPAGraph1;
	private JButton btnEPAGraph2;
	private JButton btnEPAGraph3;
	private JButton btnEPAGraph4;
	private JButton btnEPAGraph5;
	private JScrollPane scrollPane_1;
	private JTextArea txtFullChat;
	private JTextArea txtFullEpa;

	/* Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmobotUI window = new EmobotUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EmobotUI() {
		initialize();
	}

	private void setColor(JTextArea tArea1, JTextArea tArea2, Color color) {
		tArea1.setForeground(color);
		tArea2.setForeground(color);
	}
	
	private void setColor(Color color, JButton...jbuttons) {
		for(JButton btn : jbuttons) {
			btn.setForeground(color);
		}
	}
	
	private void setColor(JLabel lbl, Color color) {
		lbl.setForeground(color);
	}
	
	private void initialize() {
		
		justInitialize();
		
		btnSendMessage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(isValidInput()){
					String msg = txtWriteYourMessage.getText();
					System.out.println(msg);
					EPANode epaNode = EPAOutput.getEPAValue(msg);
					txtFullEpa.setText(txtFullEpa.getText() + "\n YOU: " + epaNode);
					txtFullChat.setText(txtFullChat.getText() + "\n YOU: " + msg);
					setColor(txtFullChat, txtFullEpa, BLUE_COLOR); // Red for Emobot
					txtWriteYourMessage.setText("");
					lblNewLabel.setText("Bot is typing ...");
					
					if(context==0){
						RespondAPI respondAPI = new RespondAPI(msg);
						ArrayList<String> responses = new ArrayList<String>();
						ArrayList<EPANode> responseEpas = new ArrayList<EPANode>();
						String response1 = respondAPI.getJsonResponseFromChatbot1();
						System.out.println(response1);
						EPANode tempNode1 = EPAOutput.getEPAValue(response1);
						String response2 = respondAPI.getJsonResponseFromChatbot2();
						System.out.println(response2);
						EPANode tempNode2 = EPAOutput.getEPAValue(response2);
						String response3 = respondAPI.getJsonResponseFromChatbot3();
						System.out.println(response3);
						EPANode tempNode3 = EPAOutput.getEPAValue(response3);
						String response4 = respondAPI.getJsonResponseFromChatbot4();
						System.out.println(response4);
						EPANode tempNode4 = EPAOutput.getEPAValue(response4);
						String response5 = respondAPI.getJsonResponseFromChatbot5();
						System.out.println(response5);
						EPANode tempNode5 = EPAOutput.getEPAValue(response5);
						responses.add(response1);
						responses.add(response2);
						responses.add(response3);
						responses.add(response4);
						responses.add(response5);
						responseEpas.add(tempNode1);
						responseEpas.add(tempNode2);
						responseEpas.add(tempNode3);
						responseEpas.add(tempNode4);
						responseEpas.add(tempNode5);
						
						int index = EPAOutput.getClosest(responseEpas, epaNode);
						txtFullEpa.setText(txtFullEpa.getText() + "\n BOT: " + responseEpas.get(index));
						txtFullChat.setText(txtFullChat.getText() + "\n BOT: " + responses.get(index));
						fullChat0 = txtFullChat.getText();
						fullEpa0 = txtFullEpa.getText();
						list00.add(epaNode);
						list01.add(epaNode);
						list02.add(epaNode);
						list03.add(epaNode);
						list04.add(epaNode);
						list05.add(epaNode);
						list00.add(responseEpas.get(index));
						list01.add(tempNode1);
						list02.add(tempNode2);
						list03.add(tempNode3);
						list04.add(tempNode4);
						list05.add(tempNode5);
					}
					else if(context==1){
						RespondAPI respondAPI = new RespondAPI(msg);
						String response = respondAPI.getJsonResponseFromChatbot1();
						EPANode tempNode = EPAOutput.getEPAValue(response);
						txtFullEpa.setText(txtFullEpa.getText() + "\n BOT: " + tempNode);
						txtFullChat.setText(txtFullChat.getText() + "\n BOT: " + response);
						fullChat1 = txtFullChat.getText();
						fullEpa1 = txtFullEpa.getText();
						list1.add(epaNode);
						list1.add(tempNode);
					}
					else if(context==2){
						RespondAPI respondAPI = new RespondAPI(msg);
						String response = respondAPI.getJsonResponseFromChatbot2();
						EPANode tempNode = EPAOutput.getEPAValue(response);
						txtFullEpa.setText(txtFullEpa.getText() + "\n BOT: " + tempNode);
						txtFullChat.setText(txtFullChat.getText() + "\n BOT: " + response);
						fullChat2 = txtFullChat.getText();
						fullEpa2 = txtFullEpa.getText();
						list2.add(epaNode);
						list2.add(tempNode);
					}
					else if(context==3){
						RespondAPI respondAPI = new RespondAPI(msg);
						String response = respondAPI.getJsonResponseFromChatbot3();
						EPANode tempNode = EPAOutput.getEPAValue(response);
						txtFullEpa.setText(txtFullEpa.getText() + "\n BOT: " + tempNode);
						txtFullChat.setText(txtFullChat.getText() + "\n BOT: " + response);
						fullChat3 = txtFullChat.getText();
						fullEpa3 = txtFullEpa.getText();
						list3.add(epaNode);
						list3.add(tempNode);
					}
					else if(context==4){
						RespondAPI respondAPI = new RespondAPI(msg);
						String response = respondAPI.getJsonResponseFromChatbot4();
						EPANode tempNode = EPAOutput.getEPAValue(response);
						txtFullEpa.setText(txtFullEpa.getText() + "\n BOT: " + tempNode);
						txtFullChat.setText(txtFullChat.getText() + "\n BOT: " + response);
						fullChat4 = txtFullChat.getText();
						fullEpa4 = txtFullEpa.getText();
						list4.add(epaNode);
						list4.add(tempNode);
					}
					else{
						RespondAPI respondAPI = new RespondAPI(msg);
						String response = respondAPI.getJsonResponseFromChatbot5();
						EPANode tempNode = EPAOutput.getEPAValue(response);
						txtFullEpa.setText(txtFullEpa.getText() + "\n BOT: " + tempNode);
						txtFullChat.setText(txtFullChat.getText() + "\n BOT: " + response);
						fullChat5 = txtFullChat.getText();
						fullEpa5 = txtFullEpa.getText();
						list5.add(epaNode);
						list5.add(tempNode);
					}
					lblNewLabel.setText("");
				}
				else{
					lblNewLabel.setText("Please write some message first !!!");
				}
			}
		});
		
		txtWriteYourMessage.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				lblNewLabel.setText("User is typing ...");
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNewLabel.setText("");
			}
		});
		
		btnChatbot0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				context = 0;
				txtFullChat.setText(fullChat0);
				txtFullEpa.setText(fullEpa0);
				setColor(RED_COLOR, btnChatbot0, btnEPAGraph0);
				setColor(BLUE_COLOR, btnChatbot1, btnEPAGraph1,
										btnChatbot2, btnEPAGraph2,
										btnChatbot3, btnEPAGraph3,
										btnChatbot4, btnEPAGraph4,
										btnChatbot5, btnEPAGraph5);
			}
		});
		btnChatbot1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				context = 1;
				txtFullChat.setText(fullChat1);
				txtFullEpa.setText(fullEpa1);
				
				setColor(RED_COLOR, btnChatbot1, btnEPAGraph1);
				setColor(BLUE_COLOR, btnChatbot0, btnEPAGraph0,
										btnChatbot2, btnEPAGraph2,
										btnChatbot3, btnEPAGraph3,
										btnChatbot4, btnEPAGraph4,
										btnChatbot5, btnEPAGraph5);
			}
		});
		btnChatbot2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				context = 2;
				txtFullChat.setText(fullChat2);
				txtFullEpa.setText(fullEpa2);
				setColor(RED_COLOR, btnChatbot2, btnEPAGraph2);
				setColor(BLUE_COLOR, btnChatbot0, btnEPAGraph0,
										btnChatbot1, btnEPAGraph1,
										btnChatbot3, btnEPAGraph3,
										btnChatbot4, btnEPAGraph4,
										btnChatbot5, btnEPAGraph5);
			}
		});
		btnChatbot3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				context = 3;
				txtFullChat.setText(fullChat3);
				txtFullEpa.setText(fullEpa3);
				setColor(RED_COLOR, btnChatbot3, btnEPAGraph3);
				setColor(BLUE_COLOR, btnChatbot0, btnEPAGraph0,
										btnChatbot1, btnEPAGraph1,
										btnChatbot2, btnEPAGraph2,
										btnChatbot4, btnEPAGraph4,
										btnChatbot5, btnEPAGraph5);
			}
		});
		btnChatbot4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				context = 4;
				txtFullChat.setText(fullChat4);
				txtFullEpa.setText(fullEpa4);
				setColor(RED_COLOR, btnChatbot4, btnEPAGraph4);
				setColor(BLUE_COLOR, btnChatbot0, btnEPAGraph0,
										btnChatbot1, btnEPAGraph1,
										btnChatbot2, btnEPAGraph2,
										btnChatbot3, btnEPAGraph3,
										btnChatbot5, btnEPAGraph5);
			}
		});
		btnChatbot5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				context = 5;
				txtFullChat.setText(fullChat5);
				txtFullEpa.setText(fullEpa5);
				setColor(RED_COLOR, btnChatbot5, btnEPAGraph5);
				setColor(BLUE_COLOR, btnChatbot0, btnEPAGraph0,
										btnChatbot1, btnEPAGraph1,
										btnChatbot2, btnEPAGraph2,
										btnChatbot3, btnEPAGraph3,
										btnChatbot4, btnEPAGraph4);
			}
		});
		btnEPAGraph0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ArrayList<ArrayList<EPANode>> listtt = new ArrayList<ArrayList<EPANode>>();
				listtt.add(list00);
				listtt.add(list01);
				listtt.add(list02);
				listtt.add(list03);
				listtt.add(list04);
				listtt.add(list05);
				getEPAChartEmobot(listtt, "Emobot:");
			}
		});
		btnEPAGraph1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getEPAChart(list1, "Chatbot 1:");
			}
		});
		btnEPAGraph2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getEPAChart(list2, "Chatbot 2:");
			}
		});
		btnEPAGraph3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getEPAChart(list3, "Chatbot 3:");
			}
		});
		btnEPAGraph4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getEPAChart(list4, "Chatbot 4:");
			}
		});
		btnEPAGraph5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getEPAChart(list5, "Chatbot 5:");
			}
		});
	}
	
	public void getEPAChartEmobot(ArrayList<ArrayList<EPANode>> list, String title){
		ArrayList<ArrayList<Double>> elistt = new ArrayList<ArrayList<Double>>();
		ArrayList<ArrayList<Double>> plistt = new ArrayList<ArrayList<Double>>();
		ArrayList<ArrayList<Double>> alistt = new ArrayList<ArrayList<Double>>();
		
		for(ArrayList<EPANode> tempNode: list){
			ArrayList<Double> elist = new ArrayList<Double>();
			ArrayList<Double> plist = new ArrayList<Double>();
			ArrayList<Double> alist = new ArrayList<Double>();
			
			for(EPANode node: tempNode){
				if(node==null){
					elist.add((double) 0);
					plist.add((double) 0);
					alist.add((double) 0);
				}
				else{
					elist.add(node.geteValue());
					plist.add(node.getpValue());
					alist.add(node.getaValue());
				}
			}
			
			elistt.add(elist);
			plistt.add(plist);
			alistt.add(alist);
		}
		XYLineChart chart = new XYLineChart(title+" ", elistt, plistt, alistt);
		chart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		chart.setVisible(true);
	}
	
	public void getEPAChart(ArrayList<EPANode> list, String title){
		ArrayList<Double> elist = new ArrayList<Double>();
		ArrayList<Double> plist = new ArrayList<Double>();
		ArrayList<Double> alist = new ArrayList<Double>();
		ArrayList<ArrayList<Double>> elistt = new ArrayList<ArrayList<Double>>();
		ArrayList<ArrayList<Double>> plistt = new ArrayList<ArrayList<Double>>();
		ArrayList<ArrayList<Double>> alistt = new ArrayList<ArrayList<Double>>();
		
		for(EPANode node: list){
			if(node==null){
				elist.add((double) 0);
				plist.add((double) 0);
				alist.add((double) 0);
			}
			else{
				elist.add(node.geteValue());
				plist.add(node.getpValue());
				alist.add(node.getaValue());
			}
		}
		elistt.add(elist);
		plistt.add(plist);
		alistt.add(alist);
		XYLineChart chart = new XYLineChart(title+" ", elistt, plistt, alistt);
		chart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		chart.setVisible(true);
	}
	
	public boolean isValidInput(){
		if(!(txtWriteYourMessage.getText().equals(null) || txtWriteYourMessage.getText().equals("")))
			return true;
		return false;
	}
	
	public void justInitialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 1223, 677);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setMinimumSize(new Dimension(500, 0));
		frame.setMaximumSize(new Dimension(500, 500));
		frame.setTitle("Emobot - Emotional Chatbot");
		frame.getContentPane().setLayout(null);
		
		btnSendMessage = new JButton("Send Message");
		btnSendMessage.setBounds(898, 551, 299, 75);
		frame.getContentPane().add(btnSendMessage);
		
		frame.getRootPane().setDefaultButton(btnSendMessage);
		
		txtWriteYourMessage = new JTextField();
		txtWriteYourMessage.setToolTipText("Write your message");
		txtWriteYourMessage.setBounds(10, 576, 878, 50);
		frame.getContentPane().add(txtWriteYourMessage);
		txtWriteYourMessage.setColumns(10);
		
		// Bot buttons
		btnChatbot0 = new JButton("Emobot");
		btnChatbot0.setBounds(898, 11, 153, 41);
		frame.getContentPane().add(btnChatbot0);
		
		btnChatbot1 = new JButton("Chatbot 1");
		btnChatbot1.setBounds(898, 63, 153, 41);
		frame.getContentPane().add(btnChatbot1);
		
		btnChatbot2 = new JButton("Chatbot 2");
		btnChatbot2.setBounds(898, 115, 153, 41);
		frame.getContentPane().add(btnChatbot2);
		
		btnChatbot3 = new JButton("Chatbot 3");
		btnChatbot3.setBounds(898, 167, 153, 41);
		frame.getContentPane().add(btnChatbot3);
		
		btnChatbot4 = new JButton("Chatbot 4");
		btnChatbot4.setBounds(898, 219, 153, 41);
		frame.getContentPane().add(btnChatbot4);
		
		btnChatbot5 = new JButton("Chatbot 5");
		btnChatbot5.setBounds(898, 271, 153, 41);
		frame.getContentPane().add(btnChatbot5);
		
		// Action message Label
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 551, 493, 14);
		frame.getContentPane().add(lblNewLabel);
		
		// Index Labels
		JLabel lblChatbotProgram = new JLabel("Index:");
		lblChatbotProgram.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblChatbotProgram.setBounds(898, 323, 299, 27);
		frame.getContentPane().add(lblChatbotProgram);
		
		JLabel lblChatbotProgram_1 = new JLabel("Chatbot 1: Program O Bot");
		lblChatbotProgram_1.setBounds(898, 377, 299, 27);
		frame.getContentPane().add(lblChatbotProgram_1);
		
		JLabel lblChatbotPersonality = new JLabel("Chatbot 2: Personality Forge Bot");
		lblChatbotPersonality.setBounds(898, 404, 299, 27);
		frame.getContentPane().add(lblChatbotPersonality);
		
		JLabel lblChatbotBrain = new JLabel("Chatbot 3: Brain Bot");
		lblChatbotBrain.setBounds(898, 432, 299, 27);
		frame.getContentPane().add(lblChatbotBrain);
		
		JLabel lblChatbotEliza = new JLabel("Chatbot 4: Eliza Bot");
		lblChatbotEliza.setBounds(898, 459, 299, 27);
		frame.getContentPane().add(lblChatbotEliza);
		
		JLabel lblEmobotAiaasBot = new JLabel("Emobot: AIaaS Bot ");
		lblEmobotAiaasBot.setBounds(898, 350, 299, 27);
		frame.getContentPane().add(lblEmobotAiaasBot);
		
		btnEPAGraph0 = new JButton("Show Chat EPA");
		btnEPAGraph0.setBounds(1054, 11, 143, 41);
		frame.getContentPane().add(btnEPAGraph0);
		
		btnEPAGraph1 = new JButton("Show Chat EPA");
		btnEPAGraph1.setBounds(1054, 63, 143, 41);
		frame.getContentPane().add(btnEPAGraph1);
		
		btnEPAGraph2 = new JButton("Show Chat EPA");
		btnEPAGraph2.setBounds(1054, 115, 143, 41);
		frame.getContentPane().add(btnEPAGraph2);
		
		btnEPAGraph3 = new JButton("Show Chat EPA");
		btnEPAGraph3.setBounds(1054, 167, 143, 41);
		frame.getContentPane().add(btnEPAGraph3);
		
		btnEPAGraph4 = new JButton("Show Chat EPA");
		btnEPAGraph4.setBounds(1054, 219, 143, 41);
		frame.getContentPane().add(btnEPAGraph4);
		
		btnEPAGraph5 = new JButton("Show Chat EPA");
		btnEPAGraph5.setBounds(1054, 271, 143, 41);
		frame.getContentPane().add(btnEPAGraph5);
		
		setColor(RED_COLOR, btnChatbot0, btnEPAGraph0);
		setColor(BLUE_COLOR, btnChatbot1, btnEPAGraph1);
		setColor(BLUE_COLOR, btnChatbot2, btnEPAGraph2);
		setColor(BLUE_COLOR, btnChatbot3, btnEPAGraph3);
		setColor(BLUE_COLOR, btnChatbot4, btnEPAGraph4);
		setColor(BLUE_COLOR, btnChatbot5, btnEPAGraph5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 376, 529);
		frame.getContentPane().add(scrollPane);
		
		txtFullEpa = new JTextArea();
		txtFullEpa.setEditable(false);
		txtFullEpa.setLineWrap(true);
		txtFullEpa.setText("EPA VALUES OF THE CONVERSATION WITH Emobot:");
		scrollPane.setViewportView(txtFullEpa);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(395, 11, 493, 529);
		frame.getContentPane().add(scrollPane_1);
		
		txtFullChat = new JTextArea();
		txtFullChat.setEditable(false);
		txtFullChat.setText("CONVERSATION WITH Emobot:");
		scrollPane_1.setViewportView(txtFullChat);
		
		setColor(txtFullChat, txtFullEpa, BLUE_COLOR);
		
		JLabel lblChatbotEliza_1 = new JLabel("Chatbot 5: Alice Bot");
		lblChatbotEliza_1.setBounds(898, 485, 299, 27);
		frame.getContentPane().add(lblChatbotEliza_1);
	}
}





















