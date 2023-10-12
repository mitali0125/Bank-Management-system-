package bankmangement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class pinchange extends JFrame implements ActionListener{
     
    JPasswordField pin,repin;
    JButton change,back;
    String pinumber;
        pinchange(String pinumber)
     {          
         this.pinumber=pinumber;
        setLayout(null);
                
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);  
         JLabel image =new JLabel(i3);
         image.setBounds(0,0,900,900);
         add(image);

         
         JLabel text = new JLabel("Change Your Pin");
         text.setBounds(250,280,500,35);
         text.setForeground(Color.WHITE);
         text.setFont(new Font("System" , Font.BOLD,16));
         image.add(text);
         
         
         JLabel pintext = new JLabel("New Pin");
         pintext.setBounds(165,320,180,25);
         pintext.setForeground(Color.WHITE);
         pintext.setFont(new Font("System" , Font.BOLD,16));
         image.add(pintext);
         
       pin=new JPasswordField();
       pin.setBounds(330,320,180,25);                   
       pin.setFont(new Font("Arial",Font.BOLD,25));
       image.add(pin);

         
         JLabel repintext = new JLabel(" Re-enter New Pin");
         repintext.setBounds(185,360,180,25);
         repintext.setForeground(Color.WHITE);
         repintext.setFont(new Font("System" , Font.BOLD,16));
         image.add(repintext);
         
       repin=new JPasswordField();
       repin.setBounds(330,360,180,25);                   
       repin.setFont(new Font("Arial",Font.BOLD,25));
       image.add(repin);

        change = new JButton("Change");
       change.setBounds(355, 485, 150, 30);
       change.addActionListener(this);
       add(change);

       back = new JButton("Back");
       back.setBounds(355, 520, 150, 30);
       back.addActionListener(this);
       add(back);


         
         setSize(900,900);
         setLocation(300,0);
         setUndecorated(true);
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
        
        try{
            String npin= pin.getText();
            String rpin= repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Enterd pin doesnot match");
                return;
                                   }
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter new pin");
                return;
            }
            if(rpin.equals("")){
              JOptionPane.showMessageDialog(null,"Please  Re-enter newpin");
              return;
            }
            
            conn c = new conn();
            String query1 = "update bank set pinumber = '"+rpin+"' where pin = '"+pinumber+"'";
            String query2 = "update login set pinumber = '"+rpin+"' where pin = '"+pinumber+"'";
            String query3 = "update signuptwo set pinumber = '"+rpin+"' where pin = '"+pinumber+"'";

            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
           JOptionPane.showMessageDialog(null,"Pin changed Suceessfully");
           
           setVisible(false);
           new transaction(rpin).setVisible(true);


            
        } catch (Exception e){
            System.out.println(e);
        }
    }else{
              setVisible(false);
              new transaction(pinumber).setVisible(true);
}
    }
    public static void main(String[] args) {
        new pinchange("").setVisible(true);
    }
}
