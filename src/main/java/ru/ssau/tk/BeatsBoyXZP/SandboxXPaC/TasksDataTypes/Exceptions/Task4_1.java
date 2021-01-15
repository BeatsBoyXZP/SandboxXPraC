package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Person;

public class Task4_1 {
    public static String getNamesOfPerson(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
