import java.util.*;
// to make a class into thread we need inherit thread class

// we should maintain run method in class to 
//intiate thread
class HI extends Thread{
  public void run(){
    for(int i=0;i<100;i++){
      System.out.println("Hi");
      
      // here while using sleep we shold used try catch 
      //else it raises error 
      try{Thread.sleep(10);}
        
      catch(Exception e){System.out.println("error in sleep");}
      
    }
  }
}

class HI2 extends Thread{
  public void run(){
    for(int i=0;i<100;i++) System.out.println("Hi2");
  }
}

public class Threadusecase {
    public static void main(String[] args) {
      HI o1= new HI();
      HI2 o2= new HI2();
      
      
      // start is used start the threads
      o1.start();
      
      o2.start();
    }
  
}

// output : 
// Hi
// Hi2
// Hi2...
