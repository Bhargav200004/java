import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthDistanceBetweenPoints {

    private static class point{
        int x , y , distance;
        point(int x , int y ){
            this.x = x;
            this.y = y;
            this.distance = (int) Math.sqrt(Math.pow(x , 2)  + Math.pow(y , 2));
        }
    }

    private static class pointComparator implements Comparator<point>{
        @Override
        public int compare(point p1, point p2) {
            return Integer.compare(p1.distance, p2.distance);
        }
    }

    public static void main(String[] args) {
        PriorityQueue<point> pointPriorityQueue = new PriorityQueue<>(new pointComparator());
        List<point> pointList = new ArrayList<>();
        int k = 3;
        pointList.add(new point(5 , 3));
        pointList.add(new point(1 , 2));
        pointList.add(new point(3 , 4));
        pointList.add(new point(5 , 6));
        pointList.add(new point(7 , 8));
        pointList.add(new point(9 , 10));

        for (int i = 0 ; i < pointList.size() ; i++){
            if (pointPriorityQueue.size() == k  ){
                if (pointPriorityQueue.peek().distance > pointList.get(i).distance){
                    pointPriorityQueue.poll();
                    pointPriorityQueue.add(pointList.get(i));
                }
                continue;
            }
            pointPriorityQueue.add(pointList.get(i));
        }

        int prorityListSize = pointPriorityQueue.size();
        for (int i = 0 ; i < prorityListSize ; i++){
            assert pointPriorityQueue.peek() != null;
            int x = pointPriorityQueue.peek().x;
            int y = pointPriorityQueue.peek().y;
            System.out.printf("(%d , %d) \n" , x,y);
            pointPriorityQueue.poll();
        }

    }
}
