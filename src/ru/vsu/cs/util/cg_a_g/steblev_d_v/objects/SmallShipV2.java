package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class SmallShipV2 {
    private int x;
    private int y;
    private Color color;

    public SmallShipV2(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void drawSmallShipV2(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(color);
        g.fillRect(this.x, this.y, 40, 15);
        g.fillRect(this.x + 10, this.y - 5, 30, 10);
        g.fillPolygon(new int[] {this.x + 40, this.x + 40 , this.x + 60}, new int[] {this.y, this.y + 15, this.y}, 3 );
        g.fillPolygon(new int[] {this.x, this.x , this.x - 20}, new int[] {this.y, this.y + 15, this.y}, 3 );
        g.setColor(color.black);
        g.drawRect(this.x, this.y, 40, 15);
        g.drawPolygon(new int[] {this.x + 40, this.x + 40 , this.x + 60}, new int[] {this.y, this.y + 15, this.y}, 3 );
        g.drawPolygon(new int[] {this.x, this.x , this.x - 20}, new int[] {this.y, this.y + 15, this.y}, 3 );
        g.drawRect(this.x + 10, this.y - 5, 30, 10);


        g.setColor(Color.white);
        g.fillPolygon(new int[] {this.x + 25, this.x + 15 , this.x + 60}, new int[] {this.y - 55, this.y - 5, this.y - 13}, 3 );
        g.setColor(color.black);
        g.drawPolygon(new int[] {this.x + 25, this.x + 15 , this.x + 60}, new int[] {this.y - 55, this.y - 5, this.y - 13}, 3 );
        g.drawLine(this.x + 25, this.y, this.x + 25, this.y - 55);

        g.setColor(color);
        g.fillRect(this.x - 1, this.y, 43, 14);
    }
}
