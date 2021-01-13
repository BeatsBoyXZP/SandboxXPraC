package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_10Test {
    @Test
    public void testGetGeometricProgression() {
        double[] array = Massif2_10.getGeometricProgression(2, 2, 11);
        assertEquals(array[5], 64, 0.00001);
    }
}
