package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testTestToString() {
        Person human = new Person("Alexander", "Petrov", 3124876);
        Person unknown = new Person("Dom", "Kepler", 3212893);

        assertEquals(human.toString(), "Alexander Petrov");
        assertEquals(unknown.toString(), "Dom Kepler");
        unknown.setLastName("");
        assertEquals(unknown.toString(), "Dom");
        human.setFirstName("");
        human.setLastName("");
        assertEquals(human.toString(), "");
    }
}