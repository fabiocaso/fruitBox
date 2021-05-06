import java.util.*;

public class Fruit {


    public HashMap<String, Integer> fruitPricePerKg() {

        HashMap<String, Integer> fruitPriceList = new HashMap<>();

        fruitPriceList.put("Orange", 2);
        fruitPriceList.put("Apple", 4);
        fruitPriceList.put("Lemon", 1);
        fruitPriceList.put("Avocado", 10);
        fruitPriceList.put("Banana", 7);
        fruitPriceList.put("Strawberry", 7);
        fruitPriceList.put("Cherries", 13);
        fruitPriceList.put("Clementines", 2);

        return fruitPriceList;
    }


    public HashMap<String, Double> fruitWeight() {

        HashMap<String, Double> fruitWeightList = new HashMap<>();

        fruitWeightList.put("Orange", 0.300);
        fruitWeightList.put("Apple", 0.300);
        fruitWeightList.put("Lemon", 0.200);
        fruitWeightList.put("Strawberry", 0.500);
        fruitWeightList.put("Avocado", 0.400);
        fruitWeightList.put("Banana", 0.900);
        fruitWeightList.put("Cherries", 0.200);
        fruitWeightList.put("Clementines", 0.500);

        return fruitWeightList;
    }


}
