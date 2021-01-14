package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_16Test {

    @Test
    public void testSetFunction() {
        Integer[] array = new Integer[2];
        array[1] = null;
        array[0] = 1;
        assertTrue(Massif2_16.setFunction(array));
    }
}
