package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Person;

import static org.testng.Assert.*;

public class Task4_1Test {

    @Test
    public void testGetNamesOfPerson() {
        Person person1 = new Person("Kikita", "Nazakov");
        assertEquals(Task4_1.getNamesOfPerson(person1), "Kikita Nazakov");
        Person person2 = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> {
            assertNull(person2);
        });
    }
}
