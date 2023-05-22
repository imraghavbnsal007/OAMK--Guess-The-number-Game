/*POST mapping : localhost:8090/player?id=1&name=name - to create players 1
  POST mapping : localhost:8090/player?id=1&name=name - to create player 2
  GET Mapping: localhost:8090/player?id=1 - Player 1 information
  GET Mapping: localhost:8090/player?id=2 - Player 2 information
  POST mapping: localhost:8090/game - Creating the game and instruction
  PUT mapping: localhost:8090/game?id=1&move=5 - playing game turn by turn
  PUT mapping: localhost:8090/game?id=2&move=4 - player 2 playing his move
  (If there is a winner and want to check player information)
  GET mapping: localhost:8090/player?id=1 - Check the winner and overall information
  GET mapping: localhost:8090/game?id=1 - check the moves, Player plaeyed
  DELETE mapping: localhost:8090/player?id=1 - to delete any player
 */
package com.mygame;

import java.util.Random;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MygameController {
    Game g= new Game();
    @PostMapping("/player") 
    public String createplayer(@RequestParam Integer id, @RequestParam String name)
    {
        g.createPlayer(id,name);
        return "Player has been created";
        
    }

    @GetMapping("/player")
    public Player getPlayer(@RequestParam Integer id)
    {
        if (id == 1)
        {
            return g.getP1();
        }else {
            return g.getP2();
        }
    }

    @PostMapping("/game")
    public String createGame(){

        g.createGame();
        return "Guessing the Number game has been created. There are two players, who will guess the number one-by-one. First one to right number wins. At the end, You can see the results as well.";

    }

    @PutMapping("/game")
    public String makeamove(@RequestParam Integer id, @RequestParam Integer move){
        if (id ==1)
        {
            Player p1 = g.getPlayer();
            Integer movesnow = p1.getTotalMoves();
            Integer GamesPlayed = p1.getGamesPlayed();
            movesnow++;
            GamesPlayed++;
            p1.setTotalMoves(movesnow);
            p1.setGamesPlayed(GamesPlayed);
        }
        else if(id ==2){
            Player p2 = g.getPlayer2();
            Integer movesnow = p2.getTotalMoves();
            Integer GamesPlayed = p2.getGamesPlayed();
            movesnow++;
            GamesPlayed++;
            p2.setTotalMoves(movesnow);
            p2.setGamesPlayed(GamesPlayed);

        }
        return g.play(move);

    }
    @GetMapping("/game")
    public String totalMoves(@RequestParam Integer id)
    {
        if (id ==1)
        {
            Player p1 =g.getPlayer();
            Integer movesnow = p1.getTotalMoves();
            movesnow++;
            p1.setTotalMoves(movesnow);
            return "You used " + movesnow + " moves";
        }
        else if(id==2)
        {
            Player p2 =g.getPlayer2();
            Integer movesnow = p2.getTotalMoves();
            movesnow++;
            p2.setTotalMoves(movesnow);
            return "You used " + movesnow + " moves";
        }
        return "total moves";
    }
    @GetMapping("/gameWinner")
    public void winner(@RequestParam Integer number)
    {
        if(g.p1.equals(number))
        {
            return;

        }
        else if(g.p2.equals(number))
        {
            return;
        }

    }

    
    @DeleteMapping("/player")
    public String deletePlayer(@RequestParam Integer id)
    {
        if(id ==1)
        {
            Player p1 = g.getPlayer();
            p1 = null;
            return "Player 1 is Deleted!!!";
        }
        else if (id ==2)
        {
            Player p2 = g.getPlayer2();
            p2 = null;
            return "Player 2 Deleted!!!";
        }
        return "Both Player has been deleted from System";

    }




    
}
