/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starting_pages.Welcome_pages;

import Starting_pages.Welcome_pages.Welcome_page;

/**
 *
 * @author Atharva Sahani
 */

    
    class A extends Thread{
       Welcome_page myFrame;
       
       A(){
        Welcome_page myFrame = new Welcome_page();
         System.out.println("Normal screen  started");
         try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);}
          System.out.println("Normal screen  ended");
         myFrame.disposefunction();
         
       }
               }
  class A1 extends Thread{
       Welcome_page_1 myFrame1;
       public void run (){
    try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);}
      myFrame1 = new Welcome_page_1();
      System.out.println("start thread screen 1");
      try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);}
          System.out.println(" thread screen 1  ended");
         myFrame1.disposefunction();
   }
  }   
class A2 extends Thread{
        Welcome_page_2 myFrame2;
      public void run(){
    try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);}
      myFrame2 = new Welcome_page_2();
       System.out.println("start thread screen 2");   
        try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);}
          System.out.println(" thread screen 2  ended");
         myFrame2.disposefunction();
   }
  }   
class A3 extends Thread{
        Welcome_page_3 myFrame3;
       public void run(){
    try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);}
      myFrame3 = new Welcome_page_3();
      System.out.println("start thread screen 3");
       try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);}
          System.out.println(" thread screen 3  ended");
         myFrame3.disposefunction();
   }
  }   
    
public class Module_invoking_class {
    public static void main(String[] args){
            int flag=0;
            A b=new A();
            A1 b1=new A1();
            A2 b2=new A2();
            A3 b3=new A3();
         
            b1.start();
             try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);}
            b2.start();
             try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);}
            b3.start();
             try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);}
            
            
}
}
