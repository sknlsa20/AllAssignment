package com.src.io;
import java.io.FileInputStream;  
public class FileToConsole {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("E:\\Batch - 1\\Day-5\\src\\com\\src\\io\\FileToConsole.java");    
            int i;
            
            while((i=fin.read())!=-1)
            {
            	 System.out.print((char)i); 
            }
            
              
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  