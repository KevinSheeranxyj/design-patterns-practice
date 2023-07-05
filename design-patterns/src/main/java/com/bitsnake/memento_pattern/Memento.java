package com.bitsnake.memento_pattern;

public class Memento {
    private int stateId;

    public Memento(int stateId) {
            this.stateId = stateId;
    }

    public int getStateId() {
        return stateId;
    }


}
