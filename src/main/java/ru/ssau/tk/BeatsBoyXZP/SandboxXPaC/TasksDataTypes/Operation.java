package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        apply(number);
        apply(number);
        apply(number);
        return number;
    }

}
