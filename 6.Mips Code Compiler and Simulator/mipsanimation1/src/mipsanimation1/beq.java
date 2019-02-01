package mipsanimation1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import mipsanimation1.home.*;

public class beq extends animation{
    
    public beq(home bahaa) {
        super(bahaa);
    }
    public void paintComponent(Graphics g)
    {
    super.paintComponent(g);
    this.setBackground(Color.black);
    g.setColor(Color.GREEN);
    g.drawLine(466, 165, 850, 165);//1
    wire1.setText("1");
    wire1.setForeground(Color.GREEN);
    
   g.drawLine(478, 195, 960, 195);//2
   g.drawLine(960, 195, 960, 120);//2_1
   wire2.setText("1");
   wire2.setForeground(Color.green);
   
    g.setColor(Color.red);
   g.drawLine(480, 205, 1020, 205);//3
   g.drawLine(1020, 205, 1020, 450);//3_1
   g.drawLine(1020, 450, 880, 450);//3_2
   g.drawLine(880, 450, 880, 400);//3_3
   wire3.setText("0");
   wire3.setForeground(Color.red);
  
    g.drawLine(480, 215, 980, 215);//4
   g.drawLine(980, 215, 980, 330);//4_1
   wire4.setText("0");
   wire4.setForeground(Color.red);
  
     g.drawLine(477, 225, 880, 225);//5
   g.drawLine(880, 225, 880, 300);//5_1
   wire5.setText("0");
   wire5.setForeground(Color.red);
  
   g.setColor(Color.green);
   g.drawLine(475, 235, 675, 235);//6
   g.drawLine(675, 235, 675, 482);//6_1
   wire6.setText("01");
   wire6.setForeground(Color.green);
   
   g.setColor(Color.red);
   g.drawLine(470, 245, 640, 245);//7
   g.drawLine(640, 245, 640, 330);//7_1
   wire7.setText("1");
   wire7.setForeground(Color.red);
   
   g.drawLine(465, 255, 530, 255);//8
   g.drawLine(530, 255, 530, 270);//8_1
   wire8.setText("1");
   wire8.setForeground(Color.red);
   
    g.setColor(Color.blue);
    g.drawLine(790, 325, 810, 325);//9
    g.drawLine(810, 325, 810, 180);//9_1
    g.drawLine(810, 180, 850, 180);//9_2
    //wire9.setText("0");
    wire9.setForeground(Color.blue);
    
     g.setColor(Color.blue);
    g.drawLine(890, 170, 910, 170);//10
    g.drawLine(910, 170, 910, 120);//10_1
    //wire10.setText("1");
    wire10.setForeground(Color.blue);
    
    g.setColor(Color.magenta);
    g.drawLine(970, 100, 1000, 100);//11
    g.drawLine(1000, 100, 1000, 10);//11_1
    g.drawLine(1000, 10, 50, 10);//11_2
    g.drawLine(50, 10, 50, 340);//11_3
    g.drawLine(50, 340, 100, 340);//11_4
    g.fillPolygon(x4, y4, na);//11_5
    //wire11.setText((printPc()+4)+"");
    wire11.setForeground(Color.magenta);
   
    g.setColor(new Color(255, 86, 109));
    g.drawLine(150, 340, 250, 340);//12
    g.fillPolygon(x5, y5, na);//12_1
    //wire12.setText(printPc()+"");
    wire12.setForeground(new Color(255, 86, 109));
    
   g.drawLine(200, 340, 200, 130);//13
    g.drawLine(200, 130, 260, 130);//13_1
    g.fillPolygon(x6, y6, na);//13_2
    //wire13.setText(printPc()+"");
    wire13.setForeground(new Color(255, 86, 109));
    
     g.setColor(Color.green);
    g.drawLine(200, 50, 260, 50);//14
    g.fillPolygon(x7, y7, na);//14_1
    wire14.setText("+4");
    wire14.setForeground(Color.green);
    
     g.setColor(Color.yellow);
    g.drawLine(340, 95, 700, 95);//15
    g.drawLine(700, 95, 700, 50);//15_1
    g.drawLine(700, 50, 760, 50);//15_2
    g.fillPolygon(x8, y8, na);//15_3
    //wire15.setText((printPc()+4)+"");
    wire15.setForeground(Color.yellow);
   
     g.setColor(Color.magenta);
    g.drawLine(660, 130, 760, 130);//16
    g.fillPolygon(x9, y9, na);//16_1
    //wire16.setText("immed*4 in 32 bits");
    wire16.setForeground(Color.magenta);
    
    g.setColor(Color.magenta);
    g.drawLine(920, 100, 950, 100);//17
    g.fillPolygon(x10, y10, na);//17_1
    //wire17.setText((printPc()+4)+"");
    wire17.setForeground(Color.magenta);
    
    g.setColor(Color.magenta);
     g.setColor(new Color(185, 107, 249));
    g.drawLine(840, 100, 900, 100);//18
    g.fillPolygon(x12, y12, na);//18_1
    //wire18.setText("(PC+4)+4A");
    wire18.setForeground(Color.magenta);
    
    g.setColor(Color.yellow);
    g.drawLine(700, 50, 700, 28);//19
    g.drawLine(700, 28, 870, 28);//19_1
    g.drawLine(870, 28, 870, 80);//19_2
    g.drawLine(870, 80, 900, 80);//19_3
    g.fillPolygon(x11, y11, na);//19_4
    //wire19.setText((printPc()+4)+"");
    wire19.setForeground(Color.yellow);
    
    g.setColor(Color.orange);
    g.drawLine(500, 50, 600, 50);//20
    g.drawLine(600, 50, 600, 20);//20_1
    g.drawLine(600, 20, 930, 20);//20_2
    g.drawLine(930, 20, 930, 85);//20_3
    g.drawLine(930, 85, 950, 85);//20_4
    g.fillPolygon(x13, y13, na);//20_5
    wire20.setText("Not Used");
    wire20.setForeground(Color.orange);
    
    g.setColor(Color.yellow);
    g.drawLine(500, 95, 500, 50);//21
    g.fillPolygon(x15, y15, na);//21_1
    wire21.setVisible(false);
    
    g.setColor(Color.red);
    g.drawLine(930, 340, 970, 340);//22
    wire22.setText("Not Used");
    wire22.setForeground(Color.red);
    
    g.setColor(new Color(249, 182, 107));
    g.drawLine(790, 360, 850, 360);//23
    //wire23.setText("rs+immed");
    wire23.setForeground(new Color(249, 182, 107));
    
    g.drawLine(820, 360, 820, 420);//24
    g.drawLine(820, 420, 960, 420);//24_1
    g.drawLine(960, 420, 960, 360);//24_2
    g.drawLine(960, 360, 970, 360);//24_3
    wire24.setText("val in rs+immed");
    wire24.setForeground(new Color(249, 182, 107));
    
    g.setColor(Color.green);
    g.drawLine(716, 500, 760, 500);//25
    g.drawLine(760, 500, 760, 380);//25_1
    wire25.setText("0110");
    wire25.setForeground(Color.green);
    
    g.setColor(new Color(249, 182, 107));
    g.drawLine(570, 305, 710, 305);//26
    //wire26.setText("val in rs");
    wire26.setForeground(new Color(249, 182, 107));
    
    g.setColor(Color.red);
    g.drawLine(570, 345, 630, 345);//27
    //wire27.setText("val in rt");
    wire27.setForeground(Color.red);
    
    g.drawLine(620, 345, 620, 410);//28
    g.drawLine(620, 410, 800, 410);//28_1
    g.drawLine(800, 410, 800, 380);//28_2
    g.drawLine(800, 380, 850, 380);//28_3
    wire28.setText("Not Used");
    wire28.setForeground(Color.red);
    
    g.setColor(Color.yellow);    
    g.drawLine(350, 360, 350, 50);//29
    g.drawLine(350, 50, 400, 50);//29_1
    //wire29.setText("Not Used");
    wire29.setForeground(Color.yellow);
    
    g.setColor(Color.yellow);
    g.drawLine(360, 200, 360, 520);//30
    g.drawLine(360, 200, 400, 200);//30_1
    wire30.setText("000100");
    wire30.setForeground(Color.yellow);
    
    g.setColor(Color.green);
    g.drawLine(370, 390, 370, 250);//31
    g.drawLine(370, 390, 400, 390);//31_1
    g.drawLine(400, 390, 400, 380);//31_2
    g.drawLine(410, 250, 370, 250);//31_3
    wire31.setText("0");
    wire31.setForeground(Color.green);
    
    g.setColor(Color.red);
    g.drawLine(380, 340, 380, 320);//32
    g.drawLine(380, 340, 390, 340);//32_1
    //wire32.setText("rt");
    wire32.setForeground(Color.red);
    
    g.setColor(Color.yellow);
    g.drawLine(460, 50, 497, 50);//33
    g.fillPolygon(x14, y14, na);//33_1
    g.fillOval(497, 46, 7, 7);//33_2
    wire33.setText("not used");
    wire33.setForeground(Color.yellow);
    
    g.setColor(Color.red);
     g.drawLine(360, 300, 470, 300);//34
     //wire34.setText("01001");
    wire34.setForeground(Color.red);

     
     g.setColor(new Color(249, 73, 42));
     g.drawLine(360, 320, 470, 320);//35
     //wire35.setText("01010");
     wire35.setForeground(new Color(249, 73, 42));

     
     g.setColor(Color.red);
     g.drawLine(360, 370, 390, 370);//36
     wire36.setText("rd");
     wire36.setForeground(Color.red);
     
     g.setColor(Color.red);
     g.drawLine(410, 350, 470, 350);//37
     //wire37.setText("val in rt");
     wire37.setForeground(Color.red);

     
     g.setColor(new Color(255, 48, 203));
     g.drawLine(360, 470, 490, 470);//38
     //wire38.setText("immed in 16 bits");
     wire38.setForeground(new Color(255, 48, 203));

     
     g.setColor(Color.red);
     g.drawLine(470, 400, 430, 400);//39
    g.drawLine(430, 400, 430, 580);//39_1
    g.drawLine(430, 580, 1005, 580);//39_2
    g.drawLine(1005, 580, 1005, 350);//39_3
    g.drawLine(1005, 350, 990, 350);//39_4
    wire39.setText("val in rt");
    wire39.setForeground(Color.red);
    
    g.setColor(Color.magenta);
    g.drawLine(560, 470, 590, 470);//40
    g.drawLine(590, 470, 590, 130);//40_1
    g.drawLine(590, 130, 600, 130);//40_2
    //wire40.setText("immed in 32 bits");
    wire40.setBounds(360, 100, 250, 70);
    wire40.setForeground(Color.magenta);
    
    g.setColor(new Color(255, 48, 203));
    g.drawLine(590, 370, 630, 370);//41
    wire41.setText("not used");
    wire41.setForeground(Color.red);
    
    g.drawLine(650, 370, 710, 370);//42
    wire42.setText("val in rt");
    wire42.setForeground(new Color(255, 48, 203));
    
    g.setColor(Color.red);
    g.drawLine(360, 520, 650, 520);//43
    wire43.setText("Not Used");
    wire43.setForeground(Color.red);
    }
}