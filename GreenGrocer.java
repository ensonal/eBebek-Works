import java.util.HashMap;
import java.util.Scanner;


public class GreenGrocer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double totalCost = 0;
        
        HashMap<String,Double> products = new HashMap<>();
        products.put("Pear", 2.14);
        products.put("Apple", 3.67);
        products.put("Tomato",1.11);
        products.put("Banana", 0.95);
        products.put("Eggplant", 5.0);

        for(HashMap.Entry<String, Double> pairs : products.entrySet()) {
            System.out.println(pairs.getKey() + " How many weight?");
            double weight = input.nextDouble();
            double cost = weight * pairs.getValue();
            totalCost += cost;
        }

        System.out.println("Total cost : " + totalCost);
    }
    
}
