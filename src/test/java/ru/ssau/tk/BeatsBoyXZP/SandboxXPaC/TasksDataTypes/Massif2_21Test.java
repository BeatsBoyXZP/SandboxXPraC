package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_21Test {

    @Test
    public void testGetNumber() {
        int[] array = new int[]{1,2,3,3,2,1,3};
        assertEquals(Massif2_21.getNumber(array),3);
        int[] temp = new int[]{1,1,1,1,0,0,0,-1};
        assertEquals(Massif2_21.getNumber(temp),1);
    }
}
