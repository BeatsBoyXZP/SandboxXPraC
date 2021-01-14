package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Thirdquestions;

public class Task3_1 {
    public void StringCharOut(String string){
        for(int i=0;i<string.length();i++){
            System.out.println(string.charAt(i));
        }
    }

    public static void main(String[] args) {
        Task3_1 string=new Task3_1();
        string.StringCharOut("Hello Zangoose");
    }
}
