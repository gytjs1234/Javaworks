package net.hyosun.app.domain;
/*
 * 인터페이스는 프로토타입
 * 클래스 정의(class prototype define)
 * java파일을 생성하고
 * class키워드를 시작으로 만든 코드
 */
//1
public class StudentVO {

	private String stNum;
	private String stName;
	private int intGrade;
	private String stDept;
	private String stAddr;
	private String stTel;

	public StudentVO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param stNum
	 * @param stName
	 * @param intGrade
	 * @param stDept
	 * @param stAddr
	 * @param stTel
	 */

	/*
	 * VO클래스에 기본생성자와 모든 인스턴스변수( 클래스영역의 변수)를 매개변수로 받아
	 *  초기화 하는 임의 생성자를 만든다
	 * 
	 * JDK를 사용하여 프로젝트를 수행할때 다양한 도구들을 연결할 필요가 있는데 
	 * 도구들 마다 VO객체에 접근하는 방법이 조금씩 다르다
	 * 
	 * 어떤 도구는Getter,setter를 통하여 접근하기도 하고 어떤 도구는 
	 * 필드 생성자를 통하여 접근하기도한다 최근에는
	 * Getter,setter를 만들지 말자라는 의견들이 있지만 
	 * 다양한 JDK도구를 사용할때는 필요하므로 표준 Java코딩의 VO클래스 작성
	 * 패턴에서는 모든 변수는 Private으로 선언하고 getter,setter를 정의해 준다
	 * 
	 */
	public StudentVO(String stNum, String stName, int intGrade, String stDept, String stAddr, String stTel) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.intGrade = intGrade;
		this.stDept = stDept;
		this.stAddr = stAddr;
		this.stTel = stTel;
	}

	public String getStNum() {
		return stNum;
	}

	public void setStNum(String stNum) {
		this.stNum = stNum;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getIntGrade() {
		return intGrade;
	}

	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	public String getStDept() {
		return stDept;
	}

	public void setStDept(String stDept) {
		this.stDept = stDept;
	}

	public String getStAddr() {
		return stAddr;
	}

	
	// VO객체에 데이터를 저장한후 저장된 데이터가 잘 담겼는지 확인하는 용도로 사용하기위하여
	// toString()메서드를 재정의한다
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", intGrade=" + intGrade + ", stDept=" + stDept
				+ ", stAddr=" + stAddr + ", stTel=" + stTel + ", getStNum()=" + getStNum() + ", getStName()="
				+ getStName() + ", getIntGrade()=" + getIntGrade() + ", getStDept()=" + getStDept() + ", getStAddr()="
				+ getStAddr() + ", getStTel()=" + getStTel() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setStAddr(String stAddr){
		this.stAddr = stAddr;
	}

	public String getStTel() {
		return stTel;
	}

	public void setStTel(String stTel) {
		this.stTel = stTel;
	}

}
