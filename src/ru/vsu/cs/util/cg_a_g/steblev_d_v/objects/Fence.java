package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Fence {

    private Integer START_X = 0;
    private Integer START_Y = 450;

    public Fence() {
        this.START_X = START_X;
        this.START_Y = START_Y;
    }

    public void drawFence(final Graphics gr){
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(138, 73, 8));
        g.fillRect(0, 450, 800, 130);
        g.setColor(Color.BLACK);
        g.drawLine(0, 450, 800, 450);
        g.fillRect(0, 260, 800, 2);
        for (int i = 0; i < 30; i++) {
            g.drawLine(i * 40 + 30, 450, (i - 5) * 100 + 35, 600);
        }
        g.setColor(new Color(138, 73, 8));
        for(int i = 0; i < 10; i++){
            g.fillRect((i + 1) * 80, 350, 20, 100);
        }

        for(int i = 0; i < 10; i++){
            g.setColor(Color.black);
            g.drawRect((i + 1) * 80, 350, 20, 100);
        }
        g.setColor(new Color(138, 73, 8));
        g.fillRect(-1, 365, 1000, 20);
        g.fillRect(-1, 415, 1000, 20);
        g.setColor(Color.BLACK);
        g.drawRect(-1,365, 1000, 20);
        g.drawRect(-1,415, 1000, 20);
        for (int j = 0; j < 18; j++) {
            for (int k = 0; k < 10; k++) {
                g.fillOval((j * 45 + 50), 460, 3, 3);
                g.fillOval((k * 80 + 60), 545, 3, 3);
            }
        }
        g.setColor(new Color(230, 176, 7));
        g.fillRect(625, 355, 50, 70);
        g.setColor(Color.black);
        g.drawRect(630, 360, 40, 60);
        g.drawRect(625, 355, 50, 70);
        g.setFont(new Font("Times", Font.BOLD, 8));
        g.drawString("DANGER", 632, 380);
//        g.drawString("ZONE", 633, 394);
        g.setFont(new Font("Times", Font.PLAIN, 35));
        g.drawString("☠\uFE0F", 632, 410);
    }
}
