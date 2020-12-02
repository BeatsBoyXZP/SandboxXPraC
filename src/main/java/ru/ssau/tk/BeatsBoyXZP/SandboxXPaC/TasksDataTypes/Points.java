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

    public static Point enlarge(Point a1, double w){
        return new Point(a1.x * w, a1.y * 2, a1.z * w);
    }

    public static double length(Point a1){
        return a1.length();
    }

    public static Point opposite(Point a1){
        return new Point(-a1.x, -a1.y, -a1.z);
    }

    public static Point inverse(Point a1) {
        return new Point(1 / a1.x, 1 / a1.y, 1 / a1.z);
    }

}