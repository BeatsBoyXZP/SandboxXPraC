package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_30Test {

    @Test
    public void testGetVector() {
        assertEquals(Massif2_30.getVector(3), new int[][]{{1, 2, 3}, {4,5}, {6}});
    }
}
