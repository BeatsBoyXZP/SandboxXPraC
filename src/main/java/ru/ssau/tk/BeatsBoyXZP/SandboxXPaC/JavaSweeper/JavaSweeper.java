package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.JavaSweeper;

import javax.swing.*;
import java.awt.*;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.JavaSweeper.Sweeper.Box;

public class JavaSweeper extends JFrame {
    private final int IMAGE_SIZE = 50;
    private final int COLS = 15;
    private final int ROWS = 1;
    private JPanel panel;
    public static void main(String[] args)
    {
        new JavaSweeper();
    }
    private JavaSweeper(){
        setImages();
        initPanel();
        initFrame();
    }

    private void initFrame()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaSweeper");
        setVisible(true);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }

    private void setImages()
    {
        for (Box box : Box.values())
            box.image = getImage(box.name().toLowerCase());
    }

    private void initPanel()
    {
        panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                for (Box box : Box.values())
                    g.drawImage((Image)box.image, box.ordinal() * IMAGE_SIZE , 0 , this);

            }
        };
        panel.setPreferredSize(new Dimension(COLS * IMAGE_SIZE,ROWS * IMAGE_SIZE));
        add(panel);
    }
    private Image getImage(String name)
    {
        ImageIcon icon = new ImageIcon("res/Box/" + name + ".png");
        return icon.getImage();
    }
}
