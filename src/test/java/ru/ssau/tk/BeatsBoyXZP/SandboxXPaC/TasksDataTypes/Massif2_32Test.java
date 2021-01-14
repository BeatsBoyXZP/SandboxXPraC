package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_32Test {

    @Test
    public void testSort() {
        Double[] array = new Double[]{Double.NaN,1.,2.};
        Massif2_32.sort(array);
        assertEquals(array[1].doubleValue(),1.);
        assertEquals(array[0].doubleValue(),Double.NaN);
    }
}
