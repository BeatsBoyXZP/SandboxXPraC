package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions.Task3_5;

import static org.testng.Assert.*;

public class Task3_7Test {

    @Test
    public void testGetIndexStr() {
        assertEquals(Task3_7.getIndexStr("Semen Slepakov","Semen"),0);
        assertEquals(Task3_7.getIndexStr("Fendi","nd"),2);
        assertEquals(Task3_7.getIndexStr("Abracadabra","da"),6);

    }
}
