package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.JavaSweeper;

import javax.swing.*;
import java.awt.*;

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

    private void initPanel()
    {
        panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.drawImage(getImage("bomb"), 0 , 0 , this);
                g.drawImage(getImage("num1"), IMAGE_SIZE , 0 , this);
                //g.drawImage(getImage("num1"), IMAGE_SIZE , IMAGE_SIZE , this);
                //g.drawImage(getImage("num1"), 0 , IMAGE_SIZE , this);
            }
        };
        panel.setPreferredSize(new Dimension(COLS * IMAGE_SIZE,ROWS * IMAGE_SIZE));
        add(panel);
    }
    private Image getImage(String name)
    {
        ImageIcon icon = new ImageIcon("res/img/" + name + ".png");
        return icon.getImage();
    }
}
