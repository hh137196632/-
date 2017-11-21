package com.study.main;

public class Params {  
	  
    public static void printParams(String... str){  
        if(str.length == 0){  
            System.out.println("无参数的printParams()方法");  
        }  
        else{  
        	  System.out.println("带参的printParams-----------方法");
            for (String string : str) {  
            	 System.out.println(string);
            }  
        }  
    }  
      
    public static void main(String[] args) {  
        printParams();  
        printParams("a","b","c");  
        printParams(new String[]{"A","B","C"});  
    }  
} 
