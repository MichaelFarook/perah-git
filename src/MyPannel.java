import javax.swing.*;
import java.awt.*;

public class MyPannel extends JPanel {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;

    MyPannel(){
        this.setPreferredSize(new Dimension(SCREEN_HEIGHT, SCREEN_WIDTH));
        this.setBackground(Color.black);
        this.setFocusable(true);
    }
}
