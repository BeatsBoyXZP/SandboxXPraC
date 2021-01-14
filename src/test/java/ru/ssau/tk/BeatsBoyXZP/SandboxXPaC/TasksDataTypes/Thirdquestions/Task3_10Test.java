package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_10Test {

    @Test
    public void testSet() {
        String[]array = new String[]{"Great","have","a","nice","may"};
        assertEquals( Task3_10.set(array,"h","e"),1);
        assertEquals(Task3_10.set(array,"a","e"),0);
    }
}