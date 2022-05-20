import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    Boolean isOperatorClicked = false;
    String oldvalue;
    int flag=-1;
    float result=0;
    float sum=0,subtract=0;
    char s[] = new char[50];
    JFrame jf;
    JButton sevenbutton;
    JLabel displaylabel;
    JButton eightbutton;
    JButton ninebutton;
    JButton fourbutton;
    JButton fivebutton;
    JButton sixbutton;
    JButton onebutton;
    JButton twobutton;
    JButton threebutton;
    JButton equalbutton;
    JButton zerobutton;
    JButton dotbutton;
    JButton divbutton;
    JButton mulbutton;
    JButton subbutton;
    JButton addbutton, clearbutton;
    public calculator(){
        jf =new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);

        displaylabel = new JLabel();
        displaylabel.setBounds(30,50,540,40);
        displaylabel.setBackground(Color.DARK_GRAY);
        displaylabel.setOpaque(true);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setForeground(Color.BLACK);
        jf.add(displaylabel);

        sevenbutton = new JButton("7");
        sevenbutton.setBounds(30,130,80,80);
        sevenbutton.setFont(new Font("Arial",Font.PLAIN,40));
        sevenbutton.addActionListener(this);
        jf.add(sevenbutton);

        eightbutton = new JButton("8");
        eightbutton.setBounds(130,130,80,80);
        eightbutton.setFont(new Font("Arial",Font.PLAIN,40));
        eightbutton.addActionListener(this);
        jf.add(eightbutton);

        ninebutton = new JButton("9");
        ninebutton.setBounds(230,130,80,80);
        ninebutton.setFont(new Font("Arial",Font.PLAIN,40));
        ninebutton.addActionListener(this);
        jf.add(ninebutton);

        fourbutton = new JButton("4");
        fourbutton.setBounds(30,230,80,80);
        fourbutton.setFont(new Font("Arial",Font.PLAIN,40));
        fourbutton.addActionListener(this);
        jf.add(fourbutton);

        fivebutton = new JButton("5");
        fivebutton.setBounds(130,230,80,80);
        fivebutton.setFont(new Font("Arial",Font.PLAIN,40));
        fivebutton.addActionListener(this);
        jf.add(fivebutton);

        sixbutton = new JButton("6");
        sixbutton.setBounds(230,230,80,80);
        sixbutton.setFont(new Font("Arial",Font.PLAIN,40));
        sixbutton.addActionListener(this);
        jf.add(sixbutton);

        onebutton = new JButton("1");
        onebutton.setBounds(30,330,80,80);
        onebutton.setFont(new Font("Arial",Font.PLAIN,40));
        onebutton.addActionListener(this);
        jf.add(onebutton);

        twobutton = new JButton("2");
        twobutton.setBounds(130,330,80,80);
        twobutton.setFont(new Font("Arial",Font.PLAIN,40));
        twobutton.addActionListener(this);
        jf.add(twobutton);

        threebutton = new JButton("3");
        threebutton.setBounds(230,330,80,80);
        threebutton.setFont(new Font("Arial",Font.PLAIN,40));
        threebutton.addActionListener(this);
        jf.add(threebutton);

        equalbutton = new JButton("=");
        equalbutton.setBounds(30,430,80,80);
        equalbutton.setFont(new Font("Arial",Font.PLAIN,40));
        equalbutton.addActionListener(this);
        jf.add(equalbutton);

        zerobutton = new JButton("0");
        zerobutton.setBounds(130,430,80,80);
        zerobutton.setFont(new Font("Arial",Font.PLAIN,40));
        zerobutton.addActionListener(this);
        jf.add(zerobutton);

        dotbutton = new JButton(".");
        dotbutton.setBounds(230,430,80,80);
        dotbutton.setFont(new Font("Arial",Font.PLAIN,40));
        dotbutton.addActionListener(this);
        jf.add(dotbutton);

        divbutton = new JButton("/");
        divbutton.setBounds(330,130,80,80);
        divbutton.setFont(new Font("Arial",Font.PLAIN,40));
        divbutton.addActionListener(this);
        jf.add(divbutton);

        mulbutton = new JButton("X");
        mulbutton.setBounds(330,230,80,80);
        mulbutton.setFont(new Font("Arial",Font.PLAIN,40));
        mulbutton.addActionListener(this);
        jf.add(mulbutton);

        subbutton = new JButton("-");
        subbutton.setBounds(330,330,80,80);
        subbutton.setFont(new Font("Arial",Font.PLAIN,40));
        subbutton.addActionListener(this);
        jf.add(subbutton);

        addbutton = new JButton("+");
        addbutton.setBounds(330,430,80,80);
        addbutton.setFont(new Font("Arial",Font.PLAIN,40));
        addbutton.addActionListener(this);
        jf.add(addbutton);

        clearbutton = new JButton("CLEAR");
        clearbutton.setBounds(430,430,80,80);
       // clearbutton.setFont(new Font("Arial",Font.PLAIN,40));
        clearbutton.addActionListener(this);
        jf.add(clearbutton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){

        calculator c =new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== sevenbutton){
            if(isOperatorClicked){
                displaylabel.setText("7");
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText() + "7");
            }
        }
        else if(e.getSource()== eightbutton){
            if(isOperatorClicked){
                displaylabel.setText("8");
                isOperatorClicked=false;
            }
            else {
                displaylabel.setText(displaylabel.getText() + "8");
            }
        } else if (e.getSource()== ninebutton) {
            if(isOperatorClicked){
                displaylabel.setText("9");
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText() + "9");
            }
        } else if (e.getSource()== fourbutton) {
            if(isOperatorClicked){
                displaylabel.setText("4");
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText() + "4");
            }
        } else if (e.getSource()== fivebutton) {
            if(isOperatorClicked){
                displaylabel.setText("5");
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText() + "5");
            }
        } else if (e.getSource()==sixbutton) {
            if(isOperatorClicked){
                displaylabel.setText("6");
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText() + "6");
            }
        } else if (e.getSource()==onebutton) {
            if(isOperatorClicked){
                displaylabel.setText("1");
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText() + "1");
            }
        } else if (e.getSource()==twobutton) {
            if(isOperatorClicked){
                displaylabel.setText("2");
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText() + "2");
            }
        } else if (e.getSource()==threebutton) {
            if(isOperatorClicked){
                displaylabel.setText("3");
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText() + "3");
            }
        } else if (e.getSource()==equalbutton) {
            if(flag==0) {
                String newvalue = displaylabel.getText();
                float oldvaluef = Float.parseFloat(oldvalue);
                float newvaluef = Float.parseFloat(newvalue);

                result = oldvaluef + newvaluef;


                displaylabel.setText(result + "");
                flag = -1;

            } else if (flag==1) {
                String newvalue = displaylabel.getText();
                float oldvaluef = Float.parseFloat(oldvalue);
                float newvaluef = Float.parseFloat(newvalue);
               /*for(int i=0; i<s.length; i++){
                   s[i]= (char) Float.parseFloat(String.valueOf(s[i]));
                }
               for(int i =0; i< s.length;i++){
                    subtract = subtract-s[i];
               }*/

                result = oldvaluef - newvaluef;

                displaylabel.setText(result+ "");
                flag = -1;

            } else if (flag==2) {
                String newvalue = displaylabel.getText();
                float oldvaluef = Float.parseFloat(oldvalue);
                float newvaluef = Float.parseFloat(newvalue);

                 result = oldvaluef * newvaluef;

                displaylabel.setText(result + "");
                flag = -1;

            } else if (flag==3) {
                String newvalue = displaylabel.getText();
                float oldvaluef = Float.parseFloat(oldvalue);
                float newvaluef = Float.parseFloat(newvalue);

                 result = oldvaluef / newvaluef;

                displaylabel.setText(result + "");
                flag = -1;
            }
        }
        else if (e.getSource()==zerobutton) {
            if(isOperatorClicked){
                displaylabel.setText("0");
                isOperatorClicked=false;
            }else {
                displaylabel.setText(displaylabel.getText() + "0");
            }
        }

        else if (e.getSource()==dotbutton) {
            if(isOperatorClicked){
                displaylabel.setText(".");
                isOperatorClicked=false;
            }else {
                displaylabel.setText(displaylabel.getText() + ".");
            }
        }

        else if (e.getSource()==divbutton) {
            flag=3;
            isOperatorClicked = true;
            oldvalue = displaylabel.getText();
            char s[]=oldvalue.toCharArray();
            displaylabel.setText("/");
            if(isOperatorClicked == false){
                displaylabel.setText("");
            }
            if(oldvalue=="+"){
                displaylabel.setText("error");
            } else if (oldvalue=="-") {
                displaylabel.setText("error");
            } else if (oldvalue=="X") {
                displaylabel.setText("error");
            } else if (oldvalue=="/") {
                displaylabel.setText("error");
            }
        }

        else if (e.getSource()==mulbutton) {
            flag=2;
            isOperatorClicked = true;
            oldvalue = displaylabel.getText();
            char s[]=oldvalue.toCharArray();
            displaylabel.setText("X");
            if(isOperatorClicked == false){
                displaylabel.setText("");
            }
            if(oldvalue=="+"){
                displaylabel.setText("error");
            } else if (oldvalue=="-") {
                displaylabel.setText("error");
            } else if (oldvalue=="X") {
                displaylabel.setText("error");
            } else if (oldvalue=="/") {
                displaylabel.setText("error");
            }
        }

        else if (e.getSource()==subbutton) {
            flag=1;
            isOperatorClicked = true;
            oldvalue = displaylabel.getText();
            char s[]=oldvalue.toCharArray();
            displaylabel.setText("-");
            if(isOperatorClicked == false){
                displaylabel.setText("");
            }
            if(oldvalue=="+"){
                displaylabel.setText("error");
            } else if (oldvalue=="-") {
                displaylabel.setText("error");
            } else if (oldvalue=="X") {
                displaylabel.setText("error");
            } else if (oldvalue=="/") {
                displaylabel.setText("error");
            }
        }

        else if (e.getSource()==addbutton) {
             flag =0;
            isOperatorClicked = true;
                oldvalue = displaylabel.getText();
                char s[] = oldvalue.toCharArray();
                displaylabel.setText("+");
                if (isOperatorClicked == false) {
                    displaylabel.setText("");
                }
                if(oldvalue=="+"){
                    displaylabel.setText("error");
                } else if (oldvalue=="-") {
                    displaylabel.setText("error");
                } else if (oldvalue=="X") {
                    displaylabel.setText("error");
                } else if (oldvalue=="/") {
                    displaylabel.setText("error");
                }
        }

        else if (e.getSource()==clearbutton) {
            displaylabel.setText("");
        }

    }
}
