package mipsanimation1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class memory extends JFrame
{
private int[] address=new int[20];
public int[] value=new int[20];
private static int valuecount =0;
public JButton btnplus=new JButton ("+");
public JButton btnnext=new JButton("Next");
public JLabel addresslbl=new JLabel("Memory Address");
public JLabel valuelbl =new JLabel("Value");
public JTextField [] txtaddress=new JTextField[100];
public JTextField [] txtval=new JTextField[100];
public static int n=-1;
public static int b=0;
private static int stcount=1;
public memory()
{   
init();
}
public void init()
{
this.setBounds(400,100,600,600);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setTitle("Memory");
Container c=this.getContentPane();
this.setLayout(null);
addresslbl.setBounds(50, 10,200, 100);
c.add(addresslbl);
valuelbl.setBounds(450, 10,200, 100);
c.add(valuelbl);
btnplus.setBounds(270, 250, 60, 60);
btnplus.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent ae) {
n++;
txtaddress[n]=new JTextField("");
txtval[n]=new JTextField("");
txtaddress[n].setBounds(50, 80+b, 100, 30);
c.add(txtaddress[n]);
txtval[n].setBounds(440, 80+b, 100, 30);
c.add(txtval[n]);
b+=40;
repaint();
}
});
c.add(btnplus);
btnnext.setBounds(265, 500, 70, 30);
btnnext.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent ae) {
  
for(int i=0;i<=n;i++)
{
address[i]=Integer.parseInt(txtaddress[i].getText());
value[i]=Integer.parseInt(txtval[i].getText());
    System.out.println(address[i]+"      "+value[i]);
}
createwind();
dispose();


}
});
c.add(btnnext);

}

public JTextField[] getTxtaddress() {
return txtaddress;
}
public JTextField[] getTxtval() {
return txtval;
}


public void createwind()
{
home h=new home(this);
h.setVisible(true);
}
 public int load (int addresss)
    {
        for(int i = 0; i <=n+stcount; i++) {
            if( address[i]== addresss) {
              return value[i];
            }
        }
        return -1;
    }
 
 
    public void store(int addresss, int dataaa)
    {
        for(int i = 0; i <=n; i++) {
            if(address[i] == addresss) {
                value[i]=dataaa;
                return;
            } 
        }
        address[n+stcount]=addresss;
        value[n+stcount]=dataaa;       
         stcount++;
    }
}


//        
//        dataMem.add(new Data(address, data));
//        RegisterFile.getRegister(31).setData(address);
//    }