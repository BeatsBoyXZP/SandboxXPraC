package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_4Test {

    @Test
    public void testGetIntOfString() {
        assertEquals(Task4_4.getTask4_4("10","5"), 2);

        Assert.assertThrows(ArithmeticException.class,
                () ->   Task4_4.getTask4_4("18","0"));

        Assert.assertThrows(NumberFormatException.class,
                () ->    Task4_4.getTask4_4("w","3"));

        Assert.assertThrows(NumberFormatException.class,
                () ->    Task4_4.getTask4_4("a","z"));
    }
}
