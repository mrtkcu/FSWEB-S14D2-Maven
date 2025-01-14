package org.example;

import org.example.model.*;
import org.example.model.enums.PaintColor;

import static org.example.model.enums.LampType.LAVA;
import static org.example.model.enums.PaintColor.RED;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("sovyet apartman odası",new Wall("bir"),new Wall("iki"),new Wall("üç"),new Wall("dört"),new Ceiling(5,RED),new Bed("sert", 2, 3,4,2),new Lamp(LAVA,true,15), new Wardrobe(3,3,50),new Carpet(1,1,RED));

    }
}