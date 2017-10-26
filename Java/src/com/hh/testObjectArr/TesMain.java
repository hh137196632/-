package com.hh.testObjectArr;

import java.math.BigDecimal;

public class TesMain {

	
	public static void main(String[] args) {
		//容易错的【对象数组】
       /* Dog[] dogs = new Dog[2];
        dogs[0]= new Dog();
        dogs[0].setAge(1);
        dogs[0].setName("第一只狗");
        dogs[1]= new Dog();
        dogs[1].setAge(2);
        dogs[1].setName("第二只狗");
        for (Dog dog : dogs) {
			System.out.println(dog.getName());
		}*/
      //容易错的【变量进入方法的值】
		/*int a=1;
		test(a);
		System.out.println(a);*/
	  
	  Dog d = new Dog();
	  System.out.println(!(d instanceof Dog));
	  
	  System.out.println(3^4);
	  
	  BigDecimal b= new BigDecimal((float)0.3/0.4);
	  
	  System.out.println(b);
	
	  System.out.println( (float)Math.round( 0.3/0.4*100 )/100 );
	 
	  
		
	}
	private static int test(int a) {
	return	a++;

	}
   
}
