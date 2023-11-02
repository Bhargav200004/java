public class problem4 {

    public static void main(String[] args) {
        String st = "youcandoit";

        for (char ch : st.toCharArray()){
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 's' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'S'){
                System.out.print(ch);
            }
        }
    }

}
