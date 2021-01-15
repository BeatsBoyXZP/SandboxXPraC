package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import java.util.Objects;

public class NamedPoint extends Point implements Resettable {
    private String name;

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    public String getName() {
        return name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        this.name = "Absent";
    }

    @Override
    public String toString() {
        if (Objects.equals(null, name)) return super.toString();
        return name + ": " + super.toString();
    }
}
