import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JColorFrame extends JFrame implements ActionListener {
    JButton changeColor = new JButton("Change Color");
    JButton north = new JButton("North");
    JButton south = new JButton("South");
    JButton west = new JButton("West");
    JButton east = new JButton("East");
    int numberOfClicks = 0;

    public JColorFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Color Frame");
        setLayout(new BorderLayout());

        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(west, BorderLayout.WEST);
        add(east, BorderLayout.EAST);
        add(changeColor, BorderLayout.CENTER);
        changeColor.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numberOfClicks ++;
        if (numberOfClicks == 1){
            north.setBackground(Color.BLACK);
        }
        if (numberOfClicks == 2) {
            west.setBackground(Color.YELLOW);
        }
        if (numberOfClicks == 3){
            south.setBackground(Color.BLUE);
        }
        if (numberOfClicks == 4){
            east.setBackground(Color.RED);
        }
        if (numberOfClicks > 4){
            north.setBackground(new JButton().getBackground());
            south.setBackground(new JButton().getBackground());
            east.setBackground(new JButton().getBackground());
            west.setBackground(new JButton().getBackground());
            numberOfClicks = 0;
        }
    }
    public static void main (String[] args){

        JColorFrame frame = new JColorFrame();
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
