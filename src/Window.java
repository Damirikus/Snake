import javax.swing.*;
import java.util.*;
import java.util.jar.JarFile;


public class Window extends JFrame {

    public Window(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640, 665);
        setLocation(400, 1000);
        add(new GameField());
        setVisible(true);
    }
}
