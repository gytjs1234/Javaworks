package net.hyosun.arrys.service;

/*
 * makeScore()
 * printScore()
 * sumScore()
 * 
 * 등의 method를 선언하고
 * 임의 성적을 생성하여 intKor 에 저장
 * 성적일람표 출력
 * 총점계산
 * 
 */
public class ScoreServiceV5 {

	public static String dLine ="*".repeat(70);
	public static String sLine ="#".repeat(70);
	private int[]intKor;
	public ScoreServiceV5() {
		intKor=new int[100];
	}
	
	public void makeScore() {
		for(int i=0; i<intKor.length;i++) {
			intKor[i]=(int)(Math.random()*50)+51;
		}
	}
	public void printScore() {
		System.out.println(dLine);
		System.out.println("성적일람표");
		System.out.println(sLine);
		for(int i=0;i<intKor.length;i++) {
			System.out.printf("%d:%d\t\t", (i+1),intKor[i]);
			if((i+1)%5==0) {
				System.out.println();
			}
		}
		
		
	}
	public void sumScore(){
		int intSum=0;
		for(int i=0; i<intKor.length;i++){
			intSum+=intKor[i];
			
			
		}
		System.out.println("총점은");
		System.out.println(intSum);
		
		
	}
}

