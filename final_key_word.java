final class x{
    public void show(){
        System.out.println("acessing show in x");
    }
}
class a extends x {
    // here extends throw error 
}
public class final_key_word {
    // final key word 

    // when final keyword is used at class level  stop inheritance 

    final double p=3.14;
    p=5;//here p throws error as p value can n't be changed 
    
    // when final is used in method level stop overriding in method
    
}
