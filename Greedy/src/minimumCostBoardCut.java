import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class minimumCostBoardCut {

    public static void main(String[] args) {
        List<Integer> X = new ArrayList<>(List.of(2, 1, 3, 1, 4));
        List<Integer> Y = new ArrayList<>(List.of(4, 1, 2));
        int M = 6, N = 4;
        X.sort(Comparator.reverseOrder());
        Y.sort(Comparator.reverseOrder());

        int totalCost = 0;
        int horizontalCuts = 1;
        int verticalCuts = 1;

        int i = 0, j = 0;

        while (i < M - 1 && j < N - 1) {
            if (X.get(i) > Y.get(j)) {
                totalCost += X.get(i) * horizontalCuts;
                verticalCuts++;
                i++;
            } else {
                totalCost += Y.get(j) * verticalCuts;
                horizontalCuts++;
                j++;
            }
        }

        while (i < M - 1){
            totalCost += X.get(i) * horizontalCuts;
            i++;
        }

        while (j < N - 1){
            totalCost += Y.get(j) * verticalCuts;
            j++;
        }
        System.out.println(totalCost);


    }
}
