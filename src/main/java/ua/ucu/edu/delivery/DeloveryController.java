package ua.ucu.edu.delivery;


import java.util.LinkedList;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.ucu.edu.flowers.Flower;
import ua.ucu.edu.flowers.FlowerColor;
import ua.ucu.edu.flowers.Item;

// @RestController
// @RequestMapping("/api/flowers/delivery")
// public class DeloveryController {


//     LinkedList<Item> items = new LinkedList();

//     Flower flower = new Flower(FlowerColor.BLUE, 210, 10);
//     DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
    
//     @GetMapping("/user-choice")
//     public String deliv() {
//         return delivery.delivery(items);
//     }
   
// }
