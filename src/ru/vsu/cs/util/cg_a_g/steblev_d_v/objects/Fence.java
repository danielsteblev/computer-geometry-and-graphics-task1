package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Fence {

    private Poster poster;

    public Fence(Poster poster) {
        this.poster = poster;
    }

    public void drawFence(final Graphics gr){
        Graphics2D g = (Graphics2D) gr;

        // Вертикальные брусья
        g.setColor(new Color(138, 73, 8));
        for(int i = 0; i < 10; i++){
            g.fillRect((i + 1) * 80, 350, 20, 100);
        }

        for(int i = 0; i < 10; i++){
            g.setColor(Color.black);
            g.drawRect((i + 1) * 80, 350, 20, 100);
        }

        // Горизонтальный брус
        g.setColor(new Color(138, 73, 8));
        g.fillRect(-1, 365, 1000, 20);
        g.fillRect(-1, 415, 1000, 20);
        g.setColor(Color.BLACK);
        g.drawRect(-1,365, 1000, 20);
        g.drawRect(-1,415, 1000, 20);

        poster.drawPoster(gr);
    }
}
