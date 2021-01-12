package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class IntGeneratorImpl implements IntGenerator{
    public int res = 0;
    @Override
    public int nextInt() {
        res++;
        return res - 1;
    }
}
