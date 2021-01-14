package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_23Test {

    @Test
    public void testSetArray() {
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        Massif2_23.setArray(array);
        assertEquals(array[0],8);
        assertEquals(array[7],1);
    }
}
