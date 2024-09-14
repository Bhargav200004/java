import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapSack {

    private static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    private static class ItemComparator implements Comparator<Item> {

        @Override
        public int compare(Item o1, Item o2) {
            return Integer.compare((o2.value / o2.weight), (o1.value / o1.weight));
        }
    }

    public static void main(String[] args) {
        List<Integer> value = List.of(60, 100, 150, 120);
        List<Integer> weight = List.of(10, 20, 50, 15);
        List<Item> itemList = new ArrayList<>();

        for (int i = 0; i < value.size(); i++) {
            Item item = new Item(value.get(i), weight.get(i));
            itemList.add(item);
        }

        itemList.sort(new ItemComparator());

        int W = 10;
        int profit = 0;

        for (int i = 0; i < itemList.size() && W > 0; i++) {
            Item item = itemList.get(i);
            if (item.weight <= W) {
                profit += item.value;
                W -= item.weight;
            } else {
                profit += (item.value / item.weight) * W;
                W = 0;
            }
        }

        System.out.println(profit);

    }
}
