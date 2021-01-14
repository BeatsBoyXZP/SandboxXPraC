package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_11Test {

    @Test
    public void testTheNumberOfStringArray() {
        String[] array = new String[]{"Understandble", "have", " a ", "nice ", " day"};
        assertEquals(Task3_11.theNumberOfStringArray(array, "h", "e"), 1);
        assertEquals(Task3_11.theNumberOfStringArray(array,"d","y"),1);
    }
}
