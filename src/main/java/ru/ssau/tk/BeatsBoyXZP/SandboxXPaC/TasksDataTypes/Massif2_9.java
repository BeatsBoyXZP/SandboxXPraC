package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Massif2_9 {
    public static int[] setfunction(int beginNumber, int delta, int size) {
        int[] arr = new int[size];
        arr[0] = beginNumber;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + delta;
        }
        return arr;
    }
}
