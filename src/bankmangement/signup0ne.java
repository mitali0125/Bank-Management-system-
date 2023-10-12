package bankmangement;
        
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class signup0ne extends JFrame implements ActionListener
{ 
    
    long random;
    JTextField adhar,pann;
    JButton next;
    JComboBox religion,category,income,occupation,education;
    JRadioButton syes,sno,eyes,eno;
    
    String formo;
    
    signup0ne(String formo)
        {   
            this.formo=formo;
            setLayout(null);
            
               setTitle("NEW ACCOUNT APPLICATION FORM....PAGE 2");
            
                        
            JLabel AdditionalDetails =new JLabel("PAGE 2: Additional details");
            AdditionalDetails.setFont( new Font("Raleway",Font.BOLD,22));
            AdditionalDetails.setBounds(290, 80, 400, 40);
            add(AdditionalDetails);
            
            JLabel lblreligion =new JLabel("Religion:");
            lblreligion.setFont( new Font("Raleway",Font.BOLD,22));
            lblreligion.setBounds(100, 140, 200, 30);
            add(lblreligion);
            
            String valReligion[]={"hindu","muslim","sikh","christian","buddhism","janisam"};
            religion = new JComboBox(valReligion);
            religion.setBounds(300,140 ,400,30 );
            add(religion);
            
            
            JLabel lblcategory =new JLabel("Category:");
            lblcategory.setFont( new Font("Raleway",Font.BOLD,22));
            lblcategory.setBounds(100, 190, 200, 30);
            add(lblcategory);
            
            String valcategory[]= {"gen","obc","bc","sc/st","other"};
            category = new JComboBox(valcategory);
            category.setBounds(300,190 ,400,30 );
            add(category);
            
            JLabel lblincome =new JLabel("Income:");
            lblincome.setFont( new Font("Raleway",Font.BOLD,22));
            lblincome.setBounds(100, 240, 200, 30);
            add(lblincome);
            
            String valincome[]= {"null","<150000","<250000","<500000","upto100000"};
            income= new JComboBox(valincome);
            income.setBounds(300,240 ,400,30 );
            add(income);
            
            JLabel lbleducation =new JLabel("Educational:");
            lbleducation.setFont( new Font("Raleway",Font.BOLD,22));
            lbleducation.setBounds(100, 290, 200, 30);
            add(lbleducation);
            
            JLabel qualification =new JLabel("Qualification:");
            qualification.setFont( new Font("Raleway",Font.BOLD,22));
            qualification.setBounds(100, 315, 200, 30);
            add(qualification);
            
            String valeducation[]= {"non graduate","graduation","postgraduation","Doctrate","others"};
            education= new JComboBox(valeducation);
            education.setBounds(300,315 ,400,30 );
            add(education);
            
            JLabel lbloccupation  =new JLabel("Occupation:");
            lbloccupation .setFont( new Font("Raleway",Font.BOLD,22));
            lbloccupation.setBounds(100, 390, 200, 30);
            add(lbloccupation);
            
            String valoccupation[]= {"salaried","self employed","Buisnessman","student","retired","others"};
            occupation= new JComboBox(valoccupation);
            occupation.setBounds(300,390 ,400,30 );
            add(occupation);

            JLabel panno  =new JLabel("Pan no.:");
             panno .setFont( new Font("Raleway",Font.BOLD,22));
            panno.setBounds(100, 440, 200, 30);
            add(panno);
            
            pann = new JTextField();
            pann.setFont(new Font("raleway",Font.BOLD,14));
            pann.setBounds(300,430,400,30 );
            add(pann);

            
            JLabel adharno  =new JLabel("Adhar no.:");
            adharno .setFont( new Font("Raleway",Font.BOLD,22));
            adharno.setBounds(100, 490, 200, 30);
            add(adharno);
            
            adhar = new JTextField();
            adhar.setFont(new Font("raleway",Font.BOLD,14));
            adhar.setBackground(Color.WHITE);
            adhar.setBounds(300,490 ,400,30 );
            add(adhar);
            
            JLabel seniorcitizen  =new JLabel("senior citizen:");
            seniorcitizen .setFont( new Font("Raleway",Font.BOLD,22));
            seniorcitizen.setBounds(100, 540, 200, 30);
            add(seniorcitizen);
       
                        
            syes = new JRadioButton("yes");
            syes.setBounds(300, 540,100,30);
            syes.setBackground(Color.WHITE);
            add(syes);

            sno = new JRadioButton("no");
            sno.setBounds(450,540,100,30);
            sno.setBackground(Color.WHITE);
            add(sno);
            
            ButtonGroup answergroup = new ButtonGroup();
            answergroup.add(syes);
            answergroup.add(sno);
            
            
            JLabel existing  =new JLabel("Exisiting acc:");
            existing .setFont( new Font("Raleway",Font.BOLD,22));
            existing.setBounds(100, 590, 200, 30);
            add(existing);
            
            eyes = new JRadioButton("yes");
            eyes.setBounds(300, 590,100,30);
            eyes.setBackground(Color.WHITE);
            add(eyes);

            eno = new JRadioButton("no");
            eno.setBounds(450,590,100,30);
            eno.setBackground(Color.WHITE);
            add(eno);
            
            ButtonGroup eanswergroup = new ButtonGroup();
            eanswergroup.add(eyes);
            eanswergroup.add(eno);
            
            
            next = new JButton("NEXT");
            next.setBackground(Color.WHITE);
            next.setForeground(Color.BLACK);
            next.setFont(new Font("raleway",Font.BOLD,14));
            next.setBounds(620,660,80,30);
            next.addActionListener(this);
            add(next);
            
            
             
            getContentPane().setBackground(Color.white);
                setSize(850,800);
                setLocation(350,10);
                setVisible(true);
        
    
        }
    @Override
    public void actionPerformed(ActionEvent ae )
{
 
 String sreligion  = (String)religion.getSelectedItem();
 String scategory =  (String)category.getSelectedItem();
 String sincome = (String)income.getSelectedItem();
 String seducation =(String)education.getSelectedItem();
 String soccupation =(String)occupation.getSelectedItem();

 String formno = ""+ random;
 
 String seniorcitizen = null;
if(syes.isSelected()){
    seniorcitizen ="yes";
    
} else if(sno.isSelected()){
    seniorcitizen="no";

}
 String exisiting = null;
 if(eyes.isSelected())
 {
     exisiting ="yes";
 }else
 {
     exisiting="no";
 }

 String spann =pann.getText();
 String sadhar=adhar.getText();

 
        try{
          if (religion.equals("")){
              JOptionPane.showMessageDialog(null,"religion is required");
          }  else if(category.equals("")){
              JOptionPane.showMessageDialog(null,"category is required");
             }
          else if(income.equals("")){
              JOptionPane.showMessageDialog(null,"income is required");
             }
          else if(education.equals("")){
              JOptionPane.showMessageDialog(null,"education is required");
             }
                 else if(occupation.equals("")){
              JOptionPane.showMessageDialog(null,"occupation is required");
             }
           else if(pann.equals("")){
              JOptionPane.showMessageDialog(null,"spanno is required");
             }
           else if(adhar.equals("")){
              JOptionPane.showMessageDialog(null,"adharno is required");
             }
           else if(seniorcitizen.equals("")){
              JOptionPane.showMessageDialog(null,"category is required");
             }
             else if(exisiting.equals("")){
              JOptionPane.showMessageDialog(null,"exisiting is required");
             }
          else{
              conn c = new conn();
              String query ="insert into signup0ne values('"+formno+"', '"+sreligion+"' , '"+scategory+"' , '"+sincome+"' , '"+seducation+"'  ,'"+soccupation+"','"+spann+"', '"+sadhar+"','"+seniorcitizen+"','"+exisiting+"' )";
              c.s.executeUpdate(query);
              
              setVisible(false);
              new signuptwo(formno).setVisible(true);
          }
        }
        catch (Exception e){
            System.out.println(e); 
        }
 }
        public static void main(String[] args) 
        {
         new signup0ne("");
    }
}
