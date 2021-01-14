package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_24Test {

    @Test
    public void testGetNot() {
        int[] array = new int[]{1,2,3,4,5};
        Massif2_24.getNot(array);
        assertEquals(array[0],-2);
        Massif2_24.getNot(array);
        assertEquals(array[0],1);
    }
}
