package ua.ucu.edu.delivery;

import java.util.LinkedList;
import ua.ucu.edu.flowers.Item;

public interface Delivery {
    public String delivery(LinkedList<Item> items);
}
