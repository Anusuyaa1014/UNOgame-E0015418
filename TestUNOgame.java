/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNOgame;

/**
 *
 * @author Win10
 */
public class TestUNOgame {
    public static void main (String args[]) {
            
        Player a=new Player("001","Hansith");Player b=new Player("002","Raj");Player c=new Player("003","Aruna");
        Player d=new Player("004","John");Player e=new Player("005","Sri");
        game game=new game("UNOGAME-001");
        game.CreateNewGame();//create a new deck
        game.addplayer(a);game.addplayer(b);game.addplayer(c);//add players
        game.addplayer(d);game.addplayer(e);
        game.StartGame();//discard a card and send start cards for players
        game.showGameInformation();
        }
}
