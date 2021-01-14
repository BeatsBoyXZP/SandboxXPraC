package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_22Test {

    @Test
    public void testGetIndexOftenNumber() {
        int[] array = new int[]{1,2,3,4,5,6,7};
        assertEquals(Massif2_22.getIndexOftenNumber(array,1),0);
        assertEquals(Massif2_22.getIndexOftenNumber(array,3),2);
        assertEquals(Massif2_22.getIndexOftenNumber(array,7),6);
    }
}
