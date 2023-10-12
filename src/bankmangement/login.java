package bankmangement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
                                          
public class login extends Frame implements ActionListener
{
    JButton login,signup,clear;
    JTextField tf1;
    JPasswordField tf2;
    login(){
        setTitle("automated teller machine");


        
        setLayout(null);
        /*ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);  */      //changed imageicon into image again
        JLabel label = new JLabel();
        label.setBounds(70,10,100,100);
        
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("OXWARD",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno = new JLabel("CARDNO");
        cardno.setFont(new Font("Raleway",Font.BOLD,18));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
       tf1=new JTextField();
       tf1.setBounds(300,150,230,30);                   
       tf1.setFont(new Font("Arial",Font.BOLD,14));
       add(tf1);
       
        tf2 = new JPasswordField();
        tf2.setBounds(300,220,230,30);
        tf2.setFont(new Font("Arial",Font.BOLD,14));
        add(tf2);
       
       login = new JButton("SIGN IN");
       login.setBounds(300, 300, 100, 30);
       login.setBackground(Color.BLACK);
       login.setForeground(Color.WHITE);
       login.addActionListener(this);
       add(login);
       
       clear = new JButton("clear");
       clear.setBounds(430, 300, 100, 30);
       clear.setBackground(Color.BLACK);
       clear.setForeground(Color.WHITE);
       clear.addActionListener(this);
       add(clear);
       
       signup = new JButton("SIGN up");
       signup.setBounds(300, 350, 230, 30);
       signup.setBackground(Color.BLACK);
       signup.setForeground(Color.WHITE);
       signup.addActionListener(this);
       add(signup);
       
        JLabel pin  = new JLabel("PIN");
        pin.setFont(new Font("raelway",Font.BOLD,18));
        pin.setBounds(120,220,250,30);
        add(pin);
       
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==clear)
        {
            tf1.setText("");
            tf2.setText("");
        }
        else if(ae.getSource()==login)
        {
        conn c=new conn();
        String cardnumber = tf1.getText();
        String pinumber = tf2 .getText();
        String query = "select* from login where cardnumber ='"+cardnumber+"'and pinumber='"+pinumber+"'";
        try{
             ResultSet rs=c.s.executeQuery(query);
             if(rs.next()){
                 setVisible(false);
                 new transaction(pinumber).setVisible(true);
             }else{
                 JOptionPane.showMessageDialog(null,"Incorrrect Card Number or Pin");
             }
        }
        catch(Exception e){
            
            System.out.println(e);}
        }
        else if(ae.getSource()==signup)
        {
            setVisible(false);
            new signup().setVisible(true);
        }
    }
    public static void main(String[] args) {
    
        new login();
    }
}


