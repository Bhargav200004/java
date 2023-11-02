public class problem5 {
    public static void main(String[] args) {
        String st = "welcometoscaler";

        int i = 0 ;
        int j = st.length() -1;

        while(i > j){
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u' || st.charAt(i) == 's'){
                j--;
                if (st.charAt(j) == 'a' || st.charAt(j) == 'e' || st.charAt(j) == 'i' || st.charAt(j) == 'o' || st.charAt(j) == 'u' || st.charAt(j) == 's'){
                    char temp = st.charAt(i);
                    st.charAt(i) = st.charAt(j);
                    st.charAt(j) = temp;

                    i++;
                }
            }
        }
    }

}
