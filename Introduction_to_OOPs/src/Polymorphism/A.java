package Polymorphism;

public class A {
    void check(int val1,String val2){
        System.out.println("This method takes one variable as input");
    }

    void check(String val1, int val2){
        System.out.println("This method takes two variable as input");
    }

    void test(){
        System.out.println("This is test of class A");
    }

}
