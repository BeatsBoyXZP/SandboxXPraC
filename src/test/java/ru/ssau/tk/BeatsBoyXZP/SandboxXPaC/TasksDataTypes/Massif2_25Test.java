package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_25Test {

    @Test
    public void testGetArrayNot() {
        int[] array = new int[]{1,2,3,4,5};
        int[] arrayNot = Massif2_25.getArrayNot(array);
        assertEquals(arrayNot[0],-2);
        assertEquals(array[0],1);

    }
}
