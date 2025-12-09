 import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    JFrame fobj;
    JButton bobjPlus, bobjMinus, bobjMul, bobjMod;
    JTextField tobj1, tobj2; 
    JLabel NumberLabel1, NumberLabel2, ResultLabel;

    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);
        fobj.setSize(width, height);
        fobj.setLayout(null); 

 
        NumberLabel1 = new JLabel("Number 1:");
        NumberLabel1.setBounds(50, 50, 100, 30);
         
        tobj1 = new JTextField();  
        tobj1.setBounds(150, 50, 150, 30);
       

 
        NumberLabel2 = new JLabel("Number 2:");
        NumberLabel2.setBounds(50, 100, 100, 30);
      
        tobj2 = new JTextField();  
        tobj2.setBounds(150, 100, 150, 30);
        
        
        
        bobjPlus = new JButton("+");
        bobjPlus.setBounds(50, 150, 60, 30); 
        bobjPlus.addActionListener(this);

     
        bobjMinus = new JButton("-");
        bobjMinus.setBounds(115, 150, 60, 30);
        bobjMinus.addActionListener(this);
    
        bobjMul = new JButton("*");
        bobjMul.setBounds(180, 150, 60, 30);
        bobjMul.addActionListener(this);
 
        bobjMod = new JButton("%");
        bobjMod.setBounds(245, 150, 60, 30);
        bobjMod.addActionListener(this);


 
        ResultLabel = new JLabel("Result.:");
        ResultLabel.setBounds(50, 200, 300, 30);
       

        fobj.add(NumberLabel1);
        fobj.add(tobj1);  
        fobj.add(NumberLabel2);
        fobj.add(tobj2);
        fobj.add(bobjPlus);
        fobj.add(bobjMinus);
        fobj.add(bobjMul);
        fobj.add(bobjMod);
        fobj.add(ResultLabel);









        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public void actionPerformed(ActionEvent aobj)
    {
        String Number1_str = tobj1.getText(); 
        String Number2_str = tobj2.getText(); 
        
  
        String command = aobj.getActionCommand(); 

        try 
        {
            int num1 = Integer.parseInt(Number1_str);
            int num2 = Integer.parseInt(Number2_str);
            int result = 0;

            switch (command) 
            {
                case "+":
                    result = num1 + num2;
                    ResultLabel.setText("Sum: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    ResultLabel.setText("Difference: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    ResultLabel.setText("Product: " + result);
                    break;
                case "%":
                    if (num2 == 0) {
                        ResultLabel.setText("Error: Cannot divide by zero.");
                        return;
                    }
                    result = num1 % num2;
                    ResultLabel.setText("Remainder: " + result);
                    break;
            }
        } 
        catch (NumberFormatException e) 
        {
            ResultLabel.setText("Error: Please enter valid integer numbers.");
        }
    }
}

class LoginFrame4
{
    public static void main(String[] args)
    {
         
        new MarvellousLogin("Simple Calculator", 400, 300); 
    }
}