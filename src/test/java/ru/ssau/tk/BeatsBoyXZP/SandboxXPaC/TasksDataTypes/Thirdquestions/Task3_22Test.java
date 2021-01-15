package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_22Test {

    @Test
    public void testGetStringOfNumber() {
        assertEquals(Task3_22.getStringOfNumber(3), "012");
        System.out.println(Task3_22.getStringOfNumber(10000));
    }
}
