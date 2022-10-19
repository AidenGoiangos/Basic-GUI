import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    
    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private  JLabel label;
    public GUI(){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Click");
        label = new JLabel("Number of cookeis: 0" + count);

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        button.addActionListener(this);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Main GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of cookeis: " + count);
    }
}
