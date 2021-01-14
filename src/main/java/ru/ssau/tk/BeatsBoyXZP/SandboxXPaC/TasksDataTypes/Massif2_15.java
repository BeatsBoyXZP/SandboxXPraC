package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Massif2_15 {
    static boolean setArray(int[] arr, int number) {
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
