//this class is for a MainPage that redirect user to the wanted RLE algorithm
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainPage extends JFrame implements ActionListener {
    JButton EncoderButton;
    JButton DecoderButton;
    JButton HowDoesItWorkButton;
    JLabel MainLabel;
    MainPage()
    {
        //label attributes that contain programs name in the MainPage
        MainLabel = new JLabel("RLE String Encoder-Decoder Algorithm", SwingConstants.CENTER);
        MainLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Bold and large font
        MainLabel.setBounds(25,25,500,200);
        this.add(MainLabel);
        //button attributes for opening encoder
        EncoderButton = new JButton("Encoder");
        EncoderButton.setBounds(25,250,200,100);
        EncoderButton.setFont(new Font("Arial",Font.PLAIN,20));
        EncoderButton.addActionListener(this);
        this.add(EncoderButton);
        //button attributes for opening decoder
        DecoderButton = new JButton("Decoder");
        DecoderButton.setBounds(325,250,200,100);
        DecoderButton.setFont(new Font("Arial",Font.PLAIN,20));
        DecoderButton.addActionListener(this);
        this.add(DecoderButton);
        //button attributes for opening How Does It work
        HowDoesItWorkButton = new JButton("How does the Algorithm Work ?");
        HowDoesItWorkButton.setBounds(25,350,500,115);
        HowDoesItWorkButton.setFont(new Font("Arial",Font.PLAIN,25));
        HowDoesItWorkButton.addActionListener(this);
        this.add(HowDoesItWorkButton);

        //frame attributes
        this.setTitle("RLE Algorithm String Compressor");
        //Every frame in this project have these same instances. Location set relative to null so when a frame is created it get centered respect to screen.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);
        this.setLayout(null);//no layout manager and fixed sized frames used.
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    //Every action listener in this project works with the same idea, getting the source of the action, if it's creating a new frame firstly disposing the current frame than calling the new one.
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==EncoderButton)
        {
            this.dispose();
            new EncoderFrame();
        } else if (e.getSource()==DecoderButton) {
            this.dispose();
            new DecoderFrame();

        } else if (e.getSource()==HowDoesItWorkButton) {
            this.dispose();
            new HowDoesItWorkFrame();

        }
    }
}

