package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Sun {
    private int x;
    private int y;
    private int width;
    private int height;

    public Sun(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawSun(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(244, 169, 0));
        g.fillOval(this.x, this.y, this.width, this.height);
        g.setColor(Color.black);
        g.drawOval(this.x, this.y, this.width, this.height);


    }
}
