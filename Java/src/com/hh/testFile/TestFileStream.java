package com.hh.testFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

import javax.imageio.stream.ImageInputStream;

public class TestFileStream {

	public static void main(String[] args) throws IOException {
		/* int  a =2;
		 int b= a--;  
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 int c= --a;  
		 System.out.println("a="+a);
		 System.out.println("c="+c);
		 System.out.println("a="+a--);
		 System.out.println("a="+--a);*/
		
		/**
		 * 读取文件
		 */
		 FileInputStream	 fin= new FileInputStream("f:/a.txt");
		 InputStreamReader in= new InputStreamReader(fin);
	     BufferedReader br= new BufferedReader(in);
	     /**
	      *输入流直接转化为字符串
	      */
	     ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
	        int ch;
	        while ((ch = in.read()) != -1) {   
	            swapStream.write(ch);   
	        }
	    System.out.println(swapStream.toString()); 	    
	     /**
	       * 写入文件
	       */
	      FileOutputStream fout = new FileOutputStream("f:/b.txt");
	      OutputStreamWriter ow= new OutputStreamWriter(fout);
	      BufferedWriter bw= new BufferedWriter(ow);
	      
	     String line="";
	     int i=0;
	      while(line!=null){
	    	  line=br.readLine();
	    	  i++;
	    	  if(line!=null){
	    		  System.out.println("第"+i+"行："+line);
	    		  //写入
	    		  bw.write(line);
	    		  bw.newLine();
	    	  }
	    	 
	      }
	     
	      bw.close();
	      ow.close();
	      fout.close();
	      
	      br.close();
	      in.close();
	      fin.close();
		 
	    /* InputStreamReader in= new InputStreamReader(System.in);
	     BufferedReader br= new BufferedReader(in);
	     System.out.println("请输入：");
	     try {
			String Strbr = br.readLine();
			System.out.println("输入的是："+Strbr);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	     
		 
	}

}
