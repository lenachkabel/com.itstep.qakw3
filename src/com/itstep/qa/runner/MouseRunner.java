package com.itstep.qa.runner;

import com.itstep.qa.mouse.Bush;
import com.itstep.qa.mouse.Mouse;

import java.util.Random;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse mouse = new Mouse(2.2, 3.3);
        System.out.println();
        Random random = new Random(+2);
        Random random1 = new Random(+5);
        Mouse mouse1 = new Mouse(1.1,3.3,"белый");
        Mouse mouse2 = new Mouse(2.2, 2.3,"черный");
        Mouse mouse3 = new Mouse(2.3, 2.3,"красный");
        Mouse mouse4 = new Mouse(2.4, 2.3,"зеленый");
        Mouse mouse5 = new Mouse(2.5, 2.3,"оранжевый");

        System.out.println("Победила мышь Апокалиптина, она нашла куст в координатах "+
                " и перекрасилась в цвет Баклажановый");
        Bush [] bush = new Bush[18];
        







    }
}
