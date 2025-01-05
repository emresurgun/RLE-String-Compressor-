//this class is for getting encoded input and sending it to the Decoder result shower
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DecoderFrame extends JFrame implements ActionListener
{
    String EncodedInput;
    JTextField DecoderTextField;
    JButton BackToMainPageButton;
    JLabel DecoderLabel;
    DecoderFrame()
    {
        //label for telling user how to use TextField
        DecoderLabel = new JLabel("Enter your encoded String here, then press enter");
        DecoderLabel.setForeground(Color.BLUE);
        DecoderLabel.setBounds(25,175,500,100);
        DecoderLabel.setFont(new Font("Arial",Font.PLAIN,20));
        DecoderLabel.setHorizontalAlignment(SwingConstants.LEFT);
        DecoderLabel.setVerticalAlignment(SwingConstants.TOP);
        this.add(DecoderLabel);

        //button attributes for Go Back To Main Page button
        BackToMainPageButton=new JButton("Go Back To Main Page");
        BackToMainPageButton.setBounds(25,350,500,100);
        BackToMainPageButton.setFont(new Font("Arial",Font.PLAIN,20));
        BackToMainPageButton.addActionListener(this);
        this.add(BackToMainPageButton);

        //TextField for getting EncodedInput from user
        DecoderTextField = new JTextField();
        DecoderTextField.setBounds(25,200,500,100);
        DecoderTextField.addActionListener(this);
        this.add(DecoderTextField);

        //frame attributes
        this.setTitle("Decoder");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    //detecting the actions origin
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==DecoderTextField)
        {
            EncodedInput = DecoderTextField.getText();
            this.dispose();
            new DecoderResultShower(EncodedInput);
        }
        else if (e.getSource()==BackToMainPageButton)
        {
            this.dispose();
            new MainPage();

        }
    }
}
