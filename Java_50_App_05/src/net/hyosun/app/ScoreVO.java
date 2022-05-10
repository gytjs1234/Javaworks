package net.hyosun.app;

public class ScoreVO {
		
		private int stNum;
		private int intKor;
		private int intEng;
		private int intMath;
		private int total;
		private int average;
		
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public int getAverage() {
			return average;
		}
		public void setAverage(int average) {
			this.average = average;
		}
		public int getStNum() {
			return stNum;
		}
		public void setStNum(int stNum) {
			this.stNum = stNum;
		}
		public int getIntKor() {
			return intKor;
		}
		public void setIntKor(int intKor) {
			this.intKor = intKor;
		}
		public int getIntEng() {
			return intEng;
		}
		public void setIntEng(int intEng) {
			this.intEng = intEng;
		}
		public int getIntMath() {
			return intMath;
		}
		@Override
		public String toString() {
			return "ScoreVO [stNum=" + stNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
					+ ", total=" + total + ", average=" + average + ", getTotal()=" + getTotal() + ", getAverage()="
					+ getAverage() + ", getStNum()=" + getStNum() + ", getIntKor()=" + getIntKor() + ", getIntEng()="
					+ getIntEng() + ", getIntMath()=" + getIntMath() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		public void setIntMath(int intMath) {
			this.intMath = intMath;
		}
		
		
		
}