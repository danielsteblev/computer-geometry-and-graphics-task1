package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class SmallShip {
    private int x;
    private int y;

    private Color color;

    public SmallShip(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }


    public void drawSmallShip(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(color);

        // Основа
        g.fillRect(this.x, this.y, 70,  10);
        g.fillRect(this.x + 30, this.y - 5 , 25, 5);




        // Окантовка
        g.setColor(Color.black);
        g.drawRect(this.x, this.y, 70, 10);
        g.drawRect(this.x + 30, this.y - 5 , 25, 5);

        // Мачта
        g.drawLine(this.x + 50, this.y, this.x + 50, this.y - 90);


        // Паруса
        g.setColor(Color.white);
        g.fillPolygon(new int[] {this.x + 50, this.x - 10, this.x + 40}, new int[] {this.y - 90, this.y - 10, this.y - 5}, 3);

        // Окантовка парусов
        g.setColor(Color.BLACK);
        g.drawPolygon(new int[] {this.x + 50, this.x - 10, this.x + 40}, new int[] {this.y - 90, this.y - 10, this.y - 5}, 3);




    }
}
