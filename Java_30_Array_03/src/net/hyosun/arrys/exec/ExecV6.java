package net.hyosun.arrys.exec;

public class ExecV6 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//과제
		//정수형 배열 100개를 선언하고 Math.random()를 사용하여1~100까지
		//임의 수를 생성하고 각 요소에 저장
		//배열의 각 요소에 저장된 수 중에서 짝수의 리스트를 한 라인에 5개씩 끊어서 출력하시오
		int[] intNum = new int[100];
		
		/*
		 * 짝수를 5번출력하고 Enter를 출력하여 줄바꿈하기
		 * i 변수를 사용하여 횟수를 구분하면 홀수일떄,짝수 일떄 상관없이
		 * i 변수값은 변화를 하기 떄문에 문제가 발생
		 * 
		 * 짝수를 출력할떄마다 출력한 횟수를 저장할 변수가 필요하다
		 * 별도로 짝수를 출력할떄 마다 출력한 횟수를 저장할 변수를
		 * for()명령문 이전에 선언을 해 주어야 한다
		 * */
		
		for(int i =0; i<intNum.length;i++) {
			intNum[i]=(int)(Math.random()*100)+1;
		}
	
		int intcount=0;
		for(int i=0; i <intNum.length;i++) {
			boolean bEven=(intNum[i]%2)==0;
			if(bEven) {
				System.out.printf(",%d\t", intNum[i]);
				//짝수를 출력한 후 출력한 횟수를 1 증가시키기
				intcount++;
				//짝수를 출력한 횟수가 5가 되면 줄바꿈(println())한다.
				if(intcount%5==0) {
					System.out.println();
				}
			}
			
				
			
			
		}
	}

}
