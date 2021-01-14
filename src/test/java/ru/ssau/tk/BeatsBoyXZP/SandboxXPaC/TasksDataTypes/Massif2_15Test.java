package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_15Test {

    @Test
    public void testSetArray() {
        int[] arr = {1,2,3};
        assertEquals(Massif2_15.setArray(arr,3),true);
        assertEquals(Massif2_15.setArray(arr,-1),false);
    }
}
