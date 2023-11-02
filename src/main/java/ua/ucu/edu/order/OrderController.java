package ua.ucu.edu.order;

import java.util.Arrays;
import java.util.LinkedList;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.ucu.edu.flowers.Flower;
import ua.ucu.edu.flowers.FlowerColor;
import ua.ucu.edu.flowers.Item;


// @RestController
// @RequestMapping("/api/flowers/order")
// public class OrderController {

//     private Order order = new Order(new LinkedList<Item>(Arrays.asList(
//         new Flower(FlowerColor.BLUE, 21, 102),
//         new Flower(FlowerColor.RED, 23, 230))),
//     null, null);

    
//     @GetMapping("/user-order")
//     public String showOrder(){
//         return order.proccessOrder();
//     }

    
// }
