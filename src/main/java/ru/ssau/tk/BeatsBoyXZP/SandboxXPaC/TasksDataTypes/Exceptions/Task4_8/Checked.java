package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions.Task4_8;

public class Checked extends Exception {
    public static void throwCheckedException() throws Checked {
        throw new Checked();
    }

    public static Checked throwUncheckedException() {
        try {
            throwCheckedException();
        } catch (Checked e) {
            throw new UnChecked(e);
        }
        return null;
    }
}
