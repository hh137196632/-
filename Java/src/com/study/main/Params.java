package com.study.main;

public class Params {  
	  
    public static void printParams(String... str){  
        if(str.length == 0){  
            System.out.println("�޲�����printParams()����");  
        }  
        else{  
        	  System.out.println("���ε�printParams-----------����");
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
