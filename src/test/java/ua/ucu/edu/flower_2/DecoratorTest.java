package ua.ucu.edu.flower_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ua.ucu.edu.decorators.PaperDecorator;
import ua.ucu.edu.decorators.RibbonDecorator;
import ua.ucu.edu.flowers.Flower;
import ua.ucu.edu.flowers.FlowerBucket;



public class DecoratorTest {

    Flower flower = new Flower();
    FlowerBucket bucket = new FlowerBucket();
 

    @Test
    void testRibbon(){
        flower.setDescription("Tulip");

        RibbonDecorator flower_ribbon = new RibbonDecorator(flower);
        assertEquals("Tulip with ribbon", flower_ribbon.getDescription());

    }
    
    @Test
    void testPaper(){
        flower.setDescription("Rose");
        PaperDecorator flower_paper = new PaperDecorator(flower);
        assertEquals("Rose is packed in paper", flower_paper.getDescription());
    }

    @Test
    void testPaperRibbon(){
        flower.setDescription("Rose");
        
        PaperDecorator flower_paper = new PaperDecorator(flower);
        RibbonDecorator flower_ribbon_paper = new RibbonDecorator(flower_paper);

        assertEquals("Rose is packed in paper with ribbon", flower_ribbon_paper.getDescription());

    }

    @Test
    void testBucketRibbon(){
        Flower flower2 = new Flower();
        flower2.setDescription("Jasmine");
        bucket.addFlowers(flower);
        bucket.addFlowers(flower2);
        flower.setDescription("Iris");

        PaperDecorator bucket_paper = new PaperDecorator(bucket);
        RibbonDecorator bucket_ribbon_paper = new RibbonDecorator(bucket_paper);
        assertEquals("Iris, Jasmine in bucket is packed in paper with ribbon", bucket_ribbon_paper.getDescription());
    }
}
