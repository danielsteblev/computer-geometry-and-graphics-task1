package ru.vsu.cs.util.cg_a_g.steblev_d_v;

import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.*;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship.BigShip;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship.Ship;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship.SmallShip;
import ru.vsu.cs.util.cg_a_g.steblev_d_v.objects.ship.SmallShipV2;
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

    private final Cloud cloud1;
    private final Cloud cloud2;
    private final Cloud cloud3;
    private final Cloud cloud4;
    private final Cloud cloud5;
    private final Cloud cloud6;

    private final Title title;
    private final Lifebuoy lifebuoy1;
    private final Lifebuoy lifebuoy2;



    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.title = new Title(291, 540, "♪ *BIG BAND*");
        timer = new Timer(timerDelay, this);
        timer.start();

        this.cloud1 = new Cloud(40, 40, 4);
        this.cloud2 = new Cloud(450, 15, 4);
        this.cloud3 = new Cloud(330, 100, 2);
        this.cloud4 = new Cloud(520, 115, 2);
        this.cloud5 = new Cloud(360, 160, 1);
        this.cloud6 = new Cloud(90, 130, 1);

        this.sh = new SmallShip(GetRandom.getRandom(1, 250), 250, new Color(214, 130, 70));
        this.sh2 = new SmallShip(GetRandom.getRandom(280, 500), 250, new Color(172,140,79));
        this.smallShipV2 = new SmallShipV2(GetRandom.getRandom(530, 700), 245, new Color(223, 154, 182));
        this.bigShip = new BigShip(ticksFromStart1, 255);

        this.pier = new Pier(new Fence(new Poster(GetRandom.getRandom(1, 700))));
        this.lifebuoy1 = new Lifebuoy(GetRandom.getRandom(1, 100), 185, 2);
        this.lifebuoy2 = new Lifebuoy(GetRandom.getRandom(200, 300), 185, 2);


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



        cloud1.drawCloud(gr);
        cloud2.drawCloud(gr);
        cloud3.drawCloud(gr);
        cloud4.drawCloud(gr);
        cloud5.drawCloud(gr);
        cloud6.drawCloud(gr);


        smallShipV2.drawShip(gr);
        sh.drawShip(gr);
        sh2.drawShip(gr);
        bigShip.setX(ticksFromStart1);
        bigShip.drawShip(gr);


        pier.drawPier(gr);
        title.printTittle(gr);

        lifebuoy1.drawLifebuoy(gr);
        lifebuoy2.drawLifebuoy(gr);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart1;
        }
    }
}
