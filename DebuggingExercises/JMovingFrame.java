import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovingFrame extends JFrame implements ActionListener{
    JButton move = new JButton("Move the frame");
    JLabel label = new JLabel(":)");
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel east = new JPanel();
    JPanel west = new JPanel();
    int numClicks = 0;

    public JMovingFrame(){
        setLayout(new BorderLayout());
        north.add(label);
        add(move, BorderLayout.CENTER);
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        move.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        numClicks++;
        if (numClicks == 1) {
            north.remove(label);
            north.revalidate();
            east.add(label);
        }
        if (numClicks == 2){
            east.remove(label);
            north.revalidate();
            south.add(label);
        }
        if (numClicks == 3){
            south.remove(label);
            north.revalidate();
            west.add(label);
        }
        if (numClicks == 4){
            west.remove(label);
            north.revalidate();
            north.add(label);
        }
        if (numClicks > 4){
            numClicks = 0;
        }

    }
    public static void main (String[] args){
        JMovingFrame frame = new JMovingFrame();
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);

    }
}
