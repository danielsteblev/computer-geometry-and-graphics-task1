package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship;

import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship.Ship;

import java.awt.*;

public class SmallShipV2 extends Ship {
    private int x;
    private int y;
    private Color color;

    public SmallShipV2(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void drawShip(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;


        // Основа
        g.setColor(color);
        g.fillRect(this.x + 24, this.y - 7, 36, 7);
        g.fillPolygon(new int[]{this.x, this.x + 80, this.x + 60, this.x + 20}, new int[] {this.y, this.y, this.y + 15, this.y + 15}, 4);
        g.setColor(Color.black);
        g.drawRect(this.x + 24, this.y - 7, 36, 7);
        g.drawPolygon(new int[]{this.x, this.x + 80, this.x + 60, this.x + 20}, new int[] {this.y, this.y, this.y + 15, this.y + 15}, 4);


        // Паруса
        g.setColor(Color.white);
        g.fillPolygon(new int[] {this.x + 45, this.x + 34 , this.x + 80}, new int[] {this.y - 67, this.y - 8, this.y - 12}, 3 );
        g.setColor(color.black);
        g.drawPolygon(new int[] {this.x + 45, this.x + 34 , this.x + 80}, new int[] {this.y - 67, this.y - 8, this.y - 12}, 3 );
        g.drawLine(this.x + 45, this.y, this.x + 45, this.y - 65);

    }
}
