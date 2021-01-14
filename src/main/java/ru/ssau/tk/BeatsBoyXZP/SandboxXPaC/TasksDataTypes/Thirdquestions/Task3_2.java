package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

public class Task3_2 {
    public void getStr(String str){
        byte[] bytes = str.getBytes();
        for (byte byt:bytes) {
            System.out.println(byt);
        }
    }
}