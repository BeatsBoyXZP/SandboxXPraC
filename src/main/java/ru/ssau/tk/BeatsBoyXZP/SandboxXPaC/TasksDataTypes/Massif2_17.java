package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Massif2_17 {
    static int numberEven(int[] array) {
        int count = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
