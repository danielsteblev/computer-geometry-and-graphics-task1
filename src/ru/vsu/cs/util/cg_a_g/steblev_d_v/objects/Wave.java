package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Wave {
    private int x, y;
    private int height;
    private int phase;
    private Color color;

    private BasicStroke basicStroke;

    public Wave (int x, int y, int height, Color color, BasicStroke basicStroke) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.phase = 0;
        this.color = color;
        this.basicStroke = basicStroke;
    }

    public void draw(Graphics2D g) {
        GeneralPath path = new GeneralPath();
        path.moveTo(x, y);

        for (int i = 0; i <= height; i += 10) {
            int offsetX = (int) (10 * Math.sin(Math.toRadians(i + phase)));
            path.lineTo(x + offsetX, y - i);
        }

        g.setColor(color);
        g.setStroke(basicStroke);
        g.draw(path);

    }

    public void animate() {
        phase += 5;
        if (phase > 360) {
            phase -= 360;
        }
    }
}
