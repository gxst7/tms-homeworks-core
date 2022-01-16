package com.tms.lesson5;

public enum Position {
    DIRECTOR(2.0), WORKER(1.2);

    double wageRatio;

    Position(double wageRatio) {
        this.wageRatio = wageRatio;
    }

    public double getWageRatio() {
        return wageRatio;
    }
}
