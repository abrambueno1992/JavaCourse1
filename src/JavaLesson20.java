import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
public class JavaLesson20 extends JFrame {
    public static void main(String[] args) {
        new JavaLesson20();
    }

    public JavaLesson20() {
        this.setSize(400, 400);
        // set position of window centered
//        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);

        this.setResizable(false);

        this.setVisible(true);
    }
}
