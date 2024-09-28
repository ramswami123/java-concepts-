
class A{
    public void show(){
        System.out.print("called show in A class");
    }
}

class B extends A{
    public void show(){
        System.out.print("called show in B class");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args){
        A  x =new B();
        x.show();
        // here we have intilased x as A type but allocated new B , but works fine 
        //shows output of B show() method 
        //this concept is called concept of dynamic binding
    }
}
