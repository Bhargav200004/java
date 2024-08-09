import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int costPrice , sellingPrice , profit , loss;
        float profitPercent , lossPercentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost Price price of article:- ");
        costPrice = sc.nextInt();
        System.out.print("Enter selling Price price of article:- ");
        sellingPrice = sc.nextInt();
        if (sellingPrice > costPrice) {
           profit = sellingPrice - costPrice;
           profitPercent = (float) profit /costPrice * 100;
           System.out.println("Profit of article:- " + profit);
           System.out.println("Profit Percent:- " + profitPercent);
        } else if (costPrice > sellingPrice) {
            loss = costPrice - sellingPrice;
            lossPercentage = (float) loss / costPrice * 100;
            System.out.println("Loss of article:- " + loss);
            System.out.println("Loss Percent:- " + lossPercentage);
        }
        else{
            System.out.println("Neither Profit Nor Loss");
        }
    }
}
