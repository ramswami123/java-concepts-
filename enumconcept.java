import java.util.*;
enum status_req{
  success,update,delete,write,post;
}
//enum is used define constants 
//implemented in class and all values in enum are objects and constants
public class enumconcept{
  public static void main(String[] args) {
    status_req[] s=status_req.values();//return all values
    //values return array
    for (status_req val:s){
      System.out.print(val + " ");
    }
    
    
    System.out.println();
    
    
    //access for specific objects un enum
    
    status_req x = status_req.update;
    System.out.print(x);
    
  }
}
