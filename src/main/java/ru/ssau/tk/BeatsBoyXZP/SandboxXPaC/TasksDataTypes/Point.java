package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import static java.lang.Math.sqrt;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt(x * x + y * y + z * z);
    }
}
