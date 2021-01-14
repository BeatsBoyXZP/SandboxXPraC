package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_4Test {

    @Test
    public void testPalindromeCheck() {
        assertEquals(Task3_4.palindromeCheck("slals"),true);
        assertEquals(Task3_4.palindromeCheck("notIsPalindrome"),false);
        assertEquals(Task3_4.palindromeCheck("i"),true);
    }
}
