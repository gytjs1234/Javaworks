package net.hyosun.arrays.controller;

import net.hyosun.arrays.service.Service1A;
import net.hyosun.arrays.service.ServiceV1;

public class ControllerV1 {
public static void main(String[] args) {
	ServiceV1 serviceV1 = new ServiceV1();
	serviceV1.scoreKoreSum();
	int intKorSum = serviceV1.scoreKoreSum();
	System.out.println("총점:"+intKorSum );
	
	
	Service1A service1A =new Service1A();
	service1A.scoreKoreSum();
	System.out.println("총점:"+intKorSum );
}


}
