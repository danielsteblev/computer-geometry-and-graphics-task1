package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;


import java.awt.*;

public class Cloud {

    private int x;
    private int y;
    private int kSize;

    public Cloud(int x, int y, int kSize) {
        this.x = x;
        this.y = y;
        this.kSize = kSize;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void drawCloud(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(229, 227, 226));

        g.fillRect(this.x, this.y, 40 * kSize, 15 * kSize);
        g.fillOval(this.x - kSize * 5, this.y - kSize * 4, kSize * 15, kSize * 15);
        g.fillOval(this.x - kSize * 10, this.y + kSize * 4, kSize * 13, kSize * 13);
        g.fillOval(this.x + kSize * 5, this.y + kSize * 11, kSize * 23, kSize * 7);
        g.fillOval(this.x + kSize * 25, this.y + kSize * 9, kSize * 10, kSize * 8);
        g.fillOval(this.x + kSize * 33, this.y + kSize * 8, kSize * 15, kSize * 10);
        g.fillOval(this.x + kSize * 38, this.y + kSize * 9, kSize * 25, kSize * 8);
        g.fillOval(this.x + kSize * 48, this.y + kSize * 7, kSize * 8, kSize * 8);
        g.fillOval(this.x + kSize * 53, this.y + kSize * 12, kSize * 8, kSize * 5);
        g.fillOval(this.x + kSize * 37, this.y + kSize * 5, kSize * 10, kSize * 10);
        g.fillOval(this.x + kSize * 5, this.y - kSize * 9, kSize * 18, kSize * 18);
        g.fillOval(this.x + kSize * 20, this.y - kSize * 4, kSize * 8, kSize * 8);
        g.fillOval(this.x + kSize * 28, this.y - kSize * 4, kSize * 15, kSize * 15);
    }
}


