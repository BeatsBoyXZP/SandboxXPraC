package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

import org.testng.annotations.Test;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Person;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Point;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.NamedPoint;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Massif2_31;

import static org.testng.Assert.*;

public class Task3_18Test {

    @Test
    public void testGetDescription() {
        Massif2_31 matrix = new Massif2_31(3, 3);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(0, 2, 3);
        matrix.setAt(1, 0, 4);
        matrix.setAt(1, 1, 5);
        matrix.setAt(1, 2, 6);
        matrix.setAt(2, 0, 7);
        matrix.setAt(2, 1, 8);
        matrix.setAt(2, 2, 9);
        Task3_18.getDescription(matrix);
        Task3_18.getDescription(new Person("Key", "Black", 123456));
        Task3_18.getDescription(new Point(0, 1, 2));
        Task3_18.getDescription(new NamedPoint(0, 1, 4, "X"));

    }
}