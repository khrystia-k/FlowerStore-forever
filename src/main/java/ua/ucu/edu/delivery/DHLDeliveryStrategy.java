package ua.ucu.edu.delivery;

import java.util.LinkedList;


import ua.ucu.edu.flowers.Item;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String delivery(LinkedList<Item> items) {
        return "Delivery Type: DHL";
    }


}
