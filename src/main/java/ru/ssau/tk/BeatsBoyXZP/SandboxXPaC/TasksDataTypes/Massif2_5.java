package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Massif2_5 {
    public int[] fibonacciMassif(int size) {
        int[] fibonacci = new int[size];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < size; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
