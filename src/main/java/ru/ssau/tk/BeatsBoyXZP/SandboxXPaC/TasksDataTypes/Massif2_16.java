package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Massif2_16 {
    static boolean setFunction(Integer[] array) {
        for (int i : array) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }
}
