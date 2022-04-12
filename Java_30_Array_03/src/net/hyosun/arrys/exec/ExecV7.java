package net.hyosun.arrys.exec;

public class ExecV7 {

	public static void main(String[] args){
	
		  int[] numList = {1,2,3,4,5,6,7,8,9,10};

	        int odd = 0;
	        int even = 0;

	        for(int i=0;i<numList.length;i++){
	            if(numList[i]%2 == 0){
	                even++;
	            }else{
	                odd++;
	            }
	        }System.out.println("홀수의 갯수 : " + odd);
	        System.out.print("짝수의 갯수 : " + even
	        );
			
	
	}

}
