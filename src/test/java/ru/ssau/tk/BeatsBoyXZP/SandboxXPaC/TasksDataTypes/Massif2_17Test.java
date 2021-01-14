package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_17Test {

    @Test
    public void testNumberEven() {
        int[] array = new int[10];
        for(int i=0;i<array.length;i++){
            array[i] = i;
        }
        assertEquals(Massif2_17.numberEven(array),5);
    }
}
