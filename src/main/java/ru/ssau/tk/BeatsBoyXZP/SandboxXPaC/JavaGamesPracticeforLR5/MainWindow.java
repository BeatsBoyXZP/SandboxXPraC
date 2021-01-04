package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.JavaGamesPracticeforLR5;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Snake1");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(400,400);
        setVisible(true);

    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();

    }
}
