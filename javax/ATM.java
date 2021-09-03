import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM implements ActionListener
{

    JCheckBox checkBox_balance, checkBox_withdraw, checkBox_deposit;
    JTextField textbox;


    int initial_balance = 1000;
    double balance;


    ATM()
    {

        checkBox_balance = new JCheckBox("Balance");
        checkBox_balance.setVisible(true);
        checkBox_balance.setFocusable(false);
        checkBox_balance.setBounds(10 , 10, 90 ,25);
        checkBox_balance.addActionListener(this);

        checkBox_withdraw = new JCheckBox("Withdraw");
        checkBox_withdraw.setVisible(true);
        checkBox_withdraw.setFocusable(false);
        checkBox_withdraw.setBounds(10 , 40, 90 ,25);

        checkBox_deposit = new JCheckBox("deposit");
        checkBox_deposit.setVisible(true);
        checkBox_deposit.setFocusable(false);
        checkBox_deposit.setBounds(10 , 70, 90 ,25);


        textbox = new JTextField();
        textbox.setVisible(true);
        textbox.setLayout(new FlowLayout());
        textbox.setBounds(10, 120, 385, 200);


        JFrame frame = new JFrame();
        ImageIcon img = new ImageIcon("C:\\Users\\bekit\\Desktop\\logo.png");

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(new Color(0x123456));
        frame.add(checkBox_balance);
        frame.add(checkBox_withdraw);
        frame.add(checkBox_deposit);
        frame.add(textbox);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == checkBox_balance.isSelected() )
        {
           System.out.println("g");
        }
    }
    public static void main(String[] args) 
    {  
        new ATM();
    }
}
