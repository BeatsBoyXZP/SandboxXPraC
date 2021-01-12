package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class ResettableIntGenerator implements IntGenerator, Resettable{
    public int res = 0;

    @Override
    public int nextInt() {
        res++;
        return res - 1;
    }

    @Override
    public void reset() {
        res = 0;
    }
}
