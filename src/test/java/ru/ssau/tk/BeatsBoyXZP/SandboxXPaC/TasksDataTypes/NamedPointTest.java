package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NamedPointTest {
    NamedPoint point1 = new NamedPoint();
    NamedPoint point2 = new NamedPoint(1, 2, 3);
    NamedPoint point3 = new NamedPoint(1, 2, 3, "B");

    @Test
    public void testNamedPoint1() {
        assertEquals(point1.x, 0d, 0.000001);
        assertEquals(point1.y, 0d, 0.000001);
        assertEquals(point1.z, 0d, 0.0000001);
        assertEquals(point1.getName(), "Origin");
    }

    @Test
    public void testNamedPoint2() {
        assertEquals(point2.x, 1, 0.00001);
        assertEquals(point2.y, 2, 0.00001);
        assertEquals(point2.z, 3, 0.00001);
    }

    @Test
    public void testNamedPoint3() {
        assertEquals(point3.x, 1d, 0.000001);
        assertEquals(point3.y, 2d, 0.000001);
        assertEquals(point3.z, 3d, 0.0000001);
        assertEquals(point3.getName(), "B");
    }
    @Test
    public void testTestToString() {
        assertEquals(new NamedPoint(2., 4., 3., "x").toString(), "x: [2.0, 4.0, 3.0]");
        assertEquals(new NamedPoint(-0, 0, 5).toString(), "[0.0, 0.0, 5.0]");
    }
}
