
package mipsanimation1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class window extends JFrame{
    private JPanel basma=new JPanel();
//    private Container c=this.getContentPane();
//   private animation anim;
   private static int count=0;
   
    public window(JPanel basma)
    {
    this.basma=basma;
    init();
    }
    public void init()
    {
    this.setTitle("MIPS ANIMATION");
    this.setBounds(0, 50, 1050, 650);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.add(basma);

    }

    public void setBasma(JPanel basma) {
        this.basma = basma;
    }


    
}
    

  

