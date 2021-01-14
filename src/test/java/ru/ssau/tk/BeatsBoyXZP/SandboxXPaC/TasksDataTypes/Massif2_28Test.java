package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_28Test {

    @Test
    public void testLongToInt() {
        assertEquals(Massif2_28.intToLong(Massif2_28.longToInt(1095L)), 1095L);
        assertEquals(Massif2_28.intToLong(Massif2_28.longToInt(9L)), 9L);
    }
}
