package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_27Test {

    @Test
    public void testGetNumber() {
        assertEquals(Massif2_27.isEven(new int[]{1,2,3,4}), new boolean[]{false,true,false,true});
    }
}