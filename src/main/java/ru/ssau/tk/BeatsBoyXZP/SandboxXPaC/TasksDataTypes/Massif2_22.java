package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Massif2_22 {
    static int getIndexOftenNumber(int[] array, int number) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                j = i;
            }
        }
        return j;
    }
}
