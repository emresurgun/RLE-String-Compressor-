//this class is for showing the result of the decoding
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DecoderResultShower extends JFrame implements ActionListener
{
    JTextField DecoderSubTextField;
    JButton BackToDecoderButton;
    JButton BackToMainPageButton;
    JLabel DecodedResult;

    DecoderResultShower(String EncodedInput)
    {
        String DecodedString = DecoderAlgorithm.decode(EncodedInput);

        //label for indicating decoded string above the TextField
        DecodedResult=new JLabel("Your decoded string is:");
        DecodedResult.setForeground(Color.BLUE);
        DecodedResult.setBounds(25,175,500,100);
        DecodedResult.setFont(new Font("Arial",Font.PLAIN,20));
        DecodedResult.setHorizontalAlignment(SwingConstants.LEFT);
        DecodedResult.setVerticalAlignment(SwingConstants.TOP);
        this.add(DecodedResult);

        //button attributes for Go Back To Main Page button
        BackToMainPageButton=new JButton("Go Back To Main Page");
        BackToMainPageButton.setBounds(300,350,225,100);
        BackToMainPageButton.setFont(new Font("Arial",Font.PLAIN,20));
        BackToMainPageButton.addActionListener(this);
        this.add(BackToMainPageButton);

        //button attributes for Go Back To Decoder button
        BackToDecoderButton = new JButton("Go Back To Decoder");
        BackToDecoderButton.setBounds(25,350,225,100);
        BackToDecoderButton.setFont(new Font("Arial",Font.PLAIN,20));
        BackToDecoderButton.addActionListener(this);
        this.add(BackToDecoderButton);

        //TextField for showing the decoded string
        DecoderSubTextField = new JTextField();
        DecoderSubTextField.setText(DecodedString);
        DecoderSubTextField.setEditable(false);//make the TextField editable false so user cant change the output by mistake
        DecoderSubTextField.setBounds(25,200,500,100);
        this.add(DecoderSubTextField);

        //frame attributes
        this.setTitle("Decoder Result");
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
        if(e.getSource()==BackToDecoderButton)
        {
            this.dispose();
            new DecoderFrame();
        }
        else if(e.getSource()==BackToMainPageButton)
        {
            this.dispose();
            new MainPage();
        }
    }
}
