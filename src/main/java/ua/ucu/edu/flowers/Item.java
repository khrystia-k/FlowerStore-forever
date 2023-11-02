package ua.ucu.edu.flowers;

import lombok.Getter;
import lombok.Setter;

public abstract class Item {
    
    @Getter @Setter
    private String description;
    public abstract double price();
}
