package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;

public class Task3_19Test {

    @Test
    public void testSet() {
        String str = "Салам Алекуум!";
        String[] arrayStr = Task3_19.parseStringOnArray(str);
        for (String string : arrayStr) {
            System.out.println(string);
        }
    }
}