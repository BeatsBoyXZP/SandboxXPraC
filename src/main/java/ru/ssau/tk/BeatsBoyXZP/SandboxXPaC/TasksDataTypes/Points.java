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

    public static Point enlarge(Point b, double w){
        return new Point(b.x * w, b.y * 2, b.z * w);
    }

    public static double length(Point b){
        return b.length();
    }

    public static Point opposite(Point b){
        return new Point(-b.x, -b.y, -b.z);
    }

    public static Point inverse(Point b) {
        return new Point(1 / b.x, 1 / b.y, 1 / b.z);
    }

}