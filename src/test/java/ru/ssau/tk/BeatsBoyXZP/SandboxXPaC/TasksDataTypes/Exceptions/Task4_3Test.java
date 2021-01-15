package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_3Test {

    @Test
    public void testGetCharFromString() {
        String[] arrayStr = new String[]{"Country", "roads", "take", "dreams"};

        assertEquals(Task4_3.getCharFromString(arrayStr,3,4), 'm');

        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Task4_3.getCharFromString(arrayStr,5,0));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Task4_3.getCharFromString(arrayStr,0, 5));
    }
}
