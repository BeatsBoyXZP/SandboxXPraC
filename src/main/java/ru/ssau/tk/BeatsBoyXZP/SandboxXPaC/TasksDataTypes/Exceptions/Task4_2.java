package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Exceptions;

public class Task4_2 {
    public static String[] nthSymbols(String[] str, int n) {
        String[] newStr = new String[str.length];

        for (String s : str) {
            if (n > s.length()) {
                throw new StringIndexOutOfBoundsException();
            }
        }

        for (String s : str) {
            if (s == null) {
                throw new NullPointerException();
            }
        }

        for (int i = 0; i < str.length; i++) {
            newStr[i] = str[i].substring(n, n + 1);
        }

        return newStr;
    }
}
