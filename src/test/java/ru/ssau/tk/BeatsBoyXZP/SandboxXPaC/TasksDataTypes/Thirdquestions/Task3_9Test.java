package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_9Test {

    @Test
    public void testGetIndexOf() {
        assertEquals(Task3_9.getIndexOf("Semen Slepakov","en"),3);
        assertEquals(Task3_9.getIndexOf("Hello world","Hell"),0);
    }
}
