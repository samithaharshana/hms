/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author Samitha
 */
public class testclass {
    
    int s=90;
    static{System.out.println("sf");}
    static int a=40;//non static  
    
     public static  int cube(int x){ 
        // System.out.println(s);//non static variable can not access within the static context
  return x*x*x;  
  }  
   
 public static void main(String args[]){  
  //System.out.println(a);  
  //cube(4);
     testclass.cube(5);
  testclass t = new testclass();
  //t.cube(5);
     System.out.println(testclass.a);
  
  //int result=testclass.cube(5);  
 // System.out.println(result);  
 }  
 
 
    
}
