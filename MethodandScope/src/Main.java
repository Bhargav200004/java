class Algebra{

    //                                            It is class level scope
    int a =12; //member variable  it can access anywhere in class
    int b=20;

    //                                             It is local level scope
    int add(){
        int p=200;     // it can access only in local like add not outside the add function
        int q=100;
        return p+q;
    }

    int sub(){
        return a-b;
    }

    //                                        It is block level scope (In code so many code blocks can create)
    void demo(){
        int z=20;
        System.out.println(z);
        System.out.println();  // it can access only on block of code like in curly bracket({})

        {
           int m=200;   //it access only on block level
            System.out.println(m); //here 200 is print
        }

        {
            int m=300;
            System.out.println(m); //here 300 is print
        }
    }

}

public class Main {

    static void changeValue(int a){
        a *= 100;
    }
    public static void main(String[] args){
//    Algebra obj1=new Algebra();
//    obj1.demo();
        int a=10;
        System.out.println("print before value" +a);
        changeValue(a);
        System.out.println("print after value" +a);
        int b=20;
        System.out.println("print before value " +b);
        changeValue(b);
        System.out.println("print after value" +b);




    }
}
