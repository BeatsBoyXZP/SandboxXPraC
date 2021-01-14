package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_19Test {

    @Test
    public void testSetArrayEven() {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,20};
        //  0 1 2 3 4 5 6 7 8 9
        assertEquals(Massif2_19.setArrayEven(array),25);//1+3+5+7+9
    }
}
