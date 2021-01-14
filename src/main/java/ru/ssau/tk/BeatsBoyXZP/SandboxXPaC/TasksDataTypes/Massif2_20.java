package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Massif2_20 {
    static boolean setArray(int[] array) {
        int _1count = 0;
        int _2count = 0;
        for (int j : array) {
            if (j % array[0] == 0)
                _1count++;
        }
        for (int i : array) {
            if (i % array[array.length - 1] == 0)
                _2count++;
        }
        return _1count > _2count;
    }
}