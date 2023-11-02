package ua.ucu.edu.delivery;

import java.util.LinkedList;
import ua.ucu.edu.flowers.Item;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public String delivery(LinkedList<Item> items) {
        return "Delivery Type: Post";
    }
    
}
