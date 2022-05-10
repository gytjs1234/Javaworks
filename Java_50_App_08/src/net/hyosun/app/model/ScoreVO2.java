package net.hyosun.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScoreVO2 {
	protected int stNum;
	protected int intKor;
	protected int intEng;
	protected int intMath;
	protected int intSum;
	protected float fAge;

	public int getIntSum() {

		int intSum = intKor + intEng + intMath;
		return intSum;
		// TODO Auto-generated method stub
	}

	public float getFAvg() {
		return (float) getIntSum() / 3;
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {

		// 문자열 변수 +="문자열"
		/*
		 * String 문자열 변수="대한민국" 문자열변수 +="우리나라" 와 같은 코드는 문자열변수가 관리하는 메모리 구조상 메모리 낭비와 속도에
		 * 이슈가 있다고 함 그래서 문자열을 여러번 결합하는(+=)코드는 StringBuilder또는 String Buffer라는 틀래스를 사용하도록
		 * 한다
		 */
		StringBuilder retStr = new StringBuilder();
		retStr.append(String.format("%d\t", stNum));
		retStr.append(String.format("%d\t", intKor));
		retStr.append(String.format("%d\t", intEng));
		retStr.append(String.format("%d\t", intMath));
		retStr.append(String.format("%d\t", getIntSum()));// 총점계산하기위해 메서드호출
		retStr.append(String.format("5.2f\n", getFAvg()));

		return retStr.toString();
	}

}
