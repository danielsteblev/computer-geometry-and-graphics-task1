package ru.vsu.cs.util.cg_a_g.steblev_d_v;

import java.awt.*;

public class Ship {

    private int x;
    private int y;

    public Ship(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void drawPicture(final Graphics gr){
        Graphics2D g = (Graphics2D) gr;

        // Нижняя часть корабля
        g.setColor(new Color(147, 8, 3));
        g.fillRect(this.x, this.y, 302, 32);
        g.setColor(Color.BLACK);
        g.fillRect(this.x, this.y, 350, 2);
        g.fillRect(this.x, this.y + 30, 302, 2);
        g.fillRect(this.x, this.y + 30, 300, 2);
        g.drawLine(this.x, this.y, this.x, this.y + 30);
        g.setColor(new Color(147, 8, 3));
        g.fillPolygon(new int[] {this.x + 270, this.x + 352, this.x + 304}, new int[] {257, 257, 286}, 3);
        g.setColor(Color.BLACK);
        g.drawLine(this.x + 303, 285, this.x + 351, 255);

        // Основа корабля
        g.setColor(new Color(220, 216, 213));
        g.fillRect(this.x, this.y - 55, 350, 55);
        g.fillPolygon(new int[] {this.x, this.x + 400, this.x + 355}, new int[] {200, 200, 255}, 3);
        g.setColor(Color.BLACK);
        g.drawLine(this.x + 352, 255, this.x + 402, 200);
        g.setColor(new Color(41, 166, 225));
        g.fillRect(this.x, this.y - 55, 120, 15);

        // Кабина
        g.setColor(new Color(220, 216, 213));
        g.fillRect(this.x + 150, this.y - 80, 160, 40);
        g.setColor(new Color(150, 145, 149));
        g.fillPolygon(new int[] {this.x + 100, this.x + 150, this.x + 150}, new int[] {this.y - 40, this.y - 40 , this.y - 80}, 3);
        g.setColor(new Color(220, 216, 213));
        g.fillRect(this.x + 120, this.y - 55, 200,30);
        g.setColor(new Color(220, 216, 213));
        g.fillRect(this.x + 185, this.y - 105, 100, 40);
        g.fillPolygon(new int[] {this.x + 165, this.x + 185, this.x + 185}, new int[] {this.y - 75, this.y - 75, this.y - 105}, 3);
        g.fillPolygon(new int[] {this.x + 300, this.x + 285, this.x + 285}, new int[] {this.y - 75, this.y - 75, this.y - 105}, 3);
        g.fillRect(this.x + 200, this.y - 140, 40, 35);


        




    }
}
