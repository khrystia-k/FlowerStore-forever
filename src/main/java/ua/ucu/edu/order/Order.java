package ua.ucu.edu.order;

import java.util.LinkedList;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.ucu.edu.delivery.Delivery;
import ua.ucu.edu.flowers.Item;
import ua.ucu.edu.payment.Payment;

@NoArgsConstructor @AllArgsConstructor
public class Order {

    
    private LinkedList<Item> items;
    @Setter
    private Payment payment;
    @Setter
    private Delivery delivery;

    public double calculateTotalPrice() {

        double price = 0;
        for (Item item : items){
            price += item.price();
        }
        return price;
    }

    public String proccessOrder(){

        double price = calculateTotalPrice();
        String clientPayment = payment.pay(price);
        String clientDelivery =  delivery.delivery(items);
        return "YourOrder :\nitems : " + items.toString()
        + ",\npaymentStrategy : " + clientPayment
               + ",\n deliveryStrategy : " + clientDelivery
               + ",\n totalPrice : " + price;

    }

    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }

}
   
    

