package com.bitsnake.memento_pattern;

/*
The 'Originator' class
WikiPedia notes( for your reference):
Make an object (originator) itself responsible for:
1.Saving its internal state to a(memento) object and
2.Restoring to a previous state from a(memento) object.
3.Only the originator that created a memento is allowed to
access it .
*/
public class Originator {

    private int stateId;

    public Originator() {
        this.stateId = 0;
        System.out.println("Originator is created with state id:" + stateId);
    }

    public Originator(int stateId) {
        this.stateId = stateId;
    }

    public int getStateId() {
        return stateId;
    }
    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    // Save its internal state to a (memento) object
    public Memento saveMemento(int stateId) {
        System.out.println(" Saving originator's current id");
        return new Memento(stateId);
    }

    public void revertMemento(Memento previousMemento) {
        System.out.println(" Restoring to state id..." + previousMemento.getStateId());
        this.stateId = previousMemento.getStateId();
        System.out.println(" Current state id of originator : "+ stateId);
    }

}
