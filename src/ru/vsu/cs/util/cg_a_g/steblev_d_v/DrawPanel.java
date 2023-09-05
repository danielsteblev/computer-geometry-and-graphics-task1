package ru.vsu.cs.util.cg_a_g.steblev_d_v;

import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.Cloud;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.Ship;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.Sun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;
    private Ship ship;
    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();
        this.ship = new Ship(ticksFromStart, 255);





    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        // Рисование фона
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(new Color(41, 166, 225));
        g.fillRect(0, 0, 800, 260);
        g.setColor(new Color(1, 58, 145));
        g.fillRect(0, 260, 800, 210);
        g.setColor(new Color(94, 81, 46));
        g.fillRect(650, 400, 47, 100);
        g.fillRect(710, 380, 47, 100);
        g.setColor(Color.black);
        g.drawRect(650, 400, 47, 100);
        g.drawRect(710, 380, 47, 100);
        g.setColor(new Color(141, 78, 9));
        g.fillRect(0, 450, 800, 130);
        g.setColor(Color.BLACK);
        g.fillRect(0, 450, 800, 2);
        g.fillRect(0, 260, 800, 2);
        for (int i = 0; i < 30; i++) {
            g.drawLine(i * 40 + 30, 450, (i - 5) * 100 + 35, 600);
        }
        g.setColor(Color.BLACK);
        for (int j = 0; j < 18; j++) {
            for (int k = 0; k < 10; k++) {
                g.fillOval((j * 45 + 50), 460, 3, 3);
                g.fillOval((k * 80 + 60), 545, 3, 3);
            }
        }
        ship.setX(ticksFromStart);
        ship.drawShip(gr);

        // Текст
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.BOLD|Font.ITALIC, 33));
        g.drawString("♪ *BIG BAND*", 291, 540);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times", Font.BOLD|Font.ITALIC, 30));
        g.drawString("♪ *BIG BAND*", 300, 540);

        Sun sun = new Sun(450, 15, 80, 80);
        Cloud cloud = new Cloud(100, 10);
        Cloud cloud2 = new Cloud(350, 40);

        sun.drawSun(gr);
        cloud.drawCloud(gr);
        cloud2.drawCloud(gr);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
}
