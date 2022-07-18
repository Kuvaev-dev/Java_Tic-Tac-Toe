import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.swing.*;

public class lap extends JFrame implements ActionListener {
    public JButton btnR, Sub;
    public JRadioButton Rb1, Rb2, Rb3, Rb4, ans, Rb10;
    public JRadioButton Rb5, Rb6, Rb7, Rb8, Rb9;
    public JLabel pl1, pl2, pl3, pl4, pl5;
    public ButtonGroup BG1,BG2;
    public JLabel l1, l2, l3, l4, l5;
    public Container con;
    public String[] Sary;

    public lap() {
        Sary = new String[5];
        for(int x=0; x < Sary.length; x++)
            Sary[x]=" ";

        this.setVisible(true);
        this.setSize(600,435);
        con = getContentPane();
        con.setLayout(null);

        final Box b1 = Box.createVerticalBox();
        final Box b2 = Box.createVerticalBox();
        final Box b3 = Box.createVerticalBox();
        final Box b4 = Box.createVerticalBox();
        final Box b5 = Box.createVerticalBox();
        final Box first = Box.createVerticalBox();
        final Box buy = Box.createVerticalBox();
        final Box choz = Box.createVerticalBox();
        con.setBackground(Color.white);

        l1 = new JLabel("");
        l2 = new JLabel("");
        l3 = new JLabel("");
        l4 = new JLabel("");
        l5 = new JLabel("");

        first.setVisible(true);
        first.setBounds(125, 0, 275, 450);
        first.setBorder(BorderFactory.createTitledBorder(" "));
        con.add(first);
        buy.setVisible(true);
        buy.setBounds(400, 0, 200, 450);
        buy.setBorder(BorderFactory.createTitledBorder("Selected items"));
        con.add(buy);

        BG1 = new ButtonGroup();
        BG2 = new ButtonGroup();

        // CUSTOM SKINS
        Rb1 = new JRadioButton("Soldier Skin");
        Rb2 = new JRadioButton("Samurai Skin");
        Rb3 = new JRadioButton("Ruslan Fateev Skin");
        Rb4 = new JRadioButton("Mage Skin");
        Rb5 = new JRadioButton("Cool Skin");

        pl1 =new JLabel("Price - 1000 PT");
        pl2 =new JLabel("Price - 5000 PT");
        pl3 =new JLabel("Price - 1000000 PT");
        pl4 =new JLabel("Price - 10000 PT");
        pl5 =new JLabel("Price - 500000 PT");

        ImageIcon p1 = new ImageIcon("images\\customskins.jpg");
        JLabel Lp1 = new JLabel(" ", p1, JLabel.CENTER);

        BG1.add(Rb1);
        BG1.add(Rb2);
        BG1.add(Rb3);
        BG1.add(Rb4);
        BG1.add(Rb5);

        b1.add(Box.createRigidArea(new Dimension(0,10)));
        b1.add(Rb1);
        b1.add(pl1);
        b1.add(Box.createRigidArea(new Dimension(0,8)));
        b1.add(Rb2);
        b1.add(pl2);
        b1.add(Box.createRigidArea(new Dimension(0,8)));
        b1.add(Rb3);
        b1.add(pl3);
        b1.add(Box.createRigidArea(new Dimension(0,8)));
        b1.add(Rb4);
        b1.add(pl4);
        b1.add(Box.createRigidArea(new Dimension(0,8)));
        b1.add(Rb5);
        b1.add(pl5);
        b1.add(Lp1);

        Rb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[0]= Rb1.getText();
                l2.setText(Sary[0]);
            }}});
        Rb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[0]= Rb2.getText();
                l2.setText(Sary[0]);
            }}});
        Rb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[0]= Rb3.getText();
                l2.setText(Sary[0]);
            }}});
        Rb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[0]= Rb4.getText();
                l2.setText(Sary[0]);
            }}});
        Rb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[0]= Rb5.getText();
                l2.setText(Sary[0]);
            }}});

        b1.setVisible(false);
        b1.setBounds(125, 0, 275, 450);
        b1.setBorder(BorderFactory.createTitledBorder(" "));
        btnP=new JButton("CUSTOM SKINS");
        btnP.setMaximumSize(new Dimension(120, 25));

        con.add(b1);

        btnP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1.setVisible(true);
                b2.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
                b5.setVisible(false);
                first.setVisible(false);
            }});

        // PREMIUM SKINS
        Rb10 = new JRadioButton("Dark Skin");
        Rb9 = new JRadioButton("Sea Skin");
        Rb6 = new JRadioButton("Haven Skin");
        Rb7 = new JRadioButton("Ultra Skin");
        Rb8 = new JRadioButton("X Skin");

        pl1 = new JLabel("Price - $5");
        pl2 = new JLabel("Price - $7");
        pl3 = new JLabel("Price - $10");
        pl4 = new JLabel("Price - $50");
        pl5 = new JLabel("Price - $200");

        ImageIcon r1 = new ImageIcon("images\\premiumskin.jpg");
        JLabel R1 = new JLabel(" ", r1, JLabel.CENTER);

        BG2.add(Rb10);
        BG2.add(Rb9);
        BG2.add(Rb6);
        BG2.add(Rb7);
        BG2.add(Rb8);

        b2.add(Box.createRigidArea(new Dimension(0,20)));
        b2.add(Rb10);
        b2.add(pl1);
        b2.add(Box.createRigidArea(new Dimension(0,8)));
        b2.add(Rb9);
        b2.add(pl2);
        b2.add(Box.createRigidArea(new Dimension(0,8)));
        b2.add(Rb6);
        b2.add(pl3);
        b2.add(Box.createRigidArea(new Dimension(0,8)));
        b2.add(Rb7);
        b2.add(pl4);
        b2.add(Box.createRigidArea(new Dimension(0,8)));
        b2.add(Rb8);
        b2.add(pl5);
        b2.add(Box.createRigidArea(new Dimension(0,10)));
        b2.add(R1);

        Rb9.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[1]= Rb9.getText();
                l3.setText(Sary[1]);
            }}});
        Rb10.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[1]= Rb10.getText();
                l3.setText(Sary[1]);
            }}});
        Rb6.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[1]= Rb6.getText();
                l3.setText(Sary[1]);
            }}});
        Rb7.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[1]= Rb7.getText();
                l3.setText(Sary[1]);
            }}});
        Rb8.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {{
                Sary[1]= Rb8.getText();
                l3.setText(Sary[1]);
            }}});

        b2.setVisible(false);
        b2.setBounds(125, 0, 275, 450);
        b2.setBorder(BorderFactory.createTitledBorder(" "));
        btnR = new JButton("PREMIUM");
        btnR.setMaximumSize(new Dimension(120, 25));
        con.add(b2);

        btnR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2.setVisible(true);
                b1.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
                b5.setVisible(false);
                first.setVisible(false);
            }});

        // SUBMIT
        Sub = new JButton(" SUBMIT ");
        Sub.setMaximumSize(new Dimension(120, 25));
        Sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int x=0;x<Sary.length;x++)
                    System.out.println(Sary[x]);

                ProductsSelection1 PSL1 =new ProductsSelection1();

                try {
                    setVisible(false);
                    PSL1.getPrice(Sary);
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }});

        buy.add(l1);
        buy.add(l2);
        buy.add(l3);
        buy.add(l4);
        buy.add(l5);

        // REMOVE
        rem = new JButton(" Remove ");
        rem.setMaximumSize(new Dimension(120, 25));
        rem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int x=0;x<Sary.length;x++)
                    Sary[x]=" ";

                l1.setText(" ");
                l2.setText(" ");
                l3.setText(" ");
                l4.setText(" ");
                l5.setText(" ");
            }});

        choz.add( Box.createRigidArea(new Dimension(0,50)));
        choz.add(btnD);
        choz.add( Box.createRigidArea(new Dimension(0,5)));
        choz.add(btnP);
        choz.add( Box.createRigidArea(new Dimension(0,5)));
        choz.add(btnR);
        choz.add( Box.createRigidArea(new Dimension(0,5)));
        choz.add(btnH);
        choz.add( Box.createRigidArea(new Dimension(0,5)));
        choz.add(btnV);

        buy.add( Box.createRigidArea(new Dimension(0,50)));
        ImageIcon image = new ImageIcon("images\\1.jpg");
        JLabel label1 = new JLabel(" ", image, JLabel.CENTER);
        buy.add(label1);
        buy.add(Sub);
        buy.add(rem);
        choz.setBorder(BorderFactory.createTitledBorder("Choose "));
        choz.setBounds(0, 0, 125, 450);
        con.add(choz);
    }

    public void back(String[] ar){
        for(int x=0;x<5;x++){
            Sary[x]= ar[x];
        }

        l2.setText(Sary[0]);
        l3.setText(Sary[1]);
        l4.setText(Sary[2]);
        l5.setText(Sary[3]);
        l1.setText(Sary[4]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}