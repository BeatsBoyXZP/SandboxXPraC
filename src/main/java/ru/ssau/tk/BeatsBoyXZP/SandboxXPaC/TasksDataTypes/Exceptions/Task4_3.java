package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

public class Task4_3 {
    public static char getCharFromString(String[] arrayStr, int n, int m) {
        if (n > arrayStr.length) {
            throw new StringIndexOutOfBoundsException();
        }

        if (m > arrayStr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return arrayStr[n].charAt(m);
    }
}
