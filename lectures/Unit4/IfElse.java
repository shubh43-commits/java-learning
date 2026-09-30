package lectures.Unit4;

public class IfElse {
    public static void main(String[] args) {
        //  boolean isMale = true;
        boolean isMale = false;
         String name = "Bob";
         System.out.println("Before if");
         if(isMale){
            System.out.println("Mr. " + name);
         }else{
            System.out.println("Ms. "+ name);
         }
         System.out.println("After if");
    }
}
