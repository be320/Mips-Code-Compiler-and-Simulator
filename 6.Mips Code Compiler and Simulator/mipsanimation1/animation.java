package mipsanimation1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class animation extends JPanel {

    private home bahaa;
    private window wind;
    private animation[] inst;
    protected registerfile r;
    private register[] regdata;
    private JTextField[] insarr;
    private String[] regarr;
    private static int count = 0;
    private static int inscounter = 0;
    private static int pcvalue;
    private instructions_ar[] list;
    private JButton exit = new JButton ("EXIT");
    private JLabel clkcounter= new JLabel ("Clock Counter = ");
    private JLabel clkcounter1= new JLabel ("1");
//     private static int regcounter;
    protected JButton next = new JButton("NEXT");
    int x1[] = {260, 340, 340, 260, 260, 280, 260};
    int y1[] = {30, 70, 120, 150, 100, 90, 80};
    int x2[] = {710, 790, 790, 710, 710, 730, 710};
    int y2[] = {280, 320, 370, 400, 350, 340, 330};
    int x3[] = {760, 840, 840, 760, 760, 780, 760};
    int y3[] = {30, 70, 120, 150, 100, 90, 80};
    int x4[] = {95, 100, 95};
    int y4[] = {335, 340, 345};
    int x5[] = {245, 250, 245};
    int y5[] = {335, 340, 345};
    int x6[] = {255, 260, 255};
    int y6[] = {125, 130, 135};
    int x7[] = {255, 260, 255};
    int y7[] = {45, 50, 55};
    int x8[] = {755, 760, 755};
    int y8[] = {45, 50, 55};
    int x9[] = {755, 760, 755};
    int y9[] = {125, 130, 135};
    int x10[] = {945, 950, 945};
    int y10[] = {95, 100, 105};
    int x11[] = {895, 900, 895};
    int y11[] = {75, 80, 85};
    int x12[] = {895, 900, 895};
    int y12[] = {95, 100, 105};
    int x13[] = {945, 950, 945};
    int y13[] = {80, 85, 90};
    int x14[] = {490, 495, 490};
    int y14[] = {45, 50, 55};
    int x15[] = {495, 500, 505};
    int y15[] = {60, 55, 60};
    int x16[] = {945, 950, 945};
    int y16[] = {95, 100, 105};
    int x17[] = {945, 950, 945};
    int y17[] = {95, 100, 105};
    int x18[] = {945, 950, 945};
    int y18[] = {95, 100, 105};
    int x19[] = {945, 950, 945};
    int y19[] = {95, 100, 105};
    int na = 3;
    int np = 7;
    private JLabel pc = new JLabel("PC");
    private JLabel ins = new JLabel("INSTRUCTION");
    private JLabel mux1 = new JLabel("<html>M<br>U<br>X</html>");
    private JLabel mux2 = new JLabel("<html>M<br>U<br>X</html>");
    private JLabel mux3 = new JLabel("<html>M<br>U<br>X</html>");
    private JLabel mux4 = new JLabel("<html>M<br>U<br>X</html>");
    private JLabel mux5 = new JLabel("<html>M<br>U<br>X</html>");
    private JLabel reg = new JLabel("REGISTERS");
    private JLabel data = new JLabel("DATA");
    private JLabel control = new JLabel("CONTROL");
    private JLabel alu = new JLabel("ALU");
    private JLabel add1 = new JLabel("ADD");
    private JLabel add2 = new JLabel("ADD");
    private JLabel sign = new JLabel("<html>SIGN<br>EXTEND</html>");
    private JLabel aluControl = new JLabel("<html>ALU<br>CONTROL</html>");
    private JLabel sl1 = new JLabel("<html>SHIFT<br>LEFT 2</html>");
    private JLabel sl2 = new JLabel("<html>SHIFT<br>LEFT 2</html>");
    private JLabel zero = new JLabel("ZERO");
    protected JLabel wire1 = new JLabel("");
    protected JLabel wire2 = new JLabel("");
    protected JLabel wire3 = new JLabel("");
    protected JLabel wire4 = new JLabel("");
    protected JLabel wire5 = new JLabel("");
    protected JLabel wire6 = new JLabel("");
    protected JLabel wire7 = new JLabel("");
    protected JLabel wire8 = new JLabel("");
    protected JLabel wire9 = new JLabel("");
    protected JLabel wire10 = new JLabel("");
    protected JLabel wire11 = new JLabel("");
    protected JLabel wire12 = new JLabel("");
    protected JLabel wire13 = new JLabel("");
    protected JLabel wire14 = new JLabel("");
    protected JLabel wire15 = new JLabel("");
    protected JLabel wire16 = new JLabel("");
    protected JLabel wire17 = new JLabel("");
    protected JLabel wire18 = new JLabel("");
    protected JLabel wire19 = new JLabel("");
    protected JLabel wire20 = new JLabel("");
    protected JLabel wire21 = new JLabel("");
    protected JLabel wire22 = new JLabel("");
    protected JLabel wire23 = new JLabel("");
    protected JLabel wire24 = new JLabel("");
    protected JLabel wire25 = new JLabel("");
    protected JLabel wire26 = new JLabel("");
    protected JLabel wire27 = new JLabel("");
    protected JLabel wire28 = new JLabel("");
    protected JLabel wire29 = new JLabel("");
    protected JLabel wire30 = new JLabel("");
    protected JLabel wire31 = new JLabel("");
    protected JLabel wire32 = new JLabel("");
    protected JLabel wire33 = new JLabel("");
    protected JLabel wire34 = new JLabel("");
    protected JLabel wire35 = new JLabel("");
    protected JLabel wire36 = new JLabel("");
    protected JLabel wire37 = new JLabel("");
    protected JLabel wire38 = new JLabel("");
    protected JLabel wire39 = new JLabel("");
    protected JLabel wire40 = new JLabel("");
    protected JLabel wire41 = new JLabel("");
    protected JLabel wire42 = new JLabel("");
    protected JLabel wire43 = new JLabel("");
    protected JLabel wireMain = new JLabel("");
    private JFrame fr = new JFrame();
    private window[] shebak = new window[100];
    private static int shebakcount = 0;

    public animation(home bahaa) {

        this.bahaa = bahaa;

        init();

    }

    public void paintComponent(Graphics g) {
//     regarr=printReg();   
        super.paintComponent(g);
        this.setBackground(Color.white);

        //hardware
        g.setColor(new Color(0, 221, 255));
        g.fillRect(250, 300, 80, 100);//instruction memory
        g.fillRect(100, 320, 50, 50);//pc
        g.fillRect(470, 270, 100, 150);//Register file
        g.fillRect(850, 300, 80, 100);//data memory
        g.fillOval(400, 150, 80, 120);//Control
        g.fillOval(650, 480, 70, 70);//alu control
        g.fillOval(490, 430, 70, 70);//sign extend
        g.fillOval(400, 20, 60, 60);//shiftLeft 1
        g.fillOval(600, 100, 60, 60);//shiftLeft 2
        g.fillRoundRect(390, 330, 20, 50, 20, 20);//mux 1
        g.fillRoundRect(630, 330, 20, 50, 20, 20);//mux 2
        g.fillRoundRect(970, 330, 20, 50, 20, 20);//mux 3
        g.fillRoundRect(900, 70, 20, 50, 20, 20);//mux 4
        g.fillRoundRect(950, 70, 20, 50, 20, 20);//mux 5
        g.fillPolygon(x1, y1, np);//ALU 1
        g.fillPolygon(x2, y2, np);//ALU 2
        g.fillPolygon(x3, y3, np);//ALU 3
        g.fillRect(850, 160, 25, 25);//and
        g.fillOval(860, 160, 30, 25);//and
        //Labels
        pc.setBounds(115, 330, 50, 20);
        pc.setForeground(new Color(102, 0, 0));
        this.add(pc);
        ins.setBounds(250, 290, 200, 100);
        ins.setForeground(new Color(102, 0, 0));
        this.add(ins);
        mux1.setBounds(395, 320, 50, 70);
        mux1.setForeground(new Color(102, 0, 0));
        this.add(mux1);
        mux2.setBounds(975, 320, 50, 70);
        mux2.setForeground(new Color(102, 0, 0));
        this.add(mux2);
        mux3.setBounds(635, 320, 50, 70);
        mux3.setForeground(new Color(102, 0, 0));
        this.add(mux3);
        mux4.setBounds(955, 60, 50, 70);
        mux4.setForeground(new Color(102, 0, 0));
        this.add(mux4);
        mux5.setBounds(905, 60, 50, 70);
        mux5.setForeground(new Color(102, 0, 0));
        this.add(mux5);
        reg.setBounds(490, 300, 70, 70);
        reg.setForeground(new Color(102, 0, 0));
        this.add(reg);
        data.setBounds(870, 300, 70, 70);
        data.setForeground(new Color(102, 0, 0));
        this.add(data);
        control.setBounds(410, 170, 70, 70);
        control.setForeground(new Color(102, 0, 0));
        this.add(control);
        alu.setBounds(740, 315, 70, 70);
        alu.setForeground(new Color(102, 0, 0));
        this.add(alu);
        add1.setBounds(300, 55, 70, 70);
        add1.setForeground(new Color(102, 0, 0));
        this.add(add1);
        add2.setBounds(800, 55, 70, 70);
        add2.setForeground(new Color(102, 0, 0));
        this.add(add2);
        sign.setBounds(500, 430, 70, 70);
        sign.setForeground(new Color(102, 0, 0));
        this.add(sign);
        sl1.setBounds(410, 15, 70, 70);
        sl1.setForeground(new Color(102, 0, 0));
        this.add(sl1);
        sl2.setBounds(610, 95, 70, 70);
        sl2.setForeground(new Color(102, 0, 0));
        this.add(sl2);
        aluControl.setBounds(660, 475, 70, 70);
        aluControl.setForeground(new Color(102, 0, 0));
        this.add(aluControl);
        zero.setBounds(755, 290, 70, 70);
        zero.setForeground(new Color(102, 0, 0));
        this.add(zero);

        //wires
        g.setColor(Color.BLACK);
        //from control to...
        g.drawLine(466, 165, 850, 165);//1

        wire1.setBounds(650, 140, 70, 70);
        wire1.setForeground(new Color(102, 0, 0));
        this.add(wire1);

        g.drawLine(478, 195, 960, 195);//2
        g.drawLine(960, 195, 960, 120);//2_1

        wire2.setBounds(965, 155, 70, 70);
        wire2.setForeground(new Color(102, 0, 0));
        this.add(wire2);

        g.drawLine(480, 205, 1020, 205);//3
        g.drawLine(1020, 205, 1020, 450);//3_1
        g.drawLine(1020, 450, 880, 450);//3_2
        g.drawLine(880, 450, 880, 400);//3_3

        wire3.setBounds(1025, 190, 70, 70);
        wire3.setForeground(new Color(102, 0, 0));
        this.add(wire3);

        g.drawLine(480, 215, 980, 215);//4
        g.drawLine(980, 215, 980, 330);//4_1

        wire4.setBounds(985, 210, 70, 70);
        wire4.setForeground(new Color(102, 0, 0));
        this.add(wire4);

        g.drawLine(477, 225, 880, 225);//5
        g.drawLine(880, 225, 880, 300);//5_1

        wire5.setBounds(885, 220, 70, 70);
        wire5.setForeground(new Color(102, 0, 0));
        this.add(wire5);

        g.drawLine(475, 235, 675, 235);//6
        g.drawLine(675, 235, 675, 482);//6_1

        wire6.setBounds(680, 230, 70, 70);
        wire6.setForeground(new Color(102, 0, 0));
        this.add(wire6);

        g.drawLine(470, 245, 640, 245);//7
        g.drawLine(640, 245, 640, 330);//7_1

        wire7.setBounds(632, 240, 70, 70);
        wire7.setForeground(new Color(102, 0, 0));
        this.add(wire7);

        g.drawLine(465, 255, 530, 255);//8
        g.drawLine(530, 255, 530, 270);//8_1

        wire8.setBounds(505, 228, 70, 70);
        wire8.setForeground(new Color(102, 0, 0));
        this.add(wire8);

        //to and
        g.drawLine(790, 325, 810, 325);//9
        g.drawLine(810, 325, 810, 180);//9_1
        g.drawLine(810, 180, 850, 180);//9_2

        wire9.setBounds(815, 250, 70, 70);
        wire9.setForeground(new Color(102, 0, 0));
        this.add(wire9);

        //from and
        g.drawLine(890, 170, 910, 170);//10
        g.drawLine(910, 170, 910, 120);//10_1

        wire10.setBounds(895, 110, 70, 70);
        wire10.setForeground(new Color(102, 0, 0));
        this.add(wire10);

        //from MUX to PC
        g.drawLine(970, 100, 1000, 100);//11
        g.drawLine(1000, 100, 1000, 10);//11_1
        g.drawLine(1000, 10, 50, 10);//11_2
        g.drawLine(50, 10, 50, 340);//11_3
        g.drawLine(50, 340, 100, 340);//11_4
        g.fillPolygon(x4, y4, na);//11_5

        wire11.setBounds(55, 150, 70, 70);
        wire11.setForeground(new Color(102, 0, 0));
        this.add(wire11);

        //from pc to inst
        g.drawLine(150, 340, 250, 340);//12
        g.fillPolygon(x5, y5, na);//12_1

        wire12.setBounds(195, 315, 70, 70);
        wire12.setForeground(new Color(102, 0, 0));
        this.add(wire12);

        //from pc to add
        g.drawLine(200, 340, 200, 130);//13
        g.drawLine(200, 130, 260, 130);//13_1
        g.fillPolygon(x6, y6, na);//13_2

        wire13.setBounds(205, 200, 70, 70);
        wire13.setForeground(new Color(102, 0, 0));
        this.add(wire13);

        //+4
        g.drawLine(200, 50, 260, 50);//14
        g.fillPolygon(x7, y7, na);//14_1

        wire14.setBounds(180, 15, 70, 70);
        wire14.setForeground(new Color(102, 0, 0));
        this.add(wire14);

        //from add to add
        g.drawLine(340, 95, 700, 95);//15
        g.drawLine(700, 95, 700, 50);//15_1
        g.drawLine(700, 50, 760, 50);//15_2
        g.fillPolygon(x8, y8, na);//15_3

        wire15.setBounds(540, 50, 70, 70);
        wire15.setForeground(new Color(102, 0, 0));
        this.add(wire15);

        //from shift left to add
        g.drawLine(660, 130, 760, 130);//16
        g.fillPolygon(x9, y9, na);//16_1

        wire16.setBounds(700, 102, 70, 70);
        wire16.setForeground(new Color(102, 0, 0));
        this.add(wire16);

        //from mux to mux
        g.drawLine(920, 100, 950, 100);//17
        g.fillPolygon(x10, y10, na);//17_1

        wire17.setBounds(930, 75, 70, 70);
        wire17.setForeground(new Color(102, 0, 0));
        this.add(wire17);

        //from add to mux
        g.drawLine(840, 100, 900, 100);//18
        g.fillPolygon(x12, y12, na);//18_1

        wire18.setBounds(870, 75, 70, 70);
        wire18.setForeground(new Color(102, 0, 0));
        this.add(wire18);

        g.drawLine(700, 50, 700, 28);//19
        g.drawLine(700, 28, 870, 28);//19_1
        g.drawLine(870, 28, 870, 80);//19_2
        g.drawLine(870, 80, 900, 80);//19_3
        g.fillPolygon(x11, y11, na);//19_4

        wire19.setBounds(800, 5, 70, 70);
        wire19.setForeground(new Color(102, 0, 0));
        this.add(wire19);

        //from shiftLeft to mux
        g.drawLine(500, 50, 600, 50);//20
        g.drawLine(600, 50, 600, 20);//20_1
        g.drawLine(600, 20, 930, 20);//20_2
        g.drawLine(930, 20, 930, 85);//20_3
        g.drawLine(930, 85, 950, 85);//20_4
        g.fillPolygon(x13, y13, na);//20_5

        wire20.setBounds(400,30, 250, 70);
        wire20.setForeground(new Color(102, 0, 0));
        this.add(wire20);

        g.drawLine(500, 95, 500, 50);//21
        g.fillPolygon(x15, y15, na);//21_1

        wire21.setBounds(505, 70, 70, 70);
        wire21.setForeground(new Color(102, 0, 0));
        this.add(wire21);

        //from data to mux
        g.drawLine(930, 340, 970, 340);//22

        wire22.setBounds(945, 315, 70, 70);
        wire22.setForeground(new Color(102, 0, 0));
        this.add(wire22);
        //from alu to data
        g.drawLine(790, 360, 850, 360);//23
        wire23.setBounds(800, 320, 70, 70);
        wire23.setForeground(new Color(102, 0, 0));
        this.add(wire23);
        //from alu to mux

        g.drawLine(820, 360, 820, 420);//24
        g.drawLine(820, 420, 960, 420);//24_1
        g.drawLine(960, 420, 960, 360);//24_2
        g.drawLine(960, 360, 970, 360);//24_3
        wire24.setBounds(850, 380, 70, 70);
        wire24.setForeground(new Color(102, 0, 0));
        this.add(wire24);
        //from alu control to alu
        g.drawLine(716, 500, 760, 500);//25
        g.drawLine(760, 500, 760, 380);//25_1
        wire25.setBounds(725, 460, 70, 70);
        wire25.setForeground(new Color(102, 0, 0));
        this.add(wire25);
        //from registers to alu
        g.drawLine(570, 305, 710, 305);//26
        wire26.setBounds(600, 265, 70, 70);
        wire26.setForeground(new Color(102, 0, 0));
        this.add(wire26);
        //from registers to mux
        g.drawLine(570, 345, 630, 345);//27
        wire27.setBounds(600, 305, 70, 70);
        wire27.setForeground(new Color(102, 0, 0));
        this.add(wire27);
        //from registers to data
        g.drawLine(620, 345, 620, 410);//28
        g.drawLine(620, 410, 800, 410);//28_1
        g.drawLine(800, 410, 800, 380);//28_2
        g.drawLine(800, 380, 850, 380);//28_3
        wire28.setBounds(630, 385, 70, 70);
        wire28.setForeground(new Color(102, 0, 0));
        this.add(wire28);
        //from instructionMemory
        g.drawLine(330, 360, 350, 360);//main
        g.drawLine(350, 360, 360, 360);//main
        wireMain.setBounds(0, 0, 70, 70);
        wireMain.setForeground(new Color(102, 0, 0));
        this.add(wireMain);
        g.drawLine(350, 360, 350, 50);//29
        g.drawLine(350, 50, 400, 50);//29_1
        wire29.setBounds(330, 225, 70, 70);
        wire29.setForeground(new Color(102, 0, 0));
        this.add(wire29);
        g.drawLine(360, 200, 360, 520);//30
        g.drawLine(360, 200, 400, 200);//30_1
        wire30.setBounds(380, 155, 70, 70);
        wire30.setForeground(new Color(102, 0, 0));
        this.add(wire30);
        g.drawLine(370, 390, 370, 250);//31
        g.drawLine(370, 390, 400, 390);//31_1
        g.drawLine(400, 390, 400, 380);//31_2
        g.drawLine(410, 250, 370, 250);//31_3
        wire31.setBounds(380, 205, 70, 70);
        wire31.setForeground(new Color(102, 0, 0));
        this.add(wire31);
        g.drawLine(380, 340, 380, 320);//32
        g.drawLine(380, 340, 390, 340);//32_1
        wire32.setBounds(375, 290, 70, 70);
        wire32.setForeground(new Color(102, 0, 0));
        this.add(wire32);
        //wire 33
        g.drawLine(460, 50, 497, 50);//33
        g.fillPolygon(x14, y14, na);//33_1
        g.fillOval(497, 46, 7, 7);//33_2
        wire33.setBounds(470, 0, 250, 70);
        wire33.setForeground(new Color(102, 0, 0));
        this.add(wire33);
        //from instruction to mux
        g.drawLine(360, 370, 390, 370);//36
        wire36.setBounds(375, 328, 70, 70);
        wire36.setForeground(new Color(102, 0, 0));
        //wire36.setText(regdata[0+count].getId());
        //   System.out.println(regcounter);
        this.add(wire36);
        //from instruction to registers
        g.drawLine(360, 300, 470, 300);//34

        wire34.setBounds(390, 257, 70, 70);
        wire34.setForeground(new Color(249, 182, 107));
        //wire34.setText(regdata[1+count].getId());
        //   System.out.println("hi");
        this.add(wire34);
        //  System.out.println(regcounter);

        g.drawLine(360, 320, 470, 320);//35
        wire35.setBounds(390, 278, 70, 70);
        wire35.setForeground(new Color(102, 0, 0));
        //wire35.setText(regdata[2+count].getId());
        //System.out.println(regcounter);
        this.add(wire35);

        //from mux to registers
        g.drawLine(410, 350, 470, 350);//37
        wire37.setBounds(420, 310, 70, 70);
        wire37.setForeground(new Color(102, 0, 0));
        this.add(wire37);
        //from instruction to sign extend
        g.drawLine(360, 470, 490, 470);//38
        wire38.setBounds(375, 425, 70, 70);
        wire38.setForeground(new Color(102, 0, 0));
        this.add(wire38);
        //from far mux to registers
        g.drawLine(470, 400, 430, 400);//39
        g.drawLine(430, 400, 430, 580);//39_1
        g.drawLine(430, 580, 1005, 580);//39_2
        g.drawLine(1005, 580, 1005, 350);//39_3
        g.drawLine(1005, 350, 990, 350);//39_4
        wire39.setBounds(725, 530, 70, 70);
        wire39.setForeground(new Color(102, 0, 0));
        this.add(wire39);
        //from sign extend to shift left
        g.drawLine(560, 470, 590, 470);//40
        g.drawLine(590, 470, 590, 130);//40_1
        g.drawLine(590, 130, 600, 130);//40_2
        wire40.setBounds(500, 100, 250, 70);
        wire40.setForeground(new Color(102, 0, 0));
        this.add(wire40);

        //from sign extend to mux
        g.drawLine(590, 370, 630, 370);//41
        wire41.setBounds(600, 343, 70, 70);
        wire41.setForeground(new Color(102, 0, 0));
        this.add(wire41);
        //from MUX to ALU
        g.drawLine(650, 370, 710, 370);//42
        wire42.setBounds(680, 343, 70, 70);
        wire42.setForeground(new Color(102, 0, 0));
        this.add(wire42);
        //from ins to ALU CONTROL
        g.drawLine(360, 520, 650, 520);//43
        wire43.setBounds(600, 470, 70, 70);
        wire43.setForeground(new Color(102, 0, 0));
        this.add(wire43);
    }

    public void init() {

//         regdata=regdata(); 
//         inst=inst();
//         r=file();
//         wind=wind();
//         pcvalue=printPc();
        r=bahaa.r;
        list = fekra();
        this.setLayout(null);
//    insarr=insarr();
clkcounter.setBounds(500, 600, 250, 50);
clkcounter.setFont(clkcounter.getFont().deriveFont(20.0f));
clkcounter1.setFont(clkcounter.getFont().deriveFont(20.0f));
clkcounter1.setForeground(Color.YELLOW);
clkcounter.setForeground(Color.red);
clkcounter1.setBounds(700, 600, 100, 50);
 clkcounter1.setText((count+1)+"");
     this.add(clkcounter);
     this.add(clkcounter1);

        next.setBounds(100, 550, 100, 50);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (list[count].getInst().equals("j") || list[count].getInst().equals("jal")) {
                    int x = find(list[count].getTarget());
                    count = x - 1;
                    bahaa.pcValue = Integer.parseInt(list[x].getMypc()+"");
                } else if (list[count].getInst().equals("jr")) {
                    bahaa.pcValue = bahaa.r.getRegister(31).getValue();
                   count=((bahaa.pcValue-bahaa.intpc)/4)-1;
                    System.out.println("pc       "+bahaa.pcValue);
                    System.out.println("count    "+count);
                } else if (list[count].getInst().equals("beq")) {
                    if (list[count].jumping) {
                        int x = find(list[count].getTarget());
                        count = x - 1;
                          bahaa.pcValue = Integer.parseInt(list[x].getMypc()+"");
                    }
                } else {
                    bahaa.pcValue += 4;
                }
                count++;
                bahaa.show(count);
                rf hi=new rf(r);
                hi.dispose();
                hi.setUndecorated(true);
                hi.setVisible(true);
               
             
            }
        });
        this.add(next);
        
        
        exit.setBounds(800, 580, 100, 50);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              
             System.exit(0); 
      
            }
        });
        this.add(exit);
    
        
        
        
        
        
        
        
        

    }

    public instructions_ar[] fekra() {
        return bahaa.fekra;
    }

    public int find(String s) {
        for (int i = 0; i < bahaa.maincount; i++) {
            if (list[i].getLabel().equals(s)) {
                return list[i].getIndex();
            }
        }
        return -1;
    }
    public int pcsearch(int s)
    {
     for(int i = 0; i < bahaa.maincount; i++) {
            if (s==Integer.parseInt(list[i].getDraw().wire12.getText())) {
                return list[i].getIndex();
            }
        }
        return -50;
    }
//    public int printPc()
//    {
//    return bahaa.getPcValue();
//    }
//  public String[] printReg()
//  {
//  return bahaa.mario;
//  }
//  public JTextField[] insarr()
//  {
//  return bahaa.getInsText();
//  }
//  public int[] count()
//  {
//  return bahaa.getIndex();
//  }
////  public int value () {
////  return r.getValue();
////  } 
//  public register[] regdata()
//  {
//  return bahaa.getData();
//  }
//  public registerfile file()
//  {
//  return bahaa.getR();
//  }
//  public animation[] inst()
//  {
//      return bahaa.instructions;
//  }

}