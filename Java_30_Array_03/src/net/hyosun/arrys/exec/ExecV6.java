package net.hyosun.arrys.exec;

public class ExecV6 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] intNum = new int[100];
		
		for(int i =0; i<intNum.length;i++) {
			intNum[i]=(int)(Math.random()*100)+1;
		}
	
		int intcount=0;
		for(int i=0; i <intNum.length;i++) {
			boolean bEven=(intNum[i]%2)==0;
			if(bEven) {
				System.out.print( intNum[i]+",\t");
				intcount++;
				if(intcount%5==0) {
					System.out.println();
				}
			}
			
				
			
			
		}
	}

}
