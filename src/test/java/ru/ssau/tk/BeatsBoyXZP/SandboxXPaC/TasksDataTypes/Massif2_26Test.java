package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_26Test {

    @Test
    public void testGetPairwiseSum() {
        assertEquals(Massif2_26.getPairwiseSum(new int[]{10, 4, 8, 2, 9}), new int[]{14, 10, 9});
        assertEquals(Massif2_26.getPairwiseSum(new int[]{10, 4, 8, 2, 9, 1, 2, 5}), new int[]{14, 10, 10, 7});

    }
}