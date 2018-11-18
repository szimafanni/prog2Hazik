
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fanni
 */
public class Szamologep extends JFrame implements ActionListener {

    public JTextField tf1;
    public JButton bt;
    public JButton bt1;
    public JButton bt2;
    public JButton bt3;
    public JButton bt4;
    public JButton bt5;
    public JButton bt6;
    public JButton bt7;
    public JButton bt8;
    public JButton bt9;
    public JButton bt10;
    public JButton bt11;
    public JButton bt12;
    public JButton bt13;
    public JButton bt14;
    public JButton bt15;
    public JButton bt16;
    public JButton bt17;
    public JButton bt18;
    public JButton bt19;
    public JButton bt20;
    public JButton bt21;
    public JButton bt22;
    public JButton bt23;
    public JButton bt24;
    public JButton bt25;
    public JButton bt26;
    public JButton bt27;

    public  JPanel p1;
    public  JPanel p2;
    public  JPanel p3;
    public  JPanel p4;
    public  JPanel p5;
    public  JPanel p6;

    public Szamologep() throws HeadlessException {

        super("Szamologep");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf1 = new JTextField(30);
        bt = new JButton("");
        bt1 = new JButton("Backspace");
        bt2 = new JButton("CE");
        bt3 = new JButton("C");
        bt4 = new JButton("MC");
        bt5 = new JButton("7");
        bt6 = new JButton("8");
        bt7 = new JButton("9");
        bt8 = new JButton("/");
        bt9 = new JButton("sqrt");
        bt10 = new JButton("MR");
        bt11 = new JButton("4");
        bt12 = new JButton("5");
        bt13 = new JButton("6");
        bt14 = new JButton("*");
        bt15 = new JButton("%");
        bt16 = new JButton("MS");
        bt17 = new JButton("1");
        bt18 = new JButton("2");
        bt19 = new JButton("3");
        bt20 = new JButton("-");
        bt21 = new JButton("1/x");
        bt22 = new JButton("M+");
        bt23 = new JButton("0");
        bt24 = new JButton("*/-");
        bt25 = new JButton(",");
        bt26 = new JButton("+");
        bt27 = new JButton("=");

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();

        GridLayout gr0 = new GridLayout(6, 1);
        setLayout(gr0);

        FlowLayout f1 = new FlowLayout();

        GridLayout gr = new GridLayout(1, 1);
        p1.setLayout(gr);

        GridLayout gr2 = new GridLayout(1, 4);
        p2.setLayout(gr2);

        GridLayout gr3 = new GridLayout(1, 6);
        p3.setLayout(gr3);

        GridLayout gr4 = new GridLayout(1, 6);
        p4.setLayout(gr4);

        GridLayout gr5 = new GridLayout(1, 6);
        p5.setLayout(gr5);

        GridLayout gr6 = new GridLayout(1, 6);
        p6.setLayout(gr6);

        p1.add(tf1);

        p2.add(bt);
        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);

        p3.add(bt4);
        p3.add(bt5);
        p3.add(bt6);
        p3.add(bt7);
        p3.add(bt8);
        p3.add(bt9);

        p4.add(bt10);
        p4.add(bt11);
        p4.add(bt12);
        p4.add(bt13);
        p4.add(bt14);
        p4.add(bt15);

        p5.add(bt16);
        p5.add(bt17);
        p5.add(bt18);
        p5.add(bt19);
        p5.add(bt20);
        p5.add(bt21);

        p6.add(bt22);
        p6.add(bt23);
        p6.add(bt24);
        p6.add(bt25);
        p6.add(bt26);
        p6.add(bt27);

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);

    
        bt12.addActionListener(this);  
        pack();

    }

    public static void main(String[] args) {

        Szamologep l = new Szamologep();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == bt12) {
             tf1.setText("5");
         }
    } 
         
  
}
   
 