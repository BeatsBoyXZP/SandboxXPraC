package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_13Test {

    @Test
    public void test() {
        String str = "Great have a nice day";
        int maxSizeStr = str.length();
        assertEquals(Task3_13.getStringOfIndex(str, -2, maxSizeStr), str);
        assertEquals(Task3_13.getStringOfIndex(str, 2, maxSizeStr), str.substring(2));
        assertEquals(Task3_13.getStringOfIndex(str, -2, 14), str.substring(0, 14));
        assertEquals(Task3_13.getStringOfIndex(str, 2, 14), str.substring(2, 14));
    }
}
