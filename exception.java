import java.util.*;

public class exception {
    public static void main(String[] args) {
      int i=0;
      int j=8;
      
      try{
        j=j/i;
      }
      catch(Exception e){
        System.out.println("hello error" + e);
      }
      System.out.println("error class is printed");
  }
  
  // output
  // hello errorjava.lang.ArithmeticException: / by zero
  // error class is printed
}
