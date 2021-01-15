package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

public class Task4_4 {
    public static int getTask4_4(String str1, String str2) {
        if (Integer.parseInt(str2) == 0) {
            throw new ArithmeticException();
        }

        if (!Character.isDigit(str1.charAt(0)) || !Character.isDigit(str2.charAt(0))) {
            throw new NumberFormatException();
        }

        return Integer.parseInt(str1) / Integer.parseInt(str2);
    }
}
