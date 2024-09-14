import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaximumActivity {

    static class Activity{
        int start ;
        int end ;

        Activity(int start , int end){
            this.start = start;
            this.end = end;
        }
    }

    private static class comp implements Comparator<Activity>{
        public int compare(Activity o1 , Activity o2){
            return Integer.compare(o1.end , o2.end);
        }
    }

    public static void main(String[] args) {
        List<Integer> start = List.of(1,3,2,5);
        List<Integer> end = List.of(2,4,3,6);

        List<Activity> activityList = new ArrayList<>();

        for (int i = 0 ; i < start.size() ; i++){
            activityList.add(new Activity(start.get(i) ,end.get(i)));
        }

        activityList.sort(new comp());
        int result  = 1;
        Activity onGoingActivity = activityList.get(0);

        for (int i = 1 ; i < activityList.size() ; i++){
               Activity currentActivity =activityList.get(i);
               if (currentActivity.start > onGoingActivity.end){
                   result++;
                   onGoingActivity = currentActivity;
               }
        }

        System.out.println(result);
    }
}
