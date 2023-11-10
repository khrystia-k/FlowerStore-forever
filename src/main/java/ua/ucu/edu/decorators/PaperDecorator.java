package ua.ucu.edu.decorators;

import ua.ucu.edu.flowers.Item;

public class PaperDecorator extends ItemDecorator {

    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription() + " is packed in paper";
    }

    public double getPrice(){
        return 13 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }

    public PaperDecorator(Item item){
        this.item = item;
    }
    
}
