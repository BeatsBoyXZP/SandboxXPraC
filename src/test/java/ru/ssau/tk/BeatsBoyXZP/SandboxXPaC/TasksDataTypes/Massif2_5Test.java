package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_5Test {
    Massif2_5 massif2_5=new Massif2_5();
    @Test
    public void testMassif2_5(){
        assertEquals(massif2_5.fibonacciMassif(5),new int[]{1,1,2,3,5});
        assertEquals(massif2_5.fibonacciMassif(10),new int[]{1,1,2,3,5,8,13,21,34,55});
        assertEquals(massif2_5.fibonacciMassif(6),new int[]{1,1,2,3,5,8});
    }

}