public class InterFaceImpl {

    static class tata implements CarsFunctions{

        @Override
        public void start() {
            System.out.println("bhum bhum");
        }

        @Override
        public void engineStart() {
            System.out.println("wyii wyii");
        }

        @Override
        public int sound(int value) {
            return value;
        }

    }

    static class toyota implements CarsFunctions{

        @Override
        public void start() {
            System.out.println("crum crum");
        }

        @Override
        public void engineStart() {
            System.out.println("zzz zzz zzz");
        }

        @Override
        public int sound(int value) {
            return value;
        }

    }

    interface CarsFunctions{
        void start() ;
        void engineStart();
        int sound(int value);
    }

    interface cars{
        void color();
        void size();
    }

    public static void main(String[] args) {
        toyota t1 = new toyota();
        tata t2 = new tata();

        t1.start();
        t1.engineStart();
        System.out.println(t1.sound(50) + "hz");

        t2.start();
        t2.engineStart();
        System.out.println(t2.sound(100) + "hz");
    }

}
