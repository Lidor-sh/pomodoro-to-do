package com.lidorsh.pomodoro.ui;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

    enum Page {
        Today,
        Tomorrow,
        Upcoming,
        Someday,
        Completed
    }

    Dimension screenSize;

    public GUI() {

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(null);

        screenSize = Toolkit.getDefaultToolkit().getScreenSize();


        //create buttons
        JButton todayBtn = new JButton("Today                                  8.3h 8");
        todayBtn.setBackground(new Color(238, 238, 238));
        todayBtn.setBounds(10, 10, 260, 30);
        todayBtn.setBorder(new RoundedBorder(10));
//        todayBtn.setPreferredSize(new Dimension(270, 10));
//        todayBtn.setLocation(10, 10);

        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1050,725));
        this.setLocation(screenSize.width/2-this.getSize().width/2, screenSize.height/2-this.getSize().height/2);
        this.setBackground(new Color(243,244,246));
        this.setTitle("Pomodoro To-Do");

        //add buttons
        this.add(todayBtn);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, 290, this.getSize().height);
    }

}
