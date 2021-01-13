package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_9Test {

    @Test
    public void testSetfunction() {
        double accuracy = 0.00001;
        int[] array = Massif2_9.setfunction(1, 3, 11);
        assertEquals(array[10], 31, accuracy);
    }
}
