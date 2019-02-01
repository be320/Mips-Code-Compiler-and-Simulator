package mipsanimation1;

import com.sun.javafx.geom.Curve;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class home extends JFrame {

    private int[] binary4;
    private int[] binary28;
    private int[] binary32;
    private memory kiro = new memory();
    protected instructions_ar fekra[] = new instructions_ar[100];
    protected registerfile r = new registerfile();
    private JLabel pclabel = new JLabel("Enter Your Initial PC");
    private JTextField pctext = new JTextField("0");
    protected int pcValue = 0;
    protected int intpc;
    private String pcString;
    private JButton pcenter = new JButton();
    private JLabel inslabel = new JLabel("Your Instructions: ");
    private JButton plus = new JButton("+");
    private JButton run = new JButton("RUN");
    private int index[] = new int[100];
    private JTextField inst[] = new JTextField[100];
    private JTextField reg1[] = new JTextField[100];
    private JTextField reg2[] = new JTextField[100];
    private JTextField reg3[] = new JTextField[100];
    private JTextField label[] = new JTextField[100];
    private add obadd[] = new add[100];
    private addi obaddi[] = new addi[100];
    private slt obslt[] = new slt[100];
    private slti obslti[] = new slti[100];
    private j obj[] = new j[100];
    private jal objal[] = new jal[100];
    private jr objr[] = new jr[100];
    private beq obbeq[] = new beq[100];
    private nor obnor[] = new nor[100];
    private sll obsll[] = new sll[100];
    private sb obsb[] = new sb[100];
    private lbu oblbu[] = new lbu[100];
    private lb oblb[] = new lb[100];
    private sw obsw[] = new sw[100];
    private lw oblw[] = new lw[100];
    private JButton pcEnter = new JButton("Enter");
    protected static int maincount = 0;
    private static int b = 0;
    protected window w;
    private static int drawcount = 0;
    private int[] address = new int[100];
    private int[] value = new int[100];
    private animation fadya = new animation(this);
    private static int addresscount = 0;
    protected rf full;
    public home(memory kiro) {
        this.kiro = kiro;
        init();
    }

    public void init() {
        this.setTitle("Enter Your Instructions");
        this.setBounds(500, 0, 600, 730);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        pclabel.setBounds(20, 10, 200, 30);
        c.add(pclabel);
        pctext.setBounds(220, 10, 100, 30);
        c.add(pctext);
        pcEnter.setBounds(400, 10, 100, 30);
        pcEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pcValue = Integer.parseInt(pctext.getText());
                intpc = Integer.parseInt(pctext.getText());
            }
        });
        c.add(pcEnter);
        inslabel.setBounds(20, 40, 200, 30);
        this.add(inslabel);
        plus.setBounds(455, 100, 45, 45);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                index[maincount] = maincount;
                inst[maincount] = new JTextField();
                inst[maincount].setBounds(10, 70 + b, 50, 20);
                reg1[maincount] = new JTextField();
                reg1[maincount].setBounds(65, 70 + b, 50, 20);
                reg2[maincount] = new JTextField();
                reg2[maincount].setBounds(115, 70 + b, 50, 20);
                reg3[maincount] = new JTextField();
                reg3[maincount].setBounds(165, 70 + b, 50, 20);
                label[maincount] = new JTextField();
                label[maincount].setBounds(250, 70 + b, 100, 20);
                b += 25;
                repaint();
                c.add(inst[maincount]);
                c.add(reg1[maincount]);
                c.add(reg2[maincount]);
                c.add(reg3[maincount]);
                c.add(label[maincount]);
                maincount++;
            }
        });
        this.add(plus);
        run.setBounds(455, 450, 100, 100);
        run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for (int i = 0; i < maincount; i++) {

                    fekra[i] = new instructions_ar();
                    fekra[i].setIndex(i);
                    fekra[i].setInst(inst[i].getText());
                    fekra[i].setLabel(label[i].getText());

                    if (fekra[i].getInst().equals("add") || fekra[i].getInst().equals("nor") || fekra[i].getInst().equals("slt")) {
                        fekra[i].setRd(r.getRegister(r.getRegisterNum(reg1[i].getText())));
                        fekra[i].setRs(r.getRegister(r.getRegisterNum(reg2[i].getText())));
                        fekra[i].setRt(r.getRegister(r.getRegisterNum(reg3[i].getText())));
                    } else if (fekra[i].getInst().equals("j") || fekra[i].getInst().equals("jal")) {
                        fekra[i].setTarget(reg1[i].getText());
                    } else if (fekra[i].getInst().equals("jr")) {
                        fekra[i].setRs(r.getRegister(r.getRegisterNum(reg1[i].getText())));
                    } else if (fekra[i].getInst().equals("beq")) {
                        fekra[i].setRd(r.getRegister(r.getRegisterNum(reg1[i].getText())));
                        fekra[i].setRs(r.getRegister(r.getRegisterNum(reg2[i].getText())));
                        fekra[i].setTarget(reg3[i].getText());
                    } else {
                        fekra[i].setRt(r.getRegister(r.getRegisterNum(reg1[i].getText())));
                        fekra[i].setRs(r.getRegister(r.getRegisterNum(reg2[i].getText())));
                        fekra[i].setImmed(Integer.parseInt(reg3[i].getText()));
                    }
                }
                for(int i=0;i<maincount;i++)
                {
                fekra[i].setMypc(intpc+(i*4));
                }
             
                show(0);
                full=new rf(r);
                full.dispose();
                full.setUndecorated(true);
                full.setVisible(true);
                dispose();
            }
        });
        c.add(run);
    }

    public void fillins() {

    }
    
    public void show(int j) {

        if (fekra[j].getInst().equals("add")) {
            obadd[drawcount] = new add(this);
            fekra[j].setDraw(obadd[drawcount]);
            fekra[j].getDraw().wire11.setText((fekra[j].getMypc() + 4) + "");
            fekra[j].getDraw().wire12.setText(fekra[j].getMypc()  + "");
            fekra[j].getDraw().wire13.setText(fekra[j].getMypc()  + "");
            fekra[j].getDraw().wire15.setText((fekra[j].getMypc()  + 4) + "");
            fekra[j].getDraw().wire19.setText((fekra[j].getMypc() + 4) + "");
            fekra[j].getDraw().wire36.setText(fekra[j].getRd().getId());
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRd().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire27.setText(fekra[j].getRt().getValue() + "");
            fekra[j].getDraw().wire42.setText(fekra[j].getRt().getValue() + "");
            fekra[j].getDraw().wire23.setText((fekra[j].getRt().getValue() + fekra[j].getRs().getValue()) + "");
            fekra[j].getDraw().wire24.setText((fekra[j].getRt().getValue() + fekra[j].getRs().getValue()) + "");
            fekra[j].getDraw().wire39.setText((fekra[j].getRt().getValue() + fekra[j].getRs().getValue()) + "");
      fekra[j].getRd().setValue(Integer.parseInt(fekra[j].getDraw().wire23.getText()));
        }
      else if (fekra[j].getInst().equals("nor")) {
                obnor[drawcount] = new nor(this);
                fekra[j].setDraw(obnor[drawcount]);
                fekra[j].getDraw().wire11.setText((fekra[j].getMypc() + 4) + "");
                fekra[j].getDraw().wire12.setText(fekra[j].getMypc() + "");
                fekra[j].getDraw().wire13.setText(fekra[j].getMypc() + "");
                fekra[j].getDraw().wire15.setText((fekra[j].getMypc() + 4) + "");
                fekra[j].getDraw().wire19.setText((fekra[j].getMypc() + 4) + "");
                fekra[j].getDraw().wire36.setText(fekra[j].getRd().getId());
                fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
                fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
                fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
                fekra[j].getDraw().wire37.setText(fekra[j].getRd().getId());
                fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
                fekra[j].getDraw().wire27.setText(fekra[j].getRt().getValue() + "");
                fekra[j].getDraw().wire42.setText(fekra[j].getRt().getValue() + "");

                int n = ~(fekra[j].getRt().getValue() | fekra[j].getRs().getValue());

                fekra[j].getDraw().wire23.setText(n + "");
                fekra[j].getDraw().wire24.setText(n + "");
                fekra[j].getDraw().wire39.setText(n + "");
                fekra[j].getRd().setValue(n);
            }
      else if (fekra[j].getInst().equals("slt")) {
                obslt[drawcount] = new slt(this);
                fekra[j].setDraw(obslt[drawcount]);
                fekra[j].getDraw().wire11.setText((fekra[j].getMypc() + 4) + "");
                fekra[j].getDraw().wire12.setText(fekra[j].getMypc() + "");
                fekra[j].getDraw().wire13.setText(fekra[j].getMypc() + "");
                fekra[j].getDraw().wire15.setText((fekra[j].getMypc() + 4) + "");
                fekra[j].getDraw().wire19.setText((fekra[j].getMypc() + 4) + "");
                fekra[j].getDraw().wire36.setText(fekra[j].getRd().getId());
                fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
                fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
                fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
                fekra[j].getDraw().wire37.setText(fekra[j].getRd().getId());
                fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
                fekra[j].getDraw().wire27.setText(fekra[j].getRt().getValue() + "");
                fekra[j].getDraw().wire42.setText(fekra[j].getRt().getValue() + "");

                if (fekra[j].getRs().getValue() < fekra[j].getRt().getValue()) {
                    fekra[j].getDraw().wire23.setText("1");
                    fekra[j].getDraw().wire24.setText("1");
                    fekra[j].getDraw().wire39.setText("1");
                    fekra[j].getRd().setValue(1);
                } else {
                    fekra[j].getDraw().wire23.setText("0");
                    fekra[j].getDraw().wire24.setText("0");
                    fekra[j].getDraw().wire39.setText("0");
                    fekra[j].getRd().setValue(0);
                }

            }


        if (fekra[j].getInst().equals("j")) {
            obj[drawcount] = new j(this);
            fekra[j].setDraw(obj[drawcount]);
            int go = fadya.find(fekra[j].getTarget());
            System.out.println("go = "+go);
            fekra[j].getDraw().wire12.setText(fekra[j].getMypc()  + "");
            fekra[j].getDraw().wire13.setText(fekra[j].getMypc()  + "");
            fekra[j].getDraw().wire15.setText((fekra[j].getMypc()  + 4) + "");
            fekra[j].getDraw().wire19.setText((fekra[j].getMypc()  + 4) + "");
            fekra[j].getDraw().wire33.setText(intpc + (go * 4) + "");
            fekra[j].getDraw().wire29.setText((intpc + (go * 4)) / 4 + "");
            binary4 = convertbin(pcValue + 4);
            binary28 = convertbin((intpc + (go * 4)));
            fekra[j].getDraw().wire21.setText(prnt4(binary4));
            fekra[j].getDraw().wire33.setText(prnt28(binary28));
            fekra[j].getDraw().wire20.setText(prnt4(binary4) + prnt28(binary28));
            fekra[j].getDraw().wire11.setText(Integer.parseInt(fekra[j].getDraw().wire20.getText(), 2) + ""); }
        
        else if  (fekra[j].getInst().equals("jal")) {
                objal[drawcount] = new jal(this);
                fekra[j].setDraw(objal[drawcount]);
               int go = fadya.find(fekra[j].getTarget());
                fekra[j].getDraw().wire12.setText(fekra[j].getMypc() + "");
                fekra[j].getDraw().wire13.setText(fekra[j].getMypc() + "");
                fekra[j].getDraw().wire15.setText((fekra[j].getMypc() + 4) + "");
                fekra[j].getDraw().wire19.setText((fekra[j].getMypc() + 4) + "");
                fekra[j].getDraw().wire33.setText(intpc + (go * 4) + "");
                fekra[j].getDraw().wire29.setText((intpc + (go * 4)) / 4 + "");
                binary4 = convertbin(pcValue + 4);
                binary28 = convertbin((intpc + (go * 4)) / 4);
                fekra[j].getDraw().wire21.setText(prnt4(binary4));
                fekra[j].getDraw().wire33.setText(prnt28(binary28));
                fekra[j].getDraw().wire20.setText(prnt4(binary4) + prnt28(binary28));
                fekra[j].getDraw().wire11.setText(Integer.parseInt(fekra[j].getDraw().wire20.getText(), 2) + "");
                r.getRegister(31).setValue(fekra[j+1].getMypc());
            
        } else if (fekra[j].getInst().equals("beq")) {
            obbeq[drawcount] = new beq(this);
            int go = fadya.find(fekra[j].getTarget());
            fekra[j].setDraw(obbeq[drawcount]);
            fekra[j].getDraw().wire12.setText(fekra[j].getMypc() + "");
            fekra[j].getDraw().wire13.setText(fekra[j].getMypc() + "");
            fekra[j].getDraw().wire15.setText((fekra[j].getMypc()+ 4) + "");
            fekra[j].getDraw().wire19.setText((fekra[j].getMypc() + 4) + "");
            fekra[j].getDraw().wire17.setText(intpc + (4 * go) + "");
            fekra[j].getDraw().wire18.setText(intpc + (4 * go) + "");
            fekra[j].getDraw().wire38.setText((((intpc + (4 * go)) - (fekra[j].getMypc() + 4)) / 4) + "");
            fekra[j].getDraw().wire16.setText(((intpc + (4 * go)) - (fekra[j].getMypc() + 4)) + "");
            binary32 = convertbin(((intpc + (4 * go)) - (fekra[j].getMypc() + 4)) / 4);
            fekra[j].getDraw().wire40.setText(prnt32(binary32));
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRd().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRd().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRd().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire27.setText(fekra[j].getRd().getValue() + "");
            fekra[j].getDraw().wire23.setText((fekra[j].getRd().getValue() - fekra[j].getRs().getValue()) + "");
            if (fekra[j].getDraw().wire23.getText().equals("0")) {
                fekra[j].getDraw().wire11.setText("");
                fekra[j].getDraw().wire9.setText("1");
                fekra[j].setJumping(true);
                fekra[j].getDraw().wire9.setForeground(Color.green);
                fekra[j].getDraw().wire11.setText(intpc + (4 * go) + "");
            } else {
                fekra[j].getDraw().wire11.setText((pcValue + 4) + "");
                fekra[j].getDraw().wire9.setText("0");
                fekra[j].getDraw().wire9.setForeground(Color.red);
            }

        } else if (fekra[j].getInst().equals("addi")) {
            obaddi[drawcount] = new addi(this);
            fekra[j].setDraw(obaddi[drawcount]);
            fekra[j].getDraw().wire11.setText((fekra[j].getMypc() + 4) + "");
            fekra[j].getDraw().wire12.setText(fekra[j].getMypc() + "");
            fekra[j].getDraw().wire11.setText((fekra[j].getMypc() + 4) + "");
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire42.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire41.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire38.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire23.setText(Integer.parseInt(fekra[j].getDraw().wire42.getText()) + Integer.parseInt(fekra[j].getDraw().wire26.getText()) + "");
            fekra[j].getDraw().wire24.setText(Integer.parseInt(fekra[j].getDraw().wire42.getText()) + Integer.parseInt(fekra[j].getDraw().wire26.getText()) + "");
            fekra[j].getDraw().wire39.setText(Integer.parseInt(fekra[j].getDraw().wire42.getText()) + Integer.parseInt(fekra[j].getDraw().wire26.getText()) + "");
            fekra[j].getRt().setValue(Integer.parseInt(fekra[j].getDraw().wire23.getText()));
        } else if (fekra[j].getInst().equals("lw")) {
            oblw[drawcount] = new lw(this);
            fekra[j].setDraw(oblw[drawcount]);
            fekra[j].getDraw().wire12.setText(fekra[j].getMypc() + "");
            fekra[j].getDraw().wire11.setText((fekra[j].getMypc()+ 4) + "");
            address[addresscount] = fekra[j].getRs().getValue() + fekra[j].getImmed();
            value[addresscount] = kiro.load(address[addresscount]);
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire42.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire41.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire38.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire23.setText(Integer.parseInt(fekra[j].getDraw().wire42.getText()) + Integer.parseInt(fekra[j].getDraw().wire26.getText()) + "");
            fekra[j].getDraw().wire39.setText(value[addresscount] + "");
            fekra[j].getDraw().wire22.setText(value[addresscount] + "");
            fekra[j].getRt().setValue(value[addresscount]);
            addresscount++;
        } else if (fekra[j].getInst().equals("sw")) {
            obsw[drawcount] = new sw(this);
            fekra[j].setDraw(obsw[drawcount]);
            fekra[j].getDraw().wire12.setText(fekra[j].getMypc()+ "");
            fekra[j].getDraw().wire11.setText((fekra[j].getMypc() + 4) + "");
            address[addresscount] = fekra[j].getRs().getValue() + fekra[j].getImmed();
            kiro.store(address[addresscount], fekra[j].getRt().getValue());
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire42.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire41.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire38.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire23.setText(Integer.parseInt(fekra[j].getDraw().wire42.getText()) + Integer.parseInt(fekra[j].getDraw().wire26.getText()) + "");
            fekra[j].getDraw().wire27.setText(fekra[j].getRt().getValue() + "");
            fekra[j].getDraw().wire28.setText(fekra[j].getRt().getValue() + "");
            addresscount++;
        } else if (fekra[j].getInst().equals("lb")) {
            oblb[drawcount] = new lb(this);
            fekra[j].setDraw(oblb[drawcount]);
            fekra[j].getDraw().wire12.setText(fekra[j].getMypc()+ "");
            fekra[j].getDraw().wire11.setText((fekra[j].getMypc() + 4) + "");
            address[addresscount] = fekra[j].getRs().getValue() + fekra[j].getImmed();
            value[addresscount] = kiro.load(address[addresscount]);
            String s = binarycutter(convertbin(value[addresscount]), fekra[j].getImmed());
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire42.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire41.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire38.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire23.setText(Integer.parseInt(fekra[j].getDraw().wire42.getText()) + Integer.parseInt(fekra[j].getDraw().wire26.getText()) + "");
            fekra[j].getDraw().wire39.setText(s + "");
            fekra[j].getDraw().wire22.setText(s + "");
            fekra[j].getRt().setValue(Integer.parseInt(s, 2));
            addresscount++;
        } else if (fekra[j].getInst().equals("lbu")) {
            oblbu[drawcount] = new lbu(this);
            fekra[j].setDraw(oblbu[drawcount]);
            fekra[j].getDraw().wire12.setText(pcValue + "");
            fekra[j].getDraw().wire11.setText((pcValue + 4) + "");
            address[addresscount] = fekra[j].getRs().getValue() + fekra[j].getImmed();
            value[addresscount] = kiro.load(address[addresscount]);
            String s = binarycutter(convertbin(value[addresscount]), fekra[j].getImmed());
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire42.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire41.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire38.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire23.setText(Integer.parseInt(fekra[j].getDraw().wire42.getText()) + Integer.parseInt(fekra[j].getDraw().wire26.getText()) + "");
            fekra[j].getDraw().wire39.setText(s + "");
            fekra[j].getDraw().wire22.setText(s + "");
            fekra[j].getRt().setValue(Integer.parseUnsignedInt(s, 2));
            addresscount++;

        } else if (fekra[j].getInst().equals("sb")) {
            obsb[drawcount] = new sb(this);
            fekra[j].setDraw(obsb[drawcount]);
            fekra[j].getDraw().wire12.setText(pcValue + "");
            fekra[j].getDraw().wire11.setText((pcValue + 4) + "");
            address[addresscount] = fekra[j].getRs().getValue() + Integer.parseInt(fekra[j].getImmed() + "");
            kiro.store(address[addresscount], Integer.parseInt(binarycutter(convertbin(value[addresscount]), Integer.parseInt(fekra[j].getImmed() + ""))));
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire42.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire41.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire38.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire23.setText(Integer.parseInt(fekra[j].getDraw().wire42.getText()) + Integer.parseInt(fekra[j].getDraw().wire26.getText()) + "");
            fekra[j].getDraw().wire27.setText(fekra[j].getRt().getValue() + "");
            fekra[j].getDraw().wire28.setText(fekra[j].getRt().getValue() + "");
            addresscount++;
        } else if (fekra[j].getInst().equals("slti")) {
            obslti[drawcount] = new slti(this);
            fekra[j].setDraw(obslti[drawcount]);
            fekra[j].getDraw().wire12.setText(pcValue + "");
            fekra[j].getDraw().wire11.setText((pcValue + 4) + "");
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire42.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire41.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire38.setText(fekra[j].getImmed() + "");
            if (fekra[j].getRs().getValue() < Integer.parseInt(fekra[j].getImmed() + "")) {
                fekra[j].getDraw().wire23.setText("1");
                fekra[j].getDraw().wire24.setText("1");
                fekra[j].getDraw().wire39.setText("1");
                fekra[j].getRt().setValue(1);
            } else {

                fekra[j].getDraw().wire23.setText("0");
                fekra[j].getDraw().wire24.setText("0");
                fekra[j].getDraw().wire39.setText("0");
                fekra[j].getRt().setValue(0);

            }
        } else if (fekra[j].getInst().equals("sll")) {
            obslti[drawcount] = new slti(this);
            fekra[j].setDraw(obslti[drawcount]);
            fekra[j].getDraw().wire12.setText(pcValue + "");
            fekra[j].getDraw().wire11.setText((pcValue + 4) + "");
            fekra[j].getDraw().wire34.setText(fekra[j].getRs().getId());
            fekra[j].getDraw().wire35.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire32.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire37.setText(fekra[j].getRt().getId());
            fekra[j].getDraw().wire26.setText(fekra[j].getRs().getValue() + "");
            fekra[j].getDraw().wire42.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire41.setText(fekra[j].getImmed() + "");
            fekra[j].getDraw().wire38.setText(fekra[j].getImmed() + "");
            if (fekra[j].getRs().getValue() < Integer.parseInt(fekra[j].getImmed() + "")) {
                fekra[j].getDraw().wire23.setText("1");
                fekra[j].getDraw().wire24.setText("1");
                fekra[j].getDraw().wire39.setText("1");

            } else {

                fekra[j].getDraw().wire23.setText("0");
                fekra[j].getDraw().wire24.setText("0");
                fekra[j].getDraw().wire39.setText("0");

            }
            fekra[j].getRt().setValue(fekra[j].getRs().getValue() * 2 * fekra[j].getImmed());
        } else if (fekra[j].getInst().equals("jr")) {
            objr[drawcount] = new jr(this);
            objr[drawcount].wire11.setText((pcValue+4) + "");
            objr[drawcount].wire15.setText((pcValue+4) + "");
            objr[drawcount].wire19.setText((pcValue+4) + "");
            objr[drawcount].wire17.setText((pcValue+4) + "");
            objr[drawcount].wire12.setText(pcValue + "");
            objr[drawcount].wire13.setText(pcValue + "");
            objr[drawcount].wire30.setText("001000");
            objr[drawcount].wire26.setText(fekra[j].getRs().getValue()+"");
            objr[drawcount].wire34.setText(fekra[j].getRs().getId());
            objr[drawcount].wire44.setText(fekra[j].getRs().getValue()+"");
            objr[drawcount].wire46.setText(fekra[j].getRs().getValue()+"");
        w = new window(objr[drawcount]);
        w.setUndecorated(true);
        w.setVisible(true);
        drawcount++;
        return;
        }

        w = new window(fekra[j].getDraw());
        w.dispose();
        w.setUndecorated(true);
        w.setVisible(true);
        drawcount++;
    }

    public instructions_ar[] getFekra() {
        return fekra;
    }

    public window getW() {
        return w;
    }

    public int[] convertbin(int num) {
        int decval[] = new int[32];
        int binary[] = new int[40];

        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;

        }
        for (int j = index; j < 32; j++) {
            binary[j] = 0;

        }
        for (int i = 31; i >= 0; i--) {

            decval[i] = binary[i];

        }

        return decval;

    }

    public String prnt4(int[] n) {
        String s = "";
        for (int i = 31; i >= 28; i--) {
            s = s + n[i] + "";

        }
        return s;
    }

    public String prnt28(int[] n) {
        String s = "";
        for (int i = 27; i >= 0; i--) {
            s = s + n[i] + "";

        }
        return s;
    }

    public String prnt32(int[] n) {
        String s = "";
        for (int i = 31; i >= 0; i--) {
            s = s + n[i] + "";

        }
        return s;
    }

    public String binarycutter(int[] n, int c) {
        String s = "";
        switch (c) {

            case 0:
                for (int i = 7; i >= 0; i--) {
                    s = s + n[i] + "";

                }

                break;
            case 1:
                for (int i = 15; i >= 8; i--) {
                    s = s + n[i] + "";

                }

                break;
            case 2:

                for (int i = 23; i >= 16; i--) {
                    s = s + n[i] + "";

                }
                break;
            case 3:

                for (int i = 31; i >= 24; i--) {
                    s = s + n[i] + "";

                }
                break;

        }
        return s;

    }

}