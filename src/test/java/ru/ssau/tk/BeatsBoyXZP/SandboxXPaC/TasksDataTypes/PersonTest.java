package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
        Person person1 = new Person();

        @Test
        public void testGetAndSet() {
            person1.setFirstName("Key");
            person1.setLastName("Black");
            person1.setPassportId(15163);
            assertEquals(person1.getFirstName(), "Key");
            assertEquals(person1.getLastName(), "Black");
            assertEquals(person1.getPassportId(), 15163, 0.000000001);
        }

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