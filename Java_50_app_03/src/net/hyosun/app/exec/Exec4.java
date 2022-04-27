package net.hyosun.app.exec;

public class Exec4 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
	     for(int i = 2; i <=100;i++){
	            for(int j = 2; num <= i ; j++){
	                if(i !=j && i % j ==0)break;
	                if(i == j){
	                    System.out.println(i + "는 소수 이다");
	                }
	            }
	        }
	}
}
