package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_31Test {

    @Test
    public void testTestToString() {
        Massif2_31 firstMatrix = new Massif2_31(2, 2);
        firstMatrix.setAt(0, 0, 1);
        firstMatrix.setAt(0, 1, 2);
        firstMatrix.setAt(1, 0, 3);
        firstMatrix.setAt(1, 1, 4);
        System.out.println(firstMatrix);

    }
}
