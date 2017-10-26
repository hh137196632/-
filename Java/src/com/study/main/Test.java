package com.study.main;

public class Test { 
	
	static int i = 1;
	static{
		System.out.println("静态块被执行");
		i++;
	}
  public Test(){
	  System.out.println("构造方法执行");
	  i++;
  }
  
  public static void main(String[] args) {
	 /* Test t1 =new Test();
	  System.out.println(t1.i);
	  Test t2 =new Test();
	  System.out.println(t2.i);*/
	  //测试不写break
	  int  a =1;
	switch(a){
	default : System.out.println("default");
	case 1:  System.out.println("1");
	case 2:  System.out.println("2");
	case 3:  System.out.println("3");
	}
	
    /* for(int i=0, j=10;i>10;j--){
    	 System.out.println("a");
       }*/
	}
}


