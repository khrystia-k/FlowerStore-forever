package ua.ucu.edu.decorators;

import ua.ucu.edu.flowers.Item;

public class RibbonDecorator extends ItemDecorator {

    Item item;

    @Override
    public String getDescription() {
        return item.getDescription() + " with ribbon";
    }

    @Override
    public double price() {
        return getPrice();
    }

    public double getPrice(){
        return 40 + item.price();
    }

    public RibbonDecorator(Item item){
        this.item = item;
    }

}
