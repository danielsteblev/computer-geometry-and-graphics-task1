package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Pier {

    private Fence fence;

    public Pier(Fence fence) {
        this.fence = fence;
    }

    public void drawPier(Graphics g) {

        // Основа причала
        g.setColor(new Color(138, 73, 8));
        g.fillRect(0, 450, 800, 130);
        g.setColor(Color.BLACK);
        for (int i = 0; i < 30; i++) {
            g.drawLine(i * 40 + 30, 450, (i - 5) * 100 + 35, 600);
        }
        g.drawLine(0, 450, 800, 450);
        g.setColor(new Color(138, 73, 8));

        // Гвозди
        g.setColor(Color.black);
        for (int j = 0; j < 18; j++) {
            for (int k = 0; k < 10; k++) {
                g.fillOval((j * 45 + 50), 460, 3, 3);
                g.fillOval((k * 80 + 60), 545, 3, 3);
            }
        }

        fence.drawFence(g);
    }
}
