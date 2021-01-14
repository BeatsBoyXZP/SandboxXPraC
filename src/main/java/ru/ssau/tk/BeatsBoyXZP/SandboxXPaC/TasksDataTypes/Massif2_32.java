package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import java.util.Arrays;

public class Massif2_32 {
    static void sort(Double[] array) {
        for (Double j : array) {
            if (j.isNaN()) {
                return;
            } else {
                Arrays.sort(array);
            }
        }
    }
}
