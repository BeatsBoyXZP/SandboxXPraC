package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_18Test {

    @Test
    public void testMaxvalue() {
        int[] array = new int[]{121, 43, 81, 22, 6};
        assertNull(Massif2_18.Maxvalue(new int[]{}), null);

    }
}
