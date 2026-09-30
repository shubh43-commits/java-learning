package ExtraClass;

public class opps {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="Shubham";
        s1.age = 19;
        s1.rollNUm = 711;

        Student s2 = new Student();
        s2.name ="Roshan";
        s2.age = 26;
        s2.rollNUm = 464;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNUm);
        System.out.println();
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNUm);
    }
    
    public static class Student {
    String name;
    int age;
    int rollNUm;
    }
}
