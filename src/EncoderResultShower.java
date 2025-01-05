//this class is for showing the compressed version of the string program get from the EncoderFrame class
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EncoderResultShower extends JFrame implements ActionListener
{
    JTextField EncoderSubTextField;
    JButton BackToEncoderButton;
    JButton BackToMainPageButton;
    JLabel EncoderResult;
    EncoderResultShower(String UserInput)
    {
        //calling the compress method from the EncoderAlgorithm and saving the result in a String named compressed
        String compressed = EncoderAlgorithm.compress(UserInput);
        //warning system if compressed string is larger than the UserInput. Still giving the wanted in case user needs it in the compressed style output.
        if(compressed.length()>UserInput.length())
        {
            JOptionPane.showMessageDialog(this,"Be aware that compressed string is larger than the original input","Warning"
                    ,JOptionPane.WARNING_MESSAGE);
        }
        //label for indicating encoded string above the TextField
        EncoderResult=new JLabel("Your encoded string is:");
        EncoderResult.setForeground(Color.BLUE);
        EncoderResult.setBounds(25,175,500,100);
        EncoderResult.setFont(new Font("Arial",Font.PLAIN,20));
        EncoderResult.setHorizontalAlignment(SwingConstants.LEFT);
        EncoderResult.setVerticalAlignment(SwingConstants.TOP);
        this.add(EncoderResult);

        //TextField to show the result of encoding
        EncoderSubTextField = new JTextField();
        EncoderSubTextField.setText(compressed);
        EncoderSubTextField.setEditable(false);//make the TextField editable false so user cant change the output by mistake
        EncoderSubTextField.setBounds(25,200,500,100);
        this.add(EncoderSubTextField);

        //returning users to the MainPage
        BackToMainPageButton=new JButton("Go Back To Main Page");
        BackToMainPageButton.setBounds(300,350,225,100);
        BackToMainPageButton.setFont(new Font("Arial",Font.PLAIN,20));
        BackToMainPageButton.addActionListener(this);
        this.add(BackToMainPageButton);

        //returning users to the encoder input frame
        BackToEncoderButton = new JButton("Go Back To Encoder");
        BackToEncoderButton.setBounds(25,350,225,100);
        BackToEncoderButton.setFont(new Font("Arial",Font.PLAIN,20));
        BackToEncoderButton.addActionListener(this);
        this.add(BackToEncoderButton);

        //frame attributes
        this.setTitle("Encoder Result");
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
        if(e.getSource()==BackToEncoderButton)
        {
            this.dispose();
            new EncoderFrame();
        }
       else if(e.getSource()==BackToMainPageButton)
        {
            this.dispose();
            new MainPage();
        }
    }
}
