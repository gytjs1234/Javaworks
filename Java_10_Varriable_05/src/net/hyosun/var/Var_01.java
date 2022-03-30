package net.hyosun.var;

public class Var_01 {
public static void main(String[] args) {
	//실수형
	double doRnd = 0.0;
	double donRnd = 0.0;
	
	
	
	doRnd = Math.random()*1000 ;
	donRnd = Math.random()*1000 ;

	
	System.out.println(doRnd ); 
	System.out.println(donRnd ); 
	
	
	System.out.println(doRnd + donRnd);
	System.out.println(doRnd - donRnd);
	System.out.println(doRnd * donRnd);
	System.out.println(doRnd / donRnd);
	
}
}
