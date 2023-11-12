package ua.ucu.edu.flower_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ua.ucu.edu.delivery.DHLDeliveryStrategy;
import ua.ucu.edu.delivery.PostDeliveryStrategy;
import ua.ucu.edu.flowers.Item;
import ua.ucu.edu.payment.CreditCardPaymentStrategy;
import ua.ucu.edu.payment.PayPalPaymentStrategy;


class DeliveryTest {

	LinkedList<Item> items = new LinkedList();
	
	@Test
	void testDelivery1() {
		DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
		assertEquals(delivery.delivery(items), "Delivery Type: DHL");
	}

	@Test
	void testDelivery2() {
		PostDeliveryStrategy delivery = new PostDeliveryStrategy();
		assertEquals(delivery.delivery(items), "Delivery Type: Post");
	}

	@Test
	void testPayment1() {
		CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
		assertEquals(payment.pay(56.77), "Payment method: Credit Card");
	}

	@Test
	void testPayment2() {
		PayPalPaymentStrategy payment = new PayPalPaymentStrategy();
		assertEquals(payment.pay(56.77), "Payment method: PayPal");
	}

}
