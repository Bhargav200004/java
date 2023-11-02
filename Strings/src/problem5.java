public class problem5 {
    public static void main(String[] args) {
        String st = "welcometoscaler";

        char [] ch = st.toCharArray();

        int i = 0 ;
        int j = ch.length -1;

        while(i < j){

            while(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u' && ch[i]!='s'){
                i++;
            }

            while(ch[j]!='a' && ch[j]!='e' && ch[j]!='i' && ch[j]!='o' && ch[j]!='u' && ch[j]!='s'){
                j--;
            }


            if (i > j ) break;

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        System.out.println("After complete");
        for (char c : ch){
            System.out.print(c);
        }
    }

}
