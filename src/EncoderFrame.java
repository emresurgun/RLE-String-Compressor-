//this class is for getting a user input and sending it to the Encoder result shower
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EncoderFrame extends JFrame implements ActionListener
{
    String UserInput;
    JTextField EncoderTextField;
    JButton BackToMainPageButton;
    JLabel EncoderLabel;
    EncoderFrame()
    {
        //label for telling user how to use TextField
        EncoderLabel=new JLabel("Enter your String here, then press enter");
        EncoderLabel.setForeground(Color.BLUE);
        EncoderLabel.setBounds(25,175,500,100);
        EncoderLabel.setFont(new Font("Arial",Font.PLAIN,20));
        EncoderLabel.setHorizontalAlignment(SwingConstants.LEFT);
        EncoderLabel.setVerticalAlignment(SwingConstants.TOP);
        this.add(EncoderLabel);
        //button attributes for Go Back To Main Page button
        BackToMainPageButton=new JButton("Go Back To Main Page");
        BackToMainPageButton.setBounds(25,350,500,100);
        BackToMainPageButton.setFont(new Font("Arial",Font.PLAIN,20));
        BackToMainPageButton.addActionListener(this);
        this.add(BackToMainPageButton);
        //TextField for getting User input
        EncoderTextField = new JTextField();
        EncoderTextField.setBounds(25,200,500,100);
        EncoderTextField.addActionListener(this);
        this.add(EncoderTextField);
        //frame attributes
        this.setTitle("Encoder");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    //detecting the actions origin
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==EncoderTextField)
        {
            UserInput = EncoderTextField.getText();
            this.dispose();
            new EncoderResultShower(UserInput);
        }
        else if (e.getSource()==BackToMainPageButton)
        {
            this.dispose();
            new MainPage();

        }
    }
}




