import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NonOverlappingInterval {

    private static class Interval{
        int startTime;
        int endTime;
        Interval(int startTime , int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return "Interval{" + "startTime=" + startTime + ", endTime=" + endTime + '}';
        }
    }


    static class IntervalComparator implements Comparator<Interval>{

        @Override
        public int compare(Interval o1, Interval o2) {
            return Integer.compare(o1.startTime , o2.startTime);
        }
    }


    public static void main(String[] args) {
        List<Interval> intervalList = new ArrayList<>();

        intervalList.add(new Interval(1,2));
        intervalList.add(new Interval(2,3));
        intervalList.add(new Interval(3,4));
        intervalList.add(new Interval(1,3));

        intervalList.sort(new IntervalComparator());


        System.out.println(intervalList);

        int result = 0;

        int previousEndTime = intervalList.get(0).endTime;
        for (int i = 1 ; i < intervalList.size() ; i++){
            Interval current = intervalList.get(i);
            if (current.startTime < previousEndTime){
                previousEndTime = Math.min(current.endTime , previousEndTime);
                result++;
            }
            else{
                previousEndTime = current.endTime;
            }
        }

        System.out.println(result);



    }
}
