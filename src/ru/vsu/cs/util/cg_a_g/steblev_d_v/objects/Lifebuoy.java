package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Lifebuoy {
    private int x;
    private int y;
    private int kSize;

    public Lifebuoy(int x, int y, int kSize) {
        this.x = x;
        this.y = y;
        this.kSize = kSize;
    }

    public void drawLifebuoy(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        g.setColor(new Color(225, 77, 0));
        g.setStroke(new BasicStroke(12 * kSize));
        g.drawOval(this.x * kSize, this.y * kSize,  30 * kSize, 30 * kSize);
        g.setStroke(new BasicStroke(1));

        g.setColor(Color.black);
        g.drawOval((this.x - 6) * kSize, (this.y - 6) * kSize, 42 * kSize,42 * kSize);
        g.drawOval((this.x + 6) * kSize, (this.y + 6) * kSize, 18 * kSize,18 * kSize);
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.white);
        g.drawLine((this.x - 6) * kSize, (this.y - 6 + 21) * kSize, (this.x - 6 + 12) * kSize ,(this.y - 6 + 21) * kSize);
        g.drawLine((this.x - 6 + 30) * kSize, (this.y - 6 + 21) * kSize, (this.x - 6 + 12 + 20 + 10) * kSize ,(this.y - 6 + 21) * kSize);
        g.drawLine((this.x - 6 + 21) * kSize, (this.y - 6) * kSize, (this.x - 6 + 21) * kSize,(this.y - 6 + 12) * kSize);
        g.drawLine((this.x - 6 + 21) * kSize, (this.y - 6 + 30) * kSize, (this.x - 6 + 21) * kSize ,(this.y - 6 + 12 + 20 + 10) * kSize);

    }
}
