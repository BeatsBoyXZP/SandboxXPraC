package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

public class Massif2_8 {
    public int[] massifNatural(int size) {
        int[] natural = new int[size];
        int nat = 1;
        for (int i = 0; i < size; i++) {
            if ((nat % 3) == 0) {
                nat++;
                natural[i] = nat;
            } else {
                natural[i] = nat;
            }
            nat++;
        }
        return natural;
    }

    public void print(int[] x) {
        for (int i = 0; i < 9; i++) {
            System.out.println(x[i]);
        }
    }

    public static void main(String[] args) {
        Massif2_8 massif2_8 = new Massif2_8();
        massif2_8.print(massif2_8.massifNatural(9));
    }
}
