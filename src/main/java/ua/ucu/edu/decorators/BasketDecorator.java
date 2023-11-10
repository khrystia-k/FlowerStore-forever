package ua.ucu.edu.decorators;

import ua.ucu.edu.flowers.Item;

public class BasketDecorator extends ItemDecorator{

    Item item;

    @Override
    public String getDescription() {
        return item.getDescription() + "in basket";
    }

    public double getPrice(){
        return 4 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }
    
}
