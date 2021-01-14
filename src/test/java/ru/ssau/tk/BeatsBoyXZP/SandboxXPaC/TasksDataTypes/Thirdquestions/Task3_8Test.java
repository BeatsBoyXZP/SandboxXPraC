package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_8Test {

    @Test
    public void testIndexof() {
        assertEquals(Task3_8.indexof("Javac", "Ja"), -1);
        assertEquals(Task3_8.indexof("Tik tok", "tok"),4);

    }
}
