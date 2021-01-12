package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SqrtOperationTest {
    SqrtOperation sqrt = new SqrtOperation();

    @Test
    public void applyTestSqrt() {
        assertEquals(sqrt.apply(256), 16, 0.0001);
        assertEquals(sqrt.apply(-16), 0.0 / 0.0, 0.0000001);
        assertEquals(sqrt.apply(1.0 / 0.0), 1.0 / 0.0, 0.000001);
        assertEquals(sqrt.apply(-1.0 / 0.0), 0.0 / 0.0, 0.000001);
        assertEquals(sqrt.apply(0.0 / 0.0), 0.0 / 0.0, 0.0001);
    }

}
