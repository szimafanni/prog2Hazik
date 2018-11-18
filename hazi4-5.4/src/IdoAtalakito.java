
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
public class IdoAtalakito extends JFrame implements ActionListener {

    public JButton bt;
    public JTextField tf1;
    public JTextField tf2;
    public JTextField tf3;
    public JTextField tf4;
    public JTextField tf5;
    public JTextField tf6;
    public JTextField tf7;
    public JTextField tf8;
    public JTextField tf9;
    public JTextField tf10;
    public JTextField tf11;
    public JTextField tf12;

    public JLabel lb1;
    public JLabel lb2;
    public JLabel lb3;
    public JLabel lb4;
    public JLabel lb5;
    public JLabel lb6;
    public JLabel lb7;
    public JLabel lb8;
    public JLabel lb9;
    public JLabel lb10;
    public JLabel lb11;
    public JLabel lb12;

    public JPanel p1;
    public JPanel p2;
    public JPanel p3;
    public JPanel p4;
    public JPanel p5;
    public JPanel p6;

    public IdoAtalakito() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bt = new JButton("Számol");

        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        tf3 = new JTextField(5);
        tf4 = new JTextField(5);
        tf5 = new JTextField(5);
        tf6 = new JTextField(5);
        tf7 = new JTextField(5);
        tf8 = new JTextField(5);
        tf9 = new JTextField(5);
        tf10 = new JTextField(5);
        tf11 = new JTextField(5);
        tf12 = new JTextField(5);

        lb1 = new JLabel("nap");
        lb2 = new JLabel("óra");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("másodperc");
        lb5 = new JLabel("nap");
        lb6 = new JLabel("óra");
        lb7 = new JLabel("perc");
        lb8 = new JLabel("másodperc");
        lb9 = new JLabel("nap");
        lb10 = new JLabel("óra");
        lb11 = new JLabel("perc");
        lb12 = new JLabel("másodperc");

        p1 = new JPanel();//paraméter nélküli 
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
  FlowLayout f1 = new FlowLayout();

        GridLayout gr = new GridLayout(1, 8);
        setLayout(gr);

        GridLayout gr1 = new GridLayout(1, 8);
        setLayout(gr1);

        GridLayout gr2 = new GridLayout(1, 8);
        setLayout(gr2);

        GridLayout gr3 = new GridLayout(1, 8);
        setLayout(gr3);

        GridLayout gr4 = new GridLayout(1, 8);
        setLayout(gr4);

        p1.add(tf1);
        p1.add(lb1);
        p1.add(tf2);
        p1.add(lb2);
        p1.add(tf3);
        p1.add(lb3);
        p1.add(tf4);
        p1.add(lb4);

        p2.add(tf5);
        p2.add(lb5);
        p2.add(tf6);
        p2.add(lb6);
        p2.add(tf7);
        p2.add(lb7);
        p2.add(tf8);
        p2.add(lb8);

        p3.add(bt);

        p4.add(tf9);
        p4.add(lb9);
        p4.add(tf10);
        p4.add(lb10);
        p4.add(tf11);
        p4.add(lb11);
        p4.add(tf12);
        p4.add(lb12);

        p5.add(p1);
        p5.add(p2);
        p5.add(p3);
        p5.add(p4);

        p6.add(p5);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);

        bt.addActionListener(this);
        pack();

    }

    public static void main(String[] args) {

        IdoAtalakito ido = new IdoAtalakito();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
