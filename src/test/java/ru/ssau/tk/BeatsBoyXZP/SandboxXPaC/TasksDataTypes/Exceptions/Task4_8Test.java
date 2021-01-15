package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

import org.testng.annotations.Test;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions.Task4_8.*;

import static ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions.Task4_8.Checked.throwCheckedException;

public class Task4_8Test {
    @Test
    public void test() {
        try {
            throwCheckedException();
        } catch (Checked e) {
            e.getCause();
        }

    }
}
