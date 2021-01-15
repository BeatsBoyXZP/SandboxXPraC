package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_20Test {

    @Test
    public void testGetUnifiedStr() {
        String[] str = {"Great", "have", "a", "nice", "may"};
        assertEquals(Task3_20.getUnifiedStr(str), "Great, have, a, nice, may");
    }
}
