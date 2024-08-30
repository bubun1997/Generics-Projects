package com.soumya;

import java.util.ArrayList;
import java.util.List;

interface Test<T>{
	
	  List<T> getNames(T...t);
}
class A{
	
}
public class Demo {

	static <U> Test<U> getTest(U...obj){
				
		System.out.println("get");
		return (data) -> List.of(obj);
	}
	public static void main(String[] args) {

//		Test<String> names = getTest("Ram","Kunal","Aman","Roshni","Devika","Nikita");
//		
//		System.out.println("Hello");
//		
//		List<String> l = names.getNames("John","Michael");
//		
//		System.out.println(l);// [Ram,Kunal,Aman,Roshni,Devika,Nikita]
//				
//		System.out.println("Terminated...");
//		
		Test<A> test = aArr -> {
			
			List<A> list = new ArrayList<>();
			System.out.println("called lambda !!");
			for(A a:aArr)
				list.add(a);
			
			return list;
			
		};
		
		List<A> res = test.getNames(new A(),new A(),new A());
		
		System.out.println(res);
	}
 
	
}
