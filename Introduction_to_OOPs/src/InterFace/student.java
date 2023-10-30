package InterFace;

public class student implements I2{

    @Override
    public void fun1() {
        System.out.println("This is fun 1 function implements by I1 ");
    }

    @Override
    public void fun2(int a, int b) {
        System.out.println("This is fun 2 function implements by I2 inherit by I1 ");
    }
}
