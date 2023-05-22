/*This is Guessing the number game, It can be played with two Players on server and user can get player information as well and game information as well 
Author: Raghav bansal
Code Editor used: virtual Studio Code
*/

package com.mygame;

import java.util.Random;

public class Game {

        Integer move;
        Integer number = 1;

        public int getMove() {
                return move;
        }

        public void setMove(int move) {
                this.move = move;
        }

        public int getNumber() {
                return number;
        }

        public void setNumber(int number) {
                this.number = number;
        }

        Player p1 = null;
        Player p2 = null;

        public Player getP2() {
                return p2;
        }

        public void setP2(Player p2) {
                this.p2 = p2;
        }

        public Player getP1() {
                return p1;
        }

        public void setP1(Player p1) {
                this.p1 = p1;
        }

        public Player getPlayer() {
                return p1;

        }

        public Player getPlayer2() {
                return p2;
        }

        public Game() {

        }

        public String createPlayer(Integer id, String name) {
                if (id == 1) {
                        p1 = new Player(name);

                } else if (id == 2) {
                        p2 = new Player(name);
                }
                return "Player created";
        }

        public void createGame() {
                this.number = 1 + (int) (10 * Math.random());

        }
        

        public String play(Integer move) {

                // If the number is guessed
                if (this.number == move) {
                        return "Congratulation!! You got the right number, and You won!!!";
                } else if (this.number > move) {
                        return "The number is larger than " + move;
                } else if (this.number < move) {
                        return "The number is smaller than " + move;
                }
                return "Game Finished";
        }


}
