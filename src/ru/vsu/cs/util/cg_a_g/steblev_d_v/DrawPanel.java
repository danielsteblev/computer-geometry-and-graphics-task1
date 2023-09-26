package ru.vsu.cs.util.cg_a_g.steblev_d_v;

import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.*;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.utils.GetRandom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DrawPanel extends JPanel implements ActionListener {
    private final Timer timer;
    private int ticksFromStart1 = 0;
    private final Pier pier;
    private final Ship bigShip;
    private Ship sh = null;
    private final Ship sh2;
    private final Ship smallShipV2;
    private final Cloud cloudR;
    private final Cloud cloudR2;
    private final Title title;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.title = new Title(291, 540, "♪ *BIG BAND*");
        timer = new Timer(timerDelay, this);
        timer.start();

        this.cloudR = new Cloud(40, 40);
        this.cloudR2 = new Cloud(450, 15);

        this.sh = new SmallShip(GetRandom.getRandom(1, 250), 250, new Color(214, 130, 70));
        this.sh2 = new SmallShip(GetRandom.getRandom(280, 500), 250, new Color(172,140,79));
        this.smallShipV2 = new SmallShipV2(GetRandom.getRandom(530, 700), 245, new Color(223, 154, 182));
        this.bigShip = new BigShip(ticksFromStart1, 255);

        this.pier = new Pier(new Fence(new Poster(625)));

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        /*
        РИСОВАНИЕ ФОНА
         */

        // Небо
        g.setColor(new Color(41, 166, 225));
        g.fillRect(0, 0, 800, 260);

        // Море
        g.setColor(new Color(1, 58, 145));
        g.fillRect(0, 260, 800, 305);

        // Линия горизонта
        g.setColor(Color.black);
        g.fillRect(0, 260, 800, 2);


        smallShipV2.drawShip(gr);
        sh.drawShip(gr);
        sh2.drawShip(gr);
        bigShip.setX(ticksFromStart1);
        bigShip.drawShip(gr);

        cloudR.drawRealityCloud(gr);
        cloudR2.drawRealityCloud(gr);

        pier.drawPier(gr);
        title.printTittle(gr);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart1;
        }
    }
}
