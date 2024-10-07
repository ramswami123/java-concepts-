import java.util.*;

public class finallyusecase {
    public static void main(String[] args) {
      int i=3;
      try{
        i=0/i;
      }
      //instead catch we can use finally 
      //finally used when they there is case the statements 
      //should be completed
      finally{
        System.out.println("prints anyways");
      }
  }
  // Output:
  // prints anyways
}
