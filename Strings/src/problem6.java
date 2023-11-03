public class problem6 {

    public static void main(String[] args) {
        String st = "WelCome BaCk";

        char[] ch = st.toCharArray();


        for (int i = 0 ; i < ch.length ; i++){

            int asciiCode = (int)ch[i];

            if (asciiCode == 32){
                continue;
            }

            if (asciiCode >= 97){
                continue;
            }

            asciiCode += 32;

            ch[i] = (char) asciiCode;
        }


        for (char c : ch){
            System.out.print(c);
        }

    }
}
