package org.example.tictac;

public class Player {
    private Symbol symbol = Symbol.NONE;
    private String name = "";

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public Symbol getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }
}
