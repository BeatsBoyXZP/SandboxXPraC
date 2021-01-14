package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import java.util.StringJoiner;

public class Massif2_31{
    private double[][] array;
    private int n;
    private int m;

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public Massif2_31(int n, int m) {
        this.m = m;
        this.n = n;
        array = new double[n][m];
    }

    public double getAt(int n, int m) {
        return array[n][m];
    }

    public void setAt(int n, int m, double number) {
        array[n][m] = number;
    }

    @Override
    public String toString() {
        StringJoiner columnMatrix = new StringJoiner(";\n");
        StringJoiner lineMatrix = new StringJoiner(",");
        for (double[] lineArray : array) {
            for (double element : lineArray) {
                lineMatrix.add(element + "");
            }
            columnMatrix.add(lineMatrix.toString());
            lineMatrix = new StringJoiner(",");
        }
        return columnMatrix.toString() + ";";
    }
}
