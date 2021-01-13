package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_12Test {

    @Test
    public void testGetDividersOfNumbers() {
        double[] firstArray = Massif2_12.getDividersOfNumbers(6);
        assertEquals(firstArray[0], 1, 0.0001);
        assertEquals(firstArray[1], 2, 0.0001);
        assertEquals(firstArray[2], 3, 0.0001);
    }
}
