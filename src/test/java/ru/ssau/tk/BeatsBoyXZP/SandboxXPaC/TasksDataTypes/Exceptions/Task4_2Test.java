package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_2Test {
    @Test
    public void testNthSymbols() {
        String[] str = {"Country", "roads", "take", "me", "home"};

        assertEquals(Task4_2.nthSymbols(str, 1), new String[]{"o", "o", "a", "e", "o"});

        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> assertEquals(Task4_2.nthSymbols(str, 2),
                        new String[]{"u", "a", "k", "", "m"}));

        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(Task4_2.nthSymbols(null, 0)));

        String[] str1 = {null, "null"};

        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(Task4_2.nthSymbols(str1, 0)));
    }
}