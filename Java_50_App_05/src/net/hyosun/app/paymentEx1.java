package net.hyosun.app;

public class paymentEx1 {
	/*
	 * 급여를 현금으로 지급하려고 한다
	 * 대한민국 액면가를 기준으로 최소 화폐매수로 지급하려고 한다
	 * 급여금액에 따라 최소 화패 매수 계산을 수행
	 * 대한민국 화폐단위
	 * 5만우,1만,5천,5백,1백,50,10
	 * 
	 */
	public static void main(String[] args){
		int pay =3_928_880;
		int paper=(pay/50_000);
		System.out.println("5만원권:"+paper);
		pay -=paper*50_000;
		paper=(pay/10_000);
		System.out.println("1만원권:"+paper);
		
	
		

		
		
	}

}
