import java.util.*;
class Inner1{
  public void Inner1show(){
    System.out.println("show in Inner1 class");
  }
  class Inner2{
    public void Inner2show(){
      System.out.println("show in Inner2 class");
    }
  }
}
public class InnerClass {
    public static void main(String[] args) {
      Inner1 obj1 = new Inner1();
      
      //acessing inner class Inner2
      
      Inner1.Inner2 obj2 = obj1.new Inner2();
      
      obj2.Inner2show();
    }
}


// Output:

// show in Inner2 class
