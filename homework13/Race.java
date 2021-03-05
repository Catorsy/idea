package com.company.homework.homework13;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private ArrayList<Stage> stages;
    private boolean haveWinner;

    public boolean isHaveWinner() {
        return haveWinner;
    }

    public void setHaveWinner(boolean haveWinner) {
        this.haveWinner = haveWinner;
    }

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}
