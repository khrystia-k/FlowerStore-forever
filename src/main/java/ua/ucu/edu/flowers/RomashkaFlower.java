package ua.ucu.edu.flowers;

import lombok.Getter;

public class RomashkaFlower extends Item {
    @Getter
    private double price;

    @Override
    public double price() {
        return getPrice();
    }
    
}
