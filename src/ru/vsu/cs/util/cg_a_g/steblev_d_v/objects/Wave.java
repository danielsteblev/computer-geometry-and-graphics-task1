package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import ru.vsu.cs.util.cg_a_g.steblev_d_v.DrawPanel;

import java.awt.*;
import java.awt.geom.GeneralPath;

import static ru.vsu.cs.util.cg_a_g.steblev_d_v.DrawPanel.ticksFromStart1;

public class Wave {
    private int width;
    private double amplitude;
    private double centerY;
    private Color color;

    public Wave(int width, double amplitude, double centerY, Color color) {
        this.width = width;
        this.amplitude = amplitude;
        this.centerY = centerY;
        this.color = color;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.setStroke(new BasicStroke(5));
        for (int x = ticksFromStart1 - 80; x < ticksFromStart1 + 330; x++) {
            int y = (int) (amplitude * Math.sin((2 * Math.PI / 150) * x + DrawPanel.phase) + centerY);
            g.drawLine(x, y, x + 5, y + 5);
        }
        g.setStroke(new BasicStroke(1));
    }
}
