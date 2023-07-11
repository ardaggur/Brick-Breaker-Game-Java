import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Level1 extends JPanel implements KeyListener,Runnable, ActionListener {

        private JFrame frame;
        private JPanel panel;
        private Icon actor;
        private JLabel label1;
        private JLabel label2;
        private JLabel label3;
        private JLabel label4;
        private JLabel label5;
        private JLabel label6;
        private JLabel label7;
        private JLabel label8;
        private JLabel label9;
        private JLabel label10;
        private JLabel label11;
        private JLabel label12;
        private JLabel label13;
        private JLabel label14;
        private JLabel label15;
        private JLabel label16;
        private JLabel label17;
        private JLabel label18;
        private JLabel cubuk;
        private JLabel top;

        private JLabel ScoreTablosu;
        private JLabel CanTablosu;
        private JLabel LevelTablosu;


        boolean cikis = true;

        private int cubukX = 245;
        private int cubukY = 700;
        private int topX = 280;
        private int topY = 600;
        private int kutusayisi=18;
        private int Score = 0;
        private int lives = 3;
        private int level = 1;


        private Icon sarı;
        private Icon turuncu;
        private Icon beyaz;
        private Icon gri;
        private Icon pembe;




        public void createGUI() throws IOException {
            frame = new JFrame("Level 1");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            panel = new AnaMenu("uzay.png");
            panel.setLayout(null);

            actor=new ImageIcon(getClass().getResource("actor.jpg"));
            sarı=new ImageIcon(getClass().getResource("sarı.jpg"));
            turuncu=new ImageIcon(getClass().getResource("turuncu.jpg"));
            beyaz=new ImageIcon(getClass().getResource("beyaz.jpg"));
            gri=new ImageIcon(getClass().getResource("gri.jpg"));
            pembe=new ImageIcon(getClass().getResource("pembe.jpg"));

            ScoreTablosu = new JLabel();
            ScoreTablosu.setText("Score: "+Score);
            ScoreTablosu.setBounds(10,0,100,20);
            ScoreTablosu.setForeground(Color.white);
            panel.add(ScoreTablosu);

            CanTablosu = new JLabel();
            CanTablosu.setText("Lives: "+lives);
            CanTablosu.setForeground(Color.white);
            CanTablosu.setBounds(500,0,100,20);
            panel.add(CanTablosu);

            LevelTablosu = new JLabel();
            LevelTablosu.setText("Level: "+level);
            LevelTablosu.setForeground(Color.white);
            LevelTablosu.setBounds(250,0,100,20);
            panel.add(LevelTablosu);

            label1 = new JLabel(actor);
            label1.setBounds(10, 50, 75, 30);
            panel.add(label1);

            label2 = new JLabel(actor);
            label2.setBounds(100,50,75,30);
            panel.add(label2);

            label3 = new JLabel(actor);
            label3.setBounds(190,50,75,30);
            panel.add(label3);

            label4 = new JLabel(actor);
            label4.setBounds(280,50,75,30);
            panel.add(label4);

            label5 = new JLabel(actor);
            label5.setBounds(370,50,75,30);
            panel.add(label5);

            label6 = new JLabel(actor);
            label6.setBounds(460,50,75,30);
            panel.add(label6);



            label7 = new JLabel(actor);
            label7.setBounds(10,100,75,30);
            panel.add(label7);

            label8 = new JLabel(actor);
            label8.setBounds(100,100,75,30);
            panel.add(label8);

            label9 = new JLabel(actor);
            label9.setBounds(190,100,75,30);
            panel.add(label9);

            label10 = new JLabel(actor);
            label10.setBounds(280,100,75,30);
            panel.add(label10);

            label11 = new JLabel(actor);
            label11.setBounds(370,100,75,30);
            panel.add(label11);

            label12 = new JLabel(actor);
            label12.setBounds(460,100,75,30);
            panel.add(label12);



            label13 = new JLabel(actor);
            label13.setBounds(10,150,75,30);
            panel.add(label13);

            label14 = new JLabel(actor);
            label14.setBounds(100,150,75,30);
            panel.add(label14);

            label15 = new JLabel(actor);
            label15.setBounds(190,150,75,30);
            panel.add(label15);

            label16 = new JLabel(actor);
            label16.setBounds(280,150,75,30);
            panel.add(label16);

            label17 = new JLabel(actor);
            label17.setBounds(370,150,75,30);
            panel.add(label17);

            label18 = new JLabel(actor);
            label18.setBounds(460,150,75,30);
            panel.add(label18);



            cubuk = new JLabel(beyaz);
            cubuk.setBounds(245,700,90,20);
            panel.add(cubuk);



            top = new JLabel(pembe);
            top.setBounds(topX,topY,20,20);
            panel.add(top);


            frame.addKeyListener(this);
            frame.add(panel);
            frame.setSize(555,850);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }

    public void moveBox(int cubukX, int cubukY) {
        cubuk.setBounds(cubukX, cubukY, 90, 20);
    }

    public void moveBox2(int topX,int topY){
            top.setBounds(topX,topY,20,20);
            this.topX = topX;
            this.topY = topY;
            frame.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillOval(topX,topY,20,20);
        //g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(new Rectangle(topX,topY,20,20).intersects(new Rectangle(cubukX,cubukY,90,20)))
        {
            topY = -topY;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int a = e.getKeyCode();


        if (a == KeyEvent.VK_LEFT) {

            moveLeft();

        }
        else if (a == KeyEvent.VK_RIGHT) {

            moveRight();

        }

    }

    public void moveLeft() {

        if(cubukX <= 10) {
            cubukX = 10;
        }

        cubukX -= 20;

        moveBox(cubukX, cubukY);

    }

    public void moveRight() {

        if(cubukX >= 460)
        {
            cubukX = 460;
        }

        cubukX += 20;

        moveBox(cubukX, cubukY);


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        int i = 0;
        int j = 0;


        while(cikis) {
            try {

                if(top.getX() == 0 || top.getX() == 540)
                    i++;

                if(top.getY() == 0 || top.getY() == 770)
                    j++;

                if(top.getY() >= 770)
                {
                    lives--;
                    CanTablosu.setText("Lives: " +lives);


                }

                if(lives == 0)
                {
                    JOptionPane.showMessageDialog(null,"You Lost","Game Over",JOptionPane.ERROR_MESSAGE);
                    cikis=false;
                    System.exit(0);
                }


                if(i % 2 == 0) {
                    topX -= 10;
                    moveBox2(topX, topY);
                    if(j % 2 == 0)
                    {
                        topY -= 10;
                        moveBox2(topX,topY);
                    }else if(j % 2 == 1){
                        topY += 10;
                        moveBox2(topX,topY);
                    }
                } else if(i % 2 == 1) {
                    topX += 10;
                    moveBox2(topX, topY);
                    if (j % 2 == 0) {
                        topY -= 10;
                        moveBox2(topX, topY);
                    } else if (j % 2 == 1) {
                        topY += 10;
                        moveBox2(topX, topY);
                    }
                }

                if(top.getBounds().intersects(cubuk.getBounds()))
                {
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                }
                else if(top.getBounds().intersects(label1.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }

                    }

                    label1.setBounds(-100,-100,0,0);

                }
                else if(top.getBounds().intersects(label2.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label2.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label3.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label3.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label4.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label4.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label5.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label5.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label6.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label6.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label7.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label7.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label8.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label8.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label9.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label9.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label10.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label10.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label11.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label11.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label12.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label12.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label13.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label13.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label14.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label14.setBounds(-100,-100,0,0);

                }
                else if(top.getBounds().intersects(label15.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label15.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label16.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label16.setBounds(-100,-100,0,0);


                }
                else if(top.getBounds().intersects(label17.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label17.setBounds(-100,-100,0,0);

                }
                else if(top.getBounds().intersects(label18.getBounds()))
                {
                    kutusayisi--;
                    Score+=10;
                    ScoreTablosu.setText("Score: " +Score);
                    j++;

                    if(i % 2 == 0) {
                        topX -= 10;
                        moveBox2(topX, topY);
                        if(j % 2 == 0)
                        {
                            topY -= 10;
                            moveBox2(topX,topY);
                        }else if(j % 2 == 1){
                            topY += 10;
                            moveBox2(topX,topY);
                        }
                    } else if(i % 2 == 1) {
                        topX += 10;
                        moveBox2(topX, topY);
                        if (j % 2 == 0) {
                            topY -= 10;
                            moveBox2(topX, topY);
                        } else if (j % 2 == 1) {
                            topY += 10;
                            moveBox2(topX, topY);
                        }
                    }
                    label18.setBounds(-100,-100,0,0);

                }

                if(kutusayisi == 0)
                {
                    JOptionPane.showMessageDialog(null,"Congratulations...\nYou've passed 1st Level.\nYour score is 180","Level 1 Passed...",JOptionPane.INFORMATION_MESSAGE);
                    //cikis = false;
                    //System.exit(0);
                    Level2 level2 = new Level2();
                    try{
                        level2.createGUI();
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                    new Thread(level2).start();
                    return;
                }


                Thread.sleep(30);
            } catch (Exception e) {
            }
        }
    }
}

