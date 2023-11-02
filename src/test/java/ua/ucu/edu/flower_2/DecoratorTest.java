package ua.ucu.edu.flower_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ua.ucu.edu.flowers.Flower;
import ua.ucu.edu.flowers.FlowerBucket;
import ua.ucu.edu.flowers.PaperDecorator;
import ua.ucu.edu.flowers.RibbonDecorator;

@SpringBootTest
public class DecoratorTest {

    Flower flower = new Flower();
    FlowerBucket fb = new FlowerBucket();

   

    @Test
    void testRibbon(){
        flower.setDescription("Tulip");
        fb.addFlowers(flower);
        RibbonDecorator ribbon = new RibbonDecorator(fb);
        assertEquals("Tulip with ribbon ", fb.getDescription());

    }
    
    @Test
    void testPaper(){
        flower.setDescription("Rose");
        fb.addFlowers(flower);
        PaperDecorator paper = new PaperDecorator(fb);
        assertEquals("Rose is packed in paper", fb.getDescription());
    }

    @Test
    void testPaperRibbon(){
        flower.setDescription("Rose");
        
        PaperDecorator paper = new PaperDecorator(flower);
        RibbonDecorator ribbon = new RibbonDecorator(flower);

        assertEquals("Rose with ribbon is packed in paper", fb.getDescription());

    }
}
