package com.callor.app.exec;

public class Exec04 {
	public static void main(String[] args) {

		String str1 = "A";
		String str2 = "B";
		
		//str1 과 str2를 비교해라
		int comp =str1.compareTo(str2);
		System.out.println(comp);
		//str2 과 str1를 비교해라		
		comp=str2.compareTo(str1);
		System.out.println(comp);
		//str1 과 str1를 비교해라
		comp =str1.compareTo(str1);
		System.out.println(comp);
		
		
		String[]strs={"f","a","c","b","d"};
		for(String str:strs) {
			System.out.printf("%s\t",str);
		}
		for(int i=0;i<strs.length;i++) {
			for(int j=i+1;j<strs.length;j++) {
				//문자열의 알파벳 순서를 비교하는 method
				//strs[i]에 저장된 문자열이 strs[j]에 저장된 문자열보다
				//알파벳 순서상 앞에 문자열이 뒤에나오면 결과는 0보다 크다
				//반대이면 결과는 0 보다 작다.
				if(strs[i].compareTo(strs[j])>0) {
					
					String str=strs[i];
					strs[i]=strs[j];
					strs[j]=str;
					
				}
			}
		}
		System.out.println();
		for(String str:strs) {
			System.out.printf("%s\t",str);
			
		}
	}
	
	

}
