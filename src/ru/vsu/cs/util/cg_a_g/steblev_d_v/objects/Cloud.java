package ru.vsu.cs.util.cg_a_g.steblev_d_v.objects;

import java.awt.*;

public class Cloud {
    private int x;
    private int y;

    public Cloud(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void drawCloud(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(221, 210, 204));
        g.fillOval(this.x + 70, this.y, 80, 80);
        g.fillOval(this.x + 130, this.y, 80, 80);
        g.fillOval(this.x + 190, this.y, 80, 80);

        //Окантовка
        g.setColor(Color.black);
        g.drawOval(this.x + 70, this.y, 80, 80);
        g.drawOval(this.x + 130, this.y, 80, 80);
        g.drawOval(this.x + 190, this.y, 80, 80);
        g.setColor(new Color(221, 210, 204));
        g.fillRect(this.x + 130, this.y + 15, 130, 50);




    }
}
