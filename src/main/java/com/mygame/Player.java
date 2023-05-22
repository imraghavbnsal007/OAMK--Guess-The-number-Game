/*Atrributes and Methods written for player later used in game and Controller to get player Information */
package com.mygame;

public class Player {
    private String name;
    private Integer gamesPlayed=0;
    private Integer totalMoves=0;
    
    public Player(Integer gamesPlayed, Integer totalMoves) {
        this.gamesPlayed = gamesPlayed;
        this.totalMoves = totalMoves;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(){


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getTotalMoves() {
        return totalMoves;
    }

    public void setTotalMoves(Integer totalMoves) {
        this.totalMoves = totalMoves;
    }

}
