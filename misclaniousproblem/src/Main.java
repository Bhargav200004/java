import java.util.Arrays;
import java.util.HashSet;

class JobSequence implements Comparable<JobSequence> {
    int deadline;
    int profit;

    JobSequence(int deadline , int profit){
        this.deadline = deadline;
        this.profit = profit;
    }



    @Override
    public String toString() {
        return this.deadline + " " + this.profit;
    }

    @Override
    public int compareTo(JobSequence that) {
        return (that.profit -  this.profit);
    }
}

public class Main {

    public static void main(String[] args) {
        int [] deadline = {3, 1, 2, 2};
        int [] profit = {50, 10, 20, 30};

        int n = deadline.length;
        int maxDeadline = 0;

        int jobCount = 0;
        int maxProfit = 0;

        JobSequence [] jobSequence = new JobSequence[n];

        for (int i = 0; i < n; i++) {
            jobSequence[i] = new JobSequence(deadline[i], profit[i]);
            maxDeadline = Math.max(maxDeadline , deadline[i]);
        }
        Arrays.sort(jobSequence);

        int [] DeadLineArray = new int[maxDeadline + 1];
        Arrays.fill(DeadLineArray, -1);


        for(int i = 0 ; i < n ; i++){
            for(int j = jobSequence[i].deadline  ; j > 0 ; j--){
                if(DeadLineArray[j] == -1 ){
                    maxProfit += jobSequence[i].profit;
                    jobCount++;
                    DeadLineArray[j] = 1;
                    break;
                }
            }
        }

        System.out.println( jobCount + " " +  maxProfit );
    }
}