package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_8Test {
    Massif2_8 massif2_8 = new Massif2_8();

    @Test
    public void testMassNatural() {
        assertEquals(massif2_8.massifNatural(9), new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13});
        assertEquals(massif2_8.massifNatural(6), new int[]{1, 2, 4, 5, 7, 8});
        assertEquals(massif2_8.massifNatural(14), new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20});
    }
}
