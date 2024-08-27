package com.soumya;

import java.util.List;

interface Test<T>{
	
	  List<T> getNames(T...t);
}

public class Demo {

	static <U> Test<U> getTest(U...obj){
				
		System.out.println("get");
		return (data) -> List.of(obj);
	}
	public static void main(String[] args) {

		Test<String> names = getTest("Ram","Kunal","Aman","Roshni","Devika","Nikita");
		
		System.out.println("Hello");
		
		List<String> l = names.getNames("John","Michael");
		
		System.out.println(l);// [Ram,Kunal,Aman,Roshni,Devika,Nikita]
				
		System.out.println("Terminated...");
	}
 
	
}
