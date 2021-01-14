package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_29Test {

    @Test
    public void testGetArray() {
        int[] array = Massif2_29.getArray(5, 3);
        assertEquals(array[0],3);
        assertEquals(array[1],4);
        assertEquals(array[2],5);
        assertEquals(array[3],1);
    }
}
