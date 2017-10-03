import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc429278 on 3/10/17.
 */
public class JFontSelector extends JFrame implements ActionListener{

    JButton arial = new JButton("Arial");
    JButton timesNewRoman = new JButton("Times New Roman");
    JButton comicSans = new JButton("Comic Sans MS");
    JButton verdana = new JButton("Verdana");
    JButton tahoma = new JButton("Tahoma");
    JButton changeSize = new JButton("Change Font Size");
    JLabel label = new JLabel();
    int size = 10;

    public JFontSelector(){
        setTitle("Font Selector");
        setLayout(new GridLayout(7, 1));
        add(arial);
        add(timesNewRoman);
        add(comicSans);
        add(verdana);
        add(tahoma);
        add(changeSize);
        add(label);
        arial.addActionListener(this);
        timesNewRoman.addActionListener(this);
        comicSans.addActionListener(this);
        verdana.addActionListener(this);
        tahoma.addActionListener(this);
        changeSize.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == arial){
            label.setFont(new Font("Arial",Font.PLAIN, size));
            label.setText("Arial");
        }
        if (source == timesNewRoman){
            label.setFont(new Font("Times New Roman", Font.PLAIN, size));
            label.setText("Times New Roman");
        }
        if (source == comicSans){
            label.setFont(new Font("Comic Sans MS", Font.PLAIN, size));
            label.setText("Comic Sans MS");
        }
        if (source == verdana){
            label.setFont(new Font("Verdana", Font.PLAIN, size));
            label.setText("Verdana");
        }
        if (source == tahoma) {
            label.setFont(new Font("Tahoma", Font.PLAIN, size));
            label.setText("Tahoma");
        }
        if (source == changeSize){
            if(size < 50){
                label.setFont(new Font("Arial", Font.PLAIN, 50));
                label.setText(Integer.toString(size));
                size++;
            }
            if(size >= 50){
                label.setFont(new Font("Arial", Font.PLAIN, 50));
                label.setText(Integer.toString(size));
                size = 10;
            }
        }

    }

    public static void main (String[] args){
        JFontSelector frame = new JFontSelector();
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}

