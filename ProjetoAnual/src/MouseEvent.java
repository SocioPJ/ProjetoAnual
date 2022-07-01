import java.awt.*;

import javax.swing.event.MouseInputAdapter;
public class MouseEvent {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(300, 300);
        f.setVisible(true);
        f.addMouseListener(new MouseInputAdapter() {
        });
    }
}