import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaximumMeeting {

    static class Meeting{
        int start;
        int end;
        int meetingNumber;
        Meeting(int start , int end , int meetingNumber){
            this.start = start;
            this.end = end;
            this.meetingNumber = meetingNumber;
        }

        @Override
        public String toString() {
            return "Meeting{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    private static class meetingComparator implements Comparator<Meeting>{

        @Override
        public int compare(Meeting o1, Meeting o2) {
            return Integer.compare(o1.end , o2.end);
        }
    }

    public static void main(String[] args) {
        List<Integer> Start = List.of(1,3,0,5,8,5);
        List<Integer> End = List.of(2,4,6,7,9,9);
        List<Meeting> meetingList = new ArrayList<>();

        for (int i = 0 ; i < Start.size() ; i++){
            meetingList.add( new Meeting(Start.get(i) , End.get(i) , i+1));
        }

        meetingList.sort(new meetingComparator());

        List<Integer> result = new ArrayList<>();
        result.add(meetingList.get(0).meetingNumber);
        Meeting onGoingMeeting = meetingList.get(0);

        for (int i = 1 ; i < meetingList.size() ; i++){
            Meeting currentMeeting = meetingList.get(i);
            if (currentMeeting.start < onGoingMeeting.end){
                result.add(i);
                onGoingMeeting = currentMeeting;
            }
        }

        System.out.println(result);
    }
}
