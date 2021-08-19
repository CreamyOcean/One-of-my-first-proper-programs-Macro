package PersonalUtilities.randomUtilities;


import javax.swing.*;
import java.awt.*;

public class AutoFrame extends JFrame {

    public AutoFrame(String title) {
        setTitle(title);
    }

    public void setSVB(int width, int height, boolean vis, LayoutManager layout,  JButton b, int exit){
        setSize(width, height);
        setVisible(vis);
        setLayout(layout);
        add(b);
        setDefaultCloseOperation(exit);


    }

}