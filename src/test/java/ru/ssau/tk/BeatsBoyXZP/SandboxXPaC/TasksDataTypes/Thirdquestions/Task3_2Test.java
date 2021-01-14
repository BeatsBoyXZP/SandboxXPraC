package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions.Task3_1;

import static org.testng.Assert.*;

public class Task3_2Test {

    @Test
    public void testGetStr() {
        String temp = "Hello Zangoose";
        new Task3_2().getStr(temp);
        String _2temp = "Хеллоу Зангусь";
        new Task3_2().getStr(_2temp);
    }
}
