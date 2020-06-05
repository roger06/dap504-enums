package com.dap504;

public enum ShotType {

    BACKHAND("played across the body"), FOREHAND("played straight"), SERVE("starts each game. ball must bounce on server's side first"),
    VOLLEY("played before ball bounces"), MISS("a fould"), SMASH("impossible to return");

    private String desc;

    ShotType(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc ;
    }
}
