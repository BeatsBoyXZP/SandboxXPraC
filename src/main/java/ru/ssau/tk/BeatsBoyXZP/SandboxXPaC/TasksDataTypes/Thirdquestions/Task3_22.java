package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

public class Task3_22 {
    static String getStringOfNumber(int number) {
        StringBuilder strOfNumber = new StringBuilder();
        for (int i = 0; i < number; i++) {
            strOfNumber.append(i);
        }
        return strOfNumber.toString();
    }
}
