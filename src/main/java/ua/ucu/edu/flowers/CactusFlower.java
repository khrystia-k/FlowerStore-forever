package ua.ucu.edu.flowers;

import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class CactusFlower extends Item {
    @Getter
    private double price;

    @Override
    public double price() {
        return getPrice();
    }
    
}
