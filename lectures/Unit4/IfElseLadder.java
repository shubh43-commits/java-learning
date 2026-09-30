package lectures.Unit4;

public class IfElseLadder {
    public static void main(String[] args) {
        boolean isSenioirCitizen = false;
        boolean isAnAdult = false;

        if(isSenioirCitizen){
            System.out.println("Hello Senior citizen");
        }else{
            if (isAnAdult) {
                System.out.println("hello Adult");
            }else{
                System.out.println("Hello child");
            }
        }
    }
}
