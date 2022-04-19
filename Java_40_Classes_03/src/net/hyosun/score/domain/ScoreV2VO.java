package net.hyosun.score.domain;

public class ScoreV2VO extends Object {
	private String stName;
	private int intKor;
	private int intENG;
	private int intMath;
	private int intSum;

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public void setfAge(float fAge) {
		this.fAge = fAge;
	}

	private float fAge;

	public String getStName() {
		return stName;
	}

	public void setStName(String stName){
		this.stName = stName;
	}
	
	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntENG() {
		return intENG;
	}

	public void setIntENG(int intENG) {
		this.intENG = intENG;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public float getfAge() {
		fAge = (float) getIntSum() / 3.0f;
		return fAge;
	}

	public int getIntSum() {
		intSum = intKor;
		intSum += intENG;
		intSum += intMath;
		return intSum;
	}

	@Override
	public String toString() {
		return "ScoreV2VO [stName=" + stName
				+ ", intKor=" + intKor 
				+ ", intENG=" + intENG
				+ ", intMath=" + intMath
				+ ", intSum=" + getIntSum() 
				+ ", fAge=" + getfAge() + "]";
	}

}
