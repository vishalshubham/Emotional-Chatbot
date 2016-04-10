package com.emobot.interactApi;

public class EPANode {
	
	private double eValue;
	private double pValue;
	private double aValue;
	
	public EPANode(double e, double p, double a) {
		this.eValue = e;
		this.pValue = p;
		this.aValue = a;
	}
	public double geteValue() {
		return eValue;
	}
	public void seteValue(double eValue) {
		this.eValue = eValue;
	}
	public double getpValue() {
		return pValue;
	}
	public void setpValue(double pValue) {
		this.pValue = pValue;
	}
	public double getaValue() {
		return aValue;
	}
	public void setaValue(double aValue) {
		this.aValue = aValue;
	}
	@Override
	public String toString() {
		return "EPA: [E:" + eValue + " P:"+pValue + "A:"+aValue +"]";
	}
	
	public static double getDistance(EPANode epa1, EPANode epa2){
		double eDist = epa1.eValue - epa2.eValue;
		double pDist = epa1.pValue - epa2.pValue;
		double aDist = epa1.aValue - epa2.aValue;
		
		double distance = Math.sqrt((eDist*eDist) + (pDist*pDist) + (aDist*aDist));
		return distance;
	}
}
