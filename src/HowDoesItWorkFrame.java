//this class is for showing an example of how rle algorithm works.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HowDoesItWorkFrame extends JFrame implements ActionListener
{
    JLabel HowLabel;
    JButton BackToMainPageButton;
    JScrollPane ScrollPane;
    HowDoesItWorkFrame()
    {
        //Using html for writing mutli line text to the Label.
        HowLabel = new JLabel(
                "<html>"
                        + "<div style='text-align: center;'>"
                        + "<h2 style='color: blue;'>How does the RLE Algorithm work?</h2>"
                        + "<p style='font-size: 16px;'>"
                        + "Run-Length Encoding (RLE) is a simple form of lossless data compression.<br>"
                        + "It works by replacing consecutive identical characters with a single character and its count.<br><br>"
                        + "<b>Example:</b><br>"
                        + "<b>Input String:</b> AAAABBBCCDAA<br>"
                        + "<b>Step-by-step Process:</b><br>"
                        + "1. The first character is 'A'. It repeats 4 times, so we write 'A4'.<br>"
                        + "2. Next, 'B' repeats 3 times, so we write 'B3'.<br>"
                        + "3. 'C' repeats 2 times, so we write 'C2'.<br>"
                        + "4. 'D' appears once, so we write 'D1'.<br>"
                        + "5. Finally, 'A' repeats 2 times, so we write 'A2'.<br><br>"
                        + "<b>Encoded String:</b> A4B3C2D1A2<br><br>"
                        + "The RLE algorithm reduces the size by storing only the character and its frequency.<br>"
                        + "It is efficient for data with many consecutive repeating characters."
                        + "</p>"
                        + "</div>"
                        + "</html>"
        );
        HowLabel.setBounds(0,0,550,350);
        HowLabel.setForeground(Color.BLUE);
        HowLabel.setFont(new Font("Arial", Font.BOLD, 16));
        HowLabel.setHorizontalAlignment(SwingConstants.LEFT);
        HowLabel.setVerticalAlignment(SwingConstants.TOP);
        this.add(HowLabel);
        //adding label to the ScrollPane
        ScrollPane = new JScrollPane(HowLabel);
        ScrollPane.setBounds(0,0,550,350);
        ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(ScrollPane);

        //attributes for Go Back to MainPage button
        BackToMainPageButton=new JButton("Go Back To Main Page");
        BackToMainPageButton.setBounds(25,350,500,100);
        BackToMainPageButton.setFont(new Font("Arial",Font.PLAIN,20));
        BackToMainPageButton.addActionListener(this);
        this.add(BackToMainPageButton);

        //frame attributes
        this.setTitle("How Does It Work ?");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==BackToMainPageButton)
        {
            this.dispose();
            new MainPage();
        }
    }
}
