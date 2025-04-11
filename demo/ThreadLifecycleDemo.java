package demo;

class Thread1 extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread1: " + i);
         try {
             Thread.sleep(2000); 
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
     System.out.println("Thread1 Finished Execution.");
 }
}

class Thread2 extends Thread {
 public void run() {
     for (int i = 10; i <= 15; i++) {
         System.out.println("Thread2: " + i);
         try {
             Thread.sleep(2000); 
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
     System.out.println("Thread2 Finished Execution.");
 }
}
public class ThreadLifecycleDemo {
 public static void main(String[] args) {
     Thread1 t1 = new Thread1();
     Thread2 t2 = new Thread2();

     System.out.println("Starting Thread1...");
     t1.start(); 
     
     System.out.println("Yielding CPU to another thread...");
     Thread.yield(); 

     System.out.println("Starting Thread2...");
     t2.start(); 

     try {
         t1.join();
         t2.join(); 
     } catch (InterruptedException e) {
         System.out.println(e);
     }
     System.out.println("Both threads have finished execution.");
 }
}
