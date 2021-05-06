import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Packaging {

    Fruit fruit = new Fruit();

    public void packageCreator() {
        int i = 1;
        System.out.println("****Package weight max is 1Kg ****\n");

        ArrayList<Double> price = new ArrayList<>();

        Double totalWeight = 0.0;
        HashMap<String, Double> pack = new HashMap<>();

        for (Map.Entry<String, Double> mapEntry : fruit.fruitWeight().entrySet()) {

            String fruitType = mapEntry.getKey();
            Double fruitWeight = mapEntry.getValue();

            totalWeight = totalWeight + fruitWeight;

            if (totalWeight <= 1.00) {

                pack.put(fruitType, fruitWeight);
                Double fruitPrice = fruitWeight * fruit.fruitPricePerKg().get(fruitType);
                price.add(fruitWeight * fruit.fruitPricePerKg().get(fruitType));

                System.out.println(" PACKAGE  " + i + "-> fruit: " + fruitType + " | weight: " + fruitWeight + "Kg | price: " + String.format("%.2f", fruitPrice) + "€\n");


            } else {

                // Counting the number of packages
                i++;

                // Calculating the Box Price
                priceCalculator(price, i - 1);

                // Calculating the Box Weight
                weightCalculator(pack, i - 1);

                // Reset total Weight / price / pack
                totalWeight = reset(price, pack);
            }

        }
    }


    private Double reset(ArrayList<Double> price, HashMap<String, Double> pack) {
        Double totalWeight;
        totalWeight = 0.0;
        price.clear();
        pack.clear();
        return totalWeight;
    }

    private void weightCalculator(HashMap<String, Double> pack, int i) {
        Double boxWeight = pack.values().stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println("-----> PACKAGE " + i + "  Total Weight: " + String.format("%.2f", boxWeight) + " Kg\n");
    }

    private void priceCalculator(ArrayList<Double> price, int i) {
        Double boxPrice = price.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println("----->  PACKAGE " + i + " Total Price: " + String.format("%.2f", boxPrice) + "€");
        System.out.println("        *Packaging fee not included: 1€\n");
    }

}

