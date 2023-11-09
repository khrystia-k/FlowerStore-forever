package ua.ucu.edu.flowers;

import java.util.List;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class FlowerBucket extends Item {

    private List<Flower> flowers = new ArrayList<>();

    @Override
    public double price() {
        double price = 0;
        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        return price;
    }

    
    public void addFlowers(Flower flower) {
        flowers.add(flower);
    }


    public void searchFlower(Flower flower){
       if (flowers.contains(flower)){
        System.out.println("Flower is found.");
       }
       else{
        System.out.println("Flower is not found.");
       }
    }

    public String getDescription() {

        int n = flowers.size();
        String description = "";

        for (int i = 0; i < n; i++) {

            if( i == (n-1)){
                description += flowers.get(i).getDescription();
            }
            else{
                description += flowers.get(i).getDescription() + ", ";
            }
            
        }
        return description + " in bucket";
    }
}


