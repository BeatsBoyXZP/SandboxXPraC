package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Person;
import java.io.*;

public class Task4_6Test {

    @Test
    public void testSet() {
        Object object = new Object();
        Person person = new Person();
        String fileName = "";

        Assert.assertThrows(FileNotFoundException.class, () -> Task4_6.set(new ObjectOutputStream(new FileOutputStream(fileName)), object));
        Assert.assertThrows(ClassCastException.class, () -> Task4_6.set(new ByteArrayOutputStream(), person));
    }
}
