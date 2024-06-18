import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class knapSnackProblem {

     static Map<Integer, Float> sortByValue(Map<Integer, Float> map, boolean reverse) {
        ArrayList<Map.Entry<Integer, Float>> list = new ArrayList<>(map.entrySet());

        // Sort list with a comparator, based on values
        list.sort((o1, o2) -> {
            if (reverse) {
                return Float.compare(o2.getValue(), o1.getValue());
            } else {
                return Float.compare(o1.getValue(), o2.getValue());
            }
        });

        // Convert sorted list back to a map
        Map<Integer, Float> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, Float> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    static float KnapSnack(int [] object , int[] profit , int[] weight , int MaxWeight){

        float ans = 0 ;
        float profitVal = 0;

        float [] storingWeight = new float[object.length];

        HashMap<Integer , Float> storingValues = new HashMap<>();

        for (int i = 0 ; i < object.length ; i++){
            float profitW = (float) profit[i]/weight[i];
            storingValues.put(object[i], profitW );
        }

        Map<Integer, Float > sortedMapDec = sortByValue(storingValues, true);

        int count = 0;
        for (var key : sortedMapDec.keySet()){
            int index = key   - 1;

            if (MaxWeight - weight[index]>0){

                    storingWeight[index] = 1;

                    }
            else {
                storingWeight[index] = 0;
            }

            if (MaxWeight - weight[index] < 0 ) {
                if (count != 1) {
                    storingWeight[index] = (float) MaxWeight / weight[index];
                     count = count + 1;
                }
            }
            else{
                MaxWeight = MaxWeight - weight[index];
            }
        }


        for (int i = 0 ; i < storingWeight.length ; i++){
            ans = storingWeight[i] * profit[i] + ans;
            profitVal =  (storingWeight[i] * weight[i]) + profitVal;
        }

        return ans;

    }

    public static void main(String[] args) {
        int [] object = {1 , 2, 3, 4, 5, 6, 7};
        int [] profit = {10 , 5, 15 , 7 , 6 , 18 , 3};
        int [] weight = {2 , 3, 5 , 7 ,1 , 4, 1};
        int MaxWeight = 15;

        System.out.println(KnapSnack(object , profit , weight , MaxWeight));
    }
}
