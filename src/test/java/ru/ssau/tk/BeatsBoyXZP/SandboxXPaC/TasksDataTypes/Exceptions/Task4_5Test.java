package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions.Task4_5.ClonedObject;
import ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions.Task4_5.NotClonedObject;

public class Task4_5Test {

    @Test
    public void test(){
        ClonedObject clonedObject = new ClonedObject();
        NotClonedObject notClonedObject = new NotClonedObject();

        try {
            clonedObject.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Assert.assertThrows(CloneNotSupportedException.class,()->{ notClonedObject.clone(); });
    }
}
