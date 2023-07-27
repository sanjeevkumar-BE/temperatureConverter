import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui implements ActionListener {
    JButton btn_8,btn_clr,btn_convertf,btn_convertc;
    JLabel Display;
    JButton btn_7,btn_9,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_0,btn_dot;
    gui(){
        //JFrame--------------------------------------------------
        JFrame jf=new JFrame("Temperature Converter");
        jf.setSize(600,600);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JLabel---------------------------------------------------
        JLabel credit=new JLabel("Developed by Sanjeevkumar M");
        jf.add(credit);
        credit.setBounds(0,105,550,20);
        credit.setForeground(Color.BLACK);
        credit.setHorizontalAlignment(SwingConstants.RIGHT);
        Display=new JLabel("");
        Display.setBackground(Color.CYAN);
        Display.setBounds(0,50,600,50);
        Display.setOpaque(true);
        Display.setForeground(Color.BLACK);
        jf.add(Display);
        Display.setHorizontalAlignment(SwingConstants.CENTER);
        //JButtons-------------------------------------------------
        btn_7=new JButton("7");
        btn_7.setBounds(100,150,50,50);
        btn_7.addActionListener(this);
        jf.add(btn_7);

        btn_8=new JButton("8");
        btn_8.setBounds(50,150,50,50);
        btn_8.addActionListener(this);
        jf.add(btn_8);

        btn_9=new JButton("9");
        btn_9.setBounds(0,150,50,50);
        btn_9.addActionListener(this);
        jf.add(btn_9);

        btn_6=new JButton("6");
        btn_6.setBounds(150,150,50,50);
        btn_6.addActionListener(this);
        jf.add(btn_6);

        btn_5=new JButton("5");
        btn_5.setBounds(200,150,50,50);
        btn_5.addActionListener(this);
        jf.add(btn_5);

        btn_4=new JButton("4");
        btn_4.setBounds(250,150,50,50);
        btn_4.addActionListener(this);
        jf.add(btn_4);

        btn_3=new JButton("3");
        btn_3.setBounds(300,150,50,50);
        btn_3.addActionListener(this);
        jf.add(btn_3);

        btn_2=new JButton("2");
        btn_2.setBounds(350,150,50,50);
        btn_2.addActionListener(this);
        jf.add(btn_2);

        btn_1=new JButton("1");
        btn_1.setBounds(400,150,50,50);
        btn_1.addActionListener(this);
        jf.add(btn_1);

        btn_0=new JButton("0");
        btn_0.setBounds(460,150,50,50);
        btn_0.addActionListener(this);
        jf.add(btn_0);

        btn_dot=new JButton(".");
        btn_dot.setBounds(520,150,50,50);
        btn_dot.addActionListener(this);
        jf.add(btn_dot);



        btn_convertf=new JButton("Convert To Fahrenheit");
        btn_convertf.setBounds(0,450,300,100);
        btn_convertf.addActionListener(this);
        jf.add(btn_convertf);

        btn_convertc=new JButton("Convert To Celcius");
        btn_convertc.setBounds(300,450,300,100);
        btn_convertc.addActionListener(this);
        jf.add(btn_convertc);

        btn_clr=new JButton("Clear");
        btn_clr.setBounds(0,300,600,100);
        btn_clr.addActionListener(this);
        jf.add(btn_clr);
        




    }
    public static void main(String[] args) {
        new gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_7){
            Display.getText();
            Display.setText(Display.getText()+"7");

        }
        else if(e.getSource()==btn_8){
            Display.getText();
            Display.setText(Display.getText()+"8");
        }
        else if(e.getSource()==btn_9){
            Display.getText();
            Display.setText(Display.getText()+"9");
        }
        else if(e.getSource()==btn_6){
            Display.getText();
            Display.setText(Display.getText()+"6");
        }
        else if(e.getSource()==btn_5){
            Display.getText();
            Display.setText(Display.getText()+"5");
        }
        else if(e.getSource()==btn_4){
            Display.getText();
            Display.setText(Display.getText()+"4");
        }
        else if(e.getSource()==btn_3){
            Display.getText();
            Display.setText(Display.getText()+"3");
        }
        else if(e.getSource()==btn_2){
            Display.getText();
            Display.setText(Display.getText()+"2");
        }
        else if(e.getSource()==btn_1){
            Display.getText();
            Display.setText(Display.getText()+"1");
        }
        else if(e.getSource()==btn_0){
            Display.getText();
            Display.setText(Display.getText()+"0");
        }
        else if(e.getSource()==btn_dot){
            Display.getText();
            Display.setText(Display.getText()+".");
        }
        else if(e.getSource()==btn_convertf){
            String value=Display.getText();
            Float value1=Float.parseFloat(value);
            Float result=(value1*9/5)+32;
            Display.setText(result+" "+"Fahrenheit");
        }
        else if(e.getSource()==btn_convertc) {
            String value = Display.getText();
            Float value1 = Float.parseFloat(value);
            Float result = (value1 - 32) * 5 / 9;
            Display.setText(result + " "+"Celcius");
        }
        else{
            Display.setText("");
        }
    }
}
