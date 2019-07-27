package com.company;

public class Cars {
    private Helm helm;
    private Wheel wheel ;
    private String carNames;

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getCarNames() {
        return carNames;
    }

    public void setCarNames(String carNames) {
        this.carNames = carNames;
    }

    public Cars(Helm helm, Wheel wheel, String carNames) {
        this.helm = helm;
        this.wheel = wheel;
        this.carNames = carNames;


    }
}
