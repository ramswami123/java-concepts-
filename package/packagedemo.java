import claculations.mathscal;
public class packagedemo {
    public static void main(String[] args){
        mathscal A=new mathscal();
        //here i am using direct class name insted of object because of static method 
        System.out.println(mathscal.add(8,9));
        System.out.println(A.xor(8,9));
    }
}
