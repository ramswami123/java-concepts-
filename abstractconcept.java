import java.util.*;

//we can n't create object for abstract class 

abstract  class function{
  public abstract void drive();
}

//when abstarct class is imported then all methos need to  
//be defined in derived class

class BMW extends function{
  public void drive(){
    System.out.println("driving BMW");
  }
}

class Audi extends function{
  public void drive(){
    System.out.println("driving Audi");
  }
}
public class abstractconcept{
    public static void main(String[] args) {
      BMW obj= new BMW();
      obj.drive();
      
      Audi obj1 = new Audi();
      obj1.drive();
  }
}
