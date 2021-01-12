package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Massif2_6 {
    public int[] sqrMassif(int size) {
        int[] sqr = new int[size];
        for (int i = 0; i < size; i++) {
            sqr[i] = i * i;
        }
        return sqr;
    }
}