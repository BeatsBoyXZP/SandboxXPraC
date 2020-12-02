package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Points{
    private Points() {
    }

    public static Point sum(Point a1, Point a2){
    return new Point(a1.x + a2.x, a1.y + a2.y, a1.z + a2.z );
    }

    public static Point subtract(Point a1, Point a2){
        return new Point(a1.x - a2.x, a1.y - a2.y, a1.z - a2.z );
    }

    public static Point multiply(Point a1, Point a2){
        return new Point(a1.x * a2.x, a1.y * a2.y, a1.z * a2.z );
    }

    public static Point divide(Point a1, Point a2){
        return new Point(a1.x / a2.x, a1.y / a2.y, a1.z / a2.z );
    }
}