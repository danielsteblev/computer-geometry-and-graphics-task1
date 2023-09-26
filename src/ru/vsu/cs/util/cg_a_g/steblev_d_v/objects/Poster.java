package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Poster {

    private int x;
    private int y;

    public Poster(int posterX) {
        this.x = posterX;
        this.y = 355;
    }

    public void drawPoster(Graphics g) {
        // 625, 355
        // Рисование постера
        g.setColor(new Color(230, 176, 7));
        g.fillRect(x, y, 50, 70);
        g.setColor(Color.black);
        g.drawRect(x + 5, y + 5, 40, 60);
        g.drawRect(x, y, 50, 70);
        g.setFont(new Font("Times", Font.BOLD, 8));
        g.drawString("DANGER", x + 7, y + 25);
        g.setFont(new Font("Times", Font.PLAIN, 35));
        g.drawString("☠\uFE0F", x  + 7, y + 55);
    }
}
