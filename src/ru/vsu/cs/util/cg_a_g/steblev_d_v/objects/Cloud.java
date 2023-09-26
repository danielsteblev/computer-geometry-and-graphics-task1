package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Cloud {

    private int x;
    private int y;

    public Cloud(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void drawRealityCloud(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(229, 227, 226));
        g.fillRect(this.x, this.y, 160, 60);
        g.fillOval(this.x - 20, this.y - 15, 60, 60);
        g.fillOval(this.x - 40, this.y + 15, 50, 50);
        g.fillOval(this.x + 20, this.y + 45, 90, 25);
        g.fillOval(this.x + 100, this.y + 35, 40, 30);
        g.fillOval(this.x + 130, this.y + 30, 60, 40);
        g.fillOval(this.x + 150, this.y + 35, 100, 30);
        g.fillOval(this.x + 190, this.y + 25, 30, 30);
        g.fillOval(this.x + 210, this.y + 45, 30, 20);
        g.fillOval(this.x + 145, this.y + 20, 40, 40);
        g.fillOval(this.x + 20, this.y - 35, 70, 70);
        g.fillOval(this.x + 80, this.y - 15, 30, 30);
        g.fillOval(this.x + 110, this.y - 15, 60, 60);

    }
}
