package bankmangement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class transaction extends JFrame implements ActionListener{
JButton deposit,withrawl,fastcash,ministatement,pinchange,balancenquiry,exit;
    String pinumber;
     transaction(String pinumber){
         this.pinumber=pinumber;
         
         setLayout(null);
         
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);  
         JLabel image =new JLabel(i3);
         image.setBounds(0,0,900,900);
         add(image);
         
         JLabel text = new JLabel("PLEASE SELECT YOUR TRANSACTION");
         text.setBounds(200,300,700,35);
         text.setForeground(Color.WHITE);
         text.setFont(new Font("System" , Font.BOLD,16));
         image.add(text);
         
       deposit = new JButton("deposit");
       deposit.setBounds(170, 415, 150, 30);
       deposit.addActionListener(this);
       add(deposit);
       
       withrawl = new JButton("cash withrawl");
       withrawl.setBounds(355, 415, 150, 30);
       withrawl.addActionListener(this);
       add(withrawl);
       
       fastcash= new JButton("fast cash");
       fastcash.setBounds(170, 450, 150, 30);
       fastcash.addActionListener(this);
       add(fastcash);
       
       ministatement= new JButton("ministatement");
       ministatement.setBounds(355, 450, 150, 30);
       ministatement.addActionListener(this);
       add(ministatement);
       
       pinchange= new JButton("pinchange");
       pinchange.setBounds(170, 485, 150, 30);
       pinchange.addActionListener(this);
       add(pinchange);
       
       balancenquiry= new JButton("balance enquiry");
       balancenquiry.setBounds(355, 485, 150, 30);
       balancenquiry.addActionListener(this);
       add(balancenquiry);
       
       exit= new JButton("EXIT");                                      
       exit.setBounds(355, 520, 150, 30);
       exit.addActionListener(this);
       image.add(exit);
         
         setSize(900,900);
         setLocation(300,0);
         setUndecorated(true);//for removing above line
         setVisible(true);
     }
     
     public void actionPerformed(ActionEvent ae){
         if  (ae.getSource()== exit){
             System.exit(0);
         }else if(ae.getSource()==deposit){
             setVisible(false);
             new deposit(pinumber).setVisible(true);
         }else if(ae.getSource()==withrawl){
             setVisible(false);
             new withraw(pinumber).setVisible(true);
         }else if(ae.getSource()==fastcash){
             setVisible(false);
             new fastcash(pinumber).setVisible(true);

         }else if(ae.getSource()==pinchange){
             setVisible(false);
             new pinchange(pinumber).setVisible(true);
         }
             
         
     }
     
    public static void main(String[] args) {
        new transaction("");{
        
        
        
    }
        
        
    }
    
}
