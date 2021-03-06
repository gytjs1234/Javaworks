package net.hyosun.service.domain;

public class StudentVO {
	//학번:이름:학년:반:학과:주소
	//00035:조보성:2:3:역사학:울산광역시 북구 산업로1010
	
	//학생객체를 추상화하여  private으로 정보를 은닉
	private String stNum;
	private String stName;
	private String stGrade;
	private String stDept;
	private String stAddr;
	public String getStNum() {
		return stNum;
	}
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", stGrade=" + stGrade + ", stDept=" + stDept
				+ ", stAddr=" + stAddr + ", getStNum()=" + getStNum() + ", getStName()=" + getStName()
				+ ", getStGrade()=" + getStGrade() + ", getStDept()=" + getStDept() + ", getStAddr()=" + getStAddr()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
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
	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}
	

}
