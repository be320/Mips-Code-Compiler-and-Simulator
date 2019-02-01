
package mipsanimation1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class rf extends JFrame{
    private registerfile r;
    private JLabel name;
    private JLabel index;
    private JLabel value;
    private JLabel name0; //name
    private JLabel index0; //index
    private JLabel value0; //value
    
    private JLabel name1;
    private JLabel index1;
    private JLabel value1;
    
    private JLabel name2;
    private JLabel index2;
    private JLabel value2;
    
    private JLabel name3;
    private JLabel index3;
    private JLabel value3;
    
    private JLabel name4;
    private JLabel index4;
    private JLabel value4;
    
    private JLabel name5;
    private JLabel index5;
    private JLabel value5;
    
    private JLabel name6;
    private JLabel index6;
    private JLabel value6;
    
    private JLabel name7;
    private JLabel index7;
    private JLabel value7;
    
    private JLabel name8;
    private JLabel index8;
    private JLabel value8;
    
    private JLabel name9;
    private JLabel index9;
    private JLabel value9;
    
    private JLabel name10;
    private JLabel index10;
    private JLabel value10;
    
    private JLabel name11;
    private JLabel index11;
    private JLabel value11;
    
    private JLabel name12;
    private JLabel index12;
    private JLabel value12;
    
    private JLabel name13;
    private JLabel index13;
    private JLabel value13;
    
    private JLabel name14;
    private JLabel index14;
    private JLabel value14;
    
    private JLabel name15;
    private JLabel index15;
    private JLabel value15;
    
    private JLabel name16;
    private JLabel index16;
    private JLabel value16;
    
    private JLabel name17;
    private JLabel index17;
    private JLabel value17;
    
    private JLabel name18;
    private JLabel index18;
    private JLabel value18;
    
    private JLabel name19;
    private JLabel index19;
    private JLabel value19;
    
    private JLabel name20;
    private JLabel index20;
    private JLabel value20;
    
    private JLabel name21;
    private JLabel index21;
    private JLabel value21;
    
    private JLabel name22;
    private JLabel index22;
    private JLabel value22;
    
    private JLabel name23;
    private JLabel index23;
    private JLabel value23;
    
    private JLabel name24;
    private JLabel index24;
    private JLabel value24;
    
    private JLabel name25;
    private JLabel index25;
    private JLabel value25;
    
    private JLabel name26;
    private JLabel index26;
    private JLabel value26;
    
    private JLabel name27;
    private JLabel index27;
    private JLabel value27;
    
    private JLabel name28;
    private JLabel index28;
    private JLabel value28;
    
    private JLabel name29;
    private JLabel index29;
    private JLabel value29;
    
    private JLabel name30;
    private JLabel index30;
    private JLabel value30;
    
    private JLabel name31;
    private JLabel index31;
    private JLabel value31;
    
    private JPanel all=new JPanel();
    private Graphics g=this.getGraphics();
    public rf(registerfile r)
    {
    this.r=r;
    name=new JLabel("NAME");
    index=new JLabel("NUMBER");
    value=new JLabel("VALUE");
    name0=new JLabel(r.getRegister(0).getName()); //name
    index0=new JLabel(r.getRegister(0).getIndex()+""); //index
    value0=new JLabel(r.getRegister(0).getValue()+""); //value
    
    name1=new JLabel(r.getRegister(1).getName());
    index1=new JLabel(r.getRegister(1).getIndex()+"");
    value1=new JLabel(r.getRegister(1).getValue()+"");
    
    name2=new JLabel(r.getRegister(2).getName());
    index2=new JLabel(r.getRegister(2).getIndex()+"");
    value2=new JLabel(r.getRegister(2).getValue()+"");
    
    name3=new JLabel(r.getRegister(3).getName());
    index3=new JLabel(r.getRegister(3).getIndex()+"");
    value3=new JLabel(r.getRegister(3).getValue()+"");
    
    name4=new JLabel(r.getRegister(4).getName());
    index4=new JLabel(r.getRegister(4).getIndex()+"");
    value4=new JLabel(r.getRegister(4).getValue()+"");
    
     name5=new JLabel(r.getRegister(5).getName());
   index5=new JLabel(r.getRegister(5).getIndex()+"");
     value5=new JLabel(r.getRegister(5).getValue()+"");
    
   name6=new JLabel(r.getRegister(6).getName());
   index6=new JLabel(r.getRegister(6).getIndex()+"");
    value6=new JLabel(r.getRegister(6).getValue()+"");
    
     name7=new JLabel(r.getRegister(7).getName());
     index7=new JLabel(r.getRegister(7).getIndex()+"");
     value7=new JLabel(r.getRegister(7).getValue()+"");
    
   name8=new JLabel(r.getRegister(8).getName());
     index8=new JLabel(r.getRegister(8).getIndex()+"");
     value8=new JLabel(r.getRegister(8).getValue()+"");
    
     name9=new JLabel(r.getRegister(9).getName());
     index9=new JLabel(r.getRegister(9).getIndex()+"");
     value9=new JLabel(r.getRegister(9).getValue()+"");
    
     name10=new JLabel(r.getRegister(10).getName());
     index10=new JLabel(r.getRegister(10).getIndex()+"");
     value10=new JLabel(r.getRegister(10).getValue()+"");
    
     name11=new JLabel(r.getRegister(11).getName());
     index11=new JLabel(r.getRegister(11).getIndex()+"");
     value11=new JLabel(r.getRegister(11).getValue()+"");
    
    name12=new JLabel(r.getRegister(12).getName());
     index12=new JLabel(r.getRegister(12).getIndex()+"");
     value12=new JLabel(r.getRegister(12).getValue()+"");
    
     name13=new JLabel(r.getRegister(13).getName());
     index13=new JLabel(r.getRegister(13).getIndex()+"");
     value13=new JLabel(r.getRegister(13).getValue()+"");
    
     name14=new JLabel(r.getRegister(14).getName());
     index14=new JLabel(r.getRegister(14).getIndex()+"");
     value14=new JLabel(r.getRegister(14).getValue()+"");
    
     name15=new JLabel(r.getRegister(15).getName());
     index15=new JLabel(r.getRegister(15).getIndex()+"");
     value15=new JLabel(r.getRegister(15).getValue()+"");
    
     name16=new JLabel(r.getRegister(16).getName());
     index16=new JLabel(r.getRegister(16).getIndex()+"");
     value16=new JLabel(r.getRegister(16).getValue()+"");
    
     name17=new JLabel(r.getRegister(17).getName());
     index17=new JLabel(r.getRegister(17).getIndex()+"");
     value17=new JLabel(r.getRegister(17).getValue()+"");
    
     name18=new JLabel(r.getRegister(18).getName());
     index18=new JLabel(r.getRegister(18).getIndex()+"");
     value18=new JLabel(r.getRegister(18).getValue()+"");
    
     name19=new JLabel(r.getRegister(19).getName());
     index19=new JLabel(r.getRegister(19).getIndex()+"");
     value19=new JLabel(r.getRegister(19).getValue()+"");
    
     name20=new JLabel(r.getRegister(20).getName());
    index20=new JLabel(r.getRegister(20).getIndex()+"");
     value20=new JLabel(r.getRegister(20).getValue()+"");
    
     name21=new JLabel(r.getRegister(21).getName());
    index21=new JLabel(r.getRegister(21).getIndex()+"");
     value21=new JLabel(r.getRegister(21).getValue()+"");
    
    name22=new JLabel(r.getRegister(22).getName());
     index22=new JLabel(r.getRegister(22).getIndex()+"");
     value22=new JLabel(r.getRegister(22).getValue()+"");
    
     name23=new JLabel(r.getRegister(23).getName());
     index23=new JLabel(r.getRegister(23).getIndex()+"");
     value23=new JLabel(r.getRegister(23).getValue()+"");
    
     name24=new JLabel(r.getRegister(24).getName());
    index24=new JLabel(r.getRegister(24).getIndex()+"");
    value24=new JLabel(r.getRegister(24).getValue()+"");
    
     name25=new JLabel(r.getRegister(25).getName());
     index25=new JLabel(r.getRegister(25).getIndex()+"");
     value25=new JLabel(r.getRegister(25).getValue()+"");
    
     name26=new JLabel(r.getRegister(26).getName());
     index26=new JLabel(r.getRegister(26).getIndex()+"");
     value26=new JLabel(r.getRegister(26).getValue()+"");
    
     name27=new JLabel(r.getRegister(27).getName());
     index27=new JLabel(r.getRegister(27).getIndex()+"");
     value27=new JLabel(r.getRegister(27).getValue()+"");
    
     name28=new JLabel(r.getRegister(28).getName());
     index28=new JLabel(r.getRegister(28).getIndex()+"");
     value28=new JLabel(r.getRegister(28).getValue()+"");
    
     name29=new JLabel(r.getRegister(29).getName());
     index29=new JLabel(r.getRegister(29).getIndex()+"");
     value29=new JLabel(r.getRegister(29).getValue()+"");
    
     name30=new JLabel(r.getRegister(30).getName());
     index30=new JLabel(r.getRegister(30).getIndex()+"");
     value30=new JLabel(r.getRegister(30).getValue()+"");
    
     name31=new JLabel(r.getRegister(31).getName());
     index31=new JLabel(r.getRegister(31).getIndex()+"");
     value31=new JLabel(r.getRegister(31).getValue()+"");
    init();
    }
    public void init()
    {
     
    this.setTitle("REGISTER FILE");
    this.setBounds(1050, 20, 300, 700);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container c=this.getContentPane();
    c.setLayout(new GridLayout(33,3));
    c.setBackground(Color.WHITE);
    
    c.add(name);
    c.add(index);
    c.add(value);
     name.setOpaque(true);
     name.setBackground(Color.yellow);
      index.setOpaque(true);
     index.setBackground(Color.yellow);
      value.setOpaque(true);
     value.setBackground(Color.yellow);
   
    
    c.add(name0);
    c.add(index0);
    c.add(value0);
    
     c.add(name1);
    c.add(index1);
    c.add(value1);
    name1.setOpaque(true);
     name1.setBackground(Color.yellow);
      index1.setOpaque(true);
     index1.setBackground(Color.yellow);
      value1.setOpaque(true);
     value1.setBackground(Color.yellow);
    
     c.add(name2);
    c.add(index2);
    c.add(value2);
    
     c.add(name3);
    c.add(index3);
    c.add(value3);
    name3.setOpaque(true);
     name3.setBackground(Color.yellow);
      index3.setOpaque(true);
     index3.setBackground(Color.yellow);
      value3.setOpaque(true);
     value3.setBackground(Color.yellow);
    
     c.add(name4);
    c.add(index4);
    c.add(value4);
    
     c.add(name5);
    c.add(index5);
    c.add(value5);
    name5.setOpaque(true);
     name5.setBackground(Color.yellow);
      index5.setOpaque(true);
     index5.setBackground(Color.yellow);
      value5.setOpaque(true);
     value5.setBackground(Color.yellow);
    
     c.add(name6);
    c.add(index6);
    c.add(value6);
    
     c.add(name7);
    c.add(index7);
    c.add(value7);
    name7.setOpaque(true);
     name7.setBackground(Color.yellow);
      index7.setOpaque(true);
     index7.setBackground(Color.yellow);
      value7.setOpaque(true);
     value7.setBackground(Color.yellow);
   
     c.add(name8);
    c.add(index8);
    c.add(value8);
    
     c.add(name9);
    c.add(index9);
    c.add(value9);
    name9.setOpaque(true);
     name9.setBackground(Color.yellow);
      index9.setOpaque(true);
     index9.setBackground(Color.yellow);
      value9.setOpaque(true);
     value9.setBackground(Color.yellow);
    
     c.add(name10);
    c.add(index10);
    c.add(value10);
    
     c.add(name11);
    c.add(index11);
    c.add(value11);
    name11.setOpaque(true);
     name11.setBackground(Color.yellow);
      index11.setOpaque(true);
     index11.setBackground(Color.yellow);
      value11.setOpaque(true);
     value11.setBackground(Color.yellow);
    
     c.add(name12);
    c.add(index12);
    c.add(value12);
    
     c.add(name13);
    c.add(index13);
    c.add(value13);
    name13.setOpaque(true);
     name13.setBackground(Color.yellow);
      index13.setOpaque(true);
     index13.setBackground(Color.yellow);
      value13.setOpaque(true);
     value13.setBackground(Color.yellow);
    
     c.add(name14);
    c.add(index14);
    c.add(value14);
    
     c.add(name15);
    c.add(index15);
    c.add(value15);
    name15.setOpaque(true);
     name15.setBackground(Color.yellow);
      index15.setOpaque(true);
     index15.setBackground(Color.yellow);
      value15.setOpaque(true);
     value15.setBackground(Color.yellow);
    
     c.add(name16);
    c.add(index16);
    c.add(value16);
    
     c.add(name17);
    c.add(index17);
    c.add(value17);
    name17.setOpaque(true);
     name17.setBackground(Color.yellow);
      index17.setOpaque(true);
     index17.setBackground(Color.yellow);
      value17.setOpaque(true);
     value17.setBackground(Color.yellow);
    
    c.add(name18);
    c.add(index18);
    c.add(value18);
    
    c.add(name19);
    c.add(index19);
    c.add(value19);
    name19.setOpaque(true);
     name19.setBackground(Color.yellow);
      index19.setOpaque(true);
     index19.setBackground(Color.yellow);
      value19.setOpaque(true);
     value19.setBackground(Color.yellow);

    c.add(name20);
    c.add(index20);
    c.add(value20);
     
    c.add(name21);
    c.add(index21);
    c.add(value21);
    name21.setOpaque(true);
     name21.setBackground(Color.yellow);
      index21.setOpaque(true);
     index21.setBackground(Color.yellow);
      value21.setOpaque(true);
     value21.setBackground(Color.yellow);
     
    c.add(name22);
    c.add(index22);
    c.add(value22);
     
    c.add(name23);
    c.add(index23);
    c.add(value23);
    name23.setOpaque(true);
     name23.setBackground(Color.yellow);
      index23.setOpaque(true);
     index23.setBackground(Color.yellow);
      value23.setOpaque(true);
     value23.setBackground(Color.yellow);
     
    c.add(name24);
    c.add(index24);
    c.add(value24);
     
    c.add(name25);
    c.add(index25);
    c.add(value25);
    name25.setOpaque(true);
     name25.setBackground(Color.yellow);
      index25.setOpaque(true);
     index25.setBackground(Color.yellow);
      value25.setOpaque(true);
     value25.setBackground(Color.yellow);
     
    c.add(name26);
    c.add(index26);
    c.add(value26);
     
    c.add(name27);
    c.add(index27);
    c.add(value27);
    name27.setOpaque(true);
     name27.setBackground(Color.yellow);
      index27.setOpaque(true);
     index27.setBackground(Color.yellow);
      value27.setOpaque(true);
     value27.setBackground(Color.yellow);
     
    c.add(name28);
    c.add(index28);
    c.add(value28);
     
    c.add(name29);
    c.add(index29);
    c.add(value29);
    name29.setOpaque(true);
     name29.setBackground(Color.yellow);
      index29.setOpaque(true);
     index29.setBackground(Color.yellow);
      value29.setOpaque(true);
     value29.setBackground(Color.yellow);
     
    c.add(name30);
    c.add(index30);
    c.add(value30);
     
    c.add(name31);
    c.add(index31);
    c.add(value31);
    name31.setOpaque(true);
     name31.setBackground(Color.yellow);
      index31.setOpaque(true);
     index31.setBackground(Color.yellow);
      value31.setOpaque(true);
     value31.setBackground(Color.yellow);
     
    }
//    all.setBackground(Color.YELLOW);
//    all.add(name);
//    all.add(index);
//    all.add(value);
//    for(int i=0;i<32;i++)
//    {
//    all.add(r.getRegister(i).getValue());
//    }
//    all.setLayout(new GridLayout(2,2));
//     
    
}