package com.emobot.interactApi;

import java.util.ArrayList;

import com.emobot.opennlp.StopWordAnalyser;

public class EPAOutput {
	
	public static EPANode getEPAValue(String str){
		
		double eValueTotal=0;
		double pValueTotal=0;
		double aValueTotal=0;
		int validCount=0;
		
		ArrayList<String> cleanStr = StopWordAnalyser.removeStopWords(str);
		
		for(String temp: cleanStr){
			EPANode epaValues = InteractBehaviour.getEPAValues(temp.toLowerCase());
			if(epaValues!=null){
				validCount++;
				eValueTotal += epaValues.geteValue();
				pValueTotal += epaValues.getpValue();
				aValueTotal += epaValues.getaValue();
			}
		}
		
		if((eValueTotal==0.0) && pValueTotal==0.0 && aValueTotal==0.0){
			System.out.println("EPA: [E:" +0 + " P:"+0 + " A:"+0 +"]");
			return null;
		}
		else{
			eValueTotal = eValueTotal/validCount;
			pValueTotal = pValueTotal/validCount;
			aValueTotal = aValueTotal/validCount;
			System.out.println("EPA: [E:" +eValueTotal + " P:"+pValueTotal + " A:"+aValueTotal +"]");
			return new EPANode(eValueTotal, pValueTotal, aValueTotal);
		}
	}

	public static int getClosest(ArrayList<EPANode> responseEpas, EPANode epaNode) {
		
		boolean flag= false;
		for(EPANode node: responseEpas){
			if(node!=null){
				flag=true;
				break;
			}
		}
		
		double minDistance=100;
		int minIndex = -9999;
		if(flag!=false){
			
			if(epaNode==null){
				epaNode = new EPANode(0, 0, 0);
			}
			
			for(EPANode node: responseEpas){
				if(node!=null){
					double distance = EPANode.getDistance(node, epaNode);
					if(distance<minDistance){
						minDistance = distance;
						minIndex = responseEpas.indexOf(node);
					}
				}
			}
			return minIndex;
		}
		
		return 4;
	}

}
