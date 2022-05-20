import javax.swing.*;
import java.awt.*;

public class calculator {
    public calculator(){
        JFrame jf =new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);

        JLabel displaylabel = new JLabel("Hello");
        displaylabel.setBounds(30,50,540,40);
        displaylabel.setBackground(Color.DARK_GRAY);
        displaylabel.setOpaque(true);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setForeground(Color.BLACK);
        jf.add(displaylabel);

        JButton sevenbutton = new JButton("7");
        sevenbutton.setBounds(30,130,80,80);
        jf.add(sevenbutton);

        JButton eightbutton = new JButton("8");
        eightbutton.setBounds(130,130,80,80);
        jf.add(eightbutton);

        JButton ninebutton = new JButton("9");
        ninebutton.setBounds(230,130,80,80);
        jf.add(ninebutton);

        JButton fourbutton = new JButton("4");
        fourbutton.setBounds(30,230,80,80);
        jf.add(fourbutton);

        JButton fivebutton = new JButton("5");
        fivebutton.setBounds(130,230,80,80);
        jf.add(fivebutton);

        JButton sixbutton = new JButton("6");
        sixbutton.setBounds(230,230,80,80);
        jf.add(sixbutton);

        JButton onebutton = new JButton("1");
        onebutton.setBounds(30,330,80,80);
        jf.add(onebutton);

        JButton twobutton = new JButton("2");
        twobutton.setBounds(130,330,80,80);
        jf.add(twobutton);

        JButton threebutton = new JButton("3");
        threebutton.setBounds(230,330,80,80);
        jf.add(threebutton);

        JButton equalbutton = new JButton("=");
        equalbutton.setBounds(30,430,80,80);
        jf.add(equalbutton);

        JButton zerobutton = new JButton("0");
        zerobutton.setBounds(130,430,80,80);
        jf.add(zerobutton);

        JButton dotbutton = new JButton(".");
        dotbutton.setBounds(230,430,80,80);
        jf.add(dotbutton);

        JButton divbutton = new JButton("/");
        divbutton.setBounds(330,130,80,80);
        jf.add(divbutton);

        JButton mulbutton = new JButton("X");
        mulbutton.setBounds(330,230,80,80);
        jf.add(mulbutton);

        JButton subbutton = new JButton("-");
        subbutton.setBounds(330,330,80,80);
        jf.add(subbutton);

        JButton addbutton = new JButton("+");
        addbutton.setBounds(330,430,80,80);
        jf.add(addbutton);










        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        calculator c =new calculator();
    }
}
