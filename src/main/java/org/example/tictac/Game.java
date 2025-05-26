package org.example.tictac;
import java.util.Scanner;
public class Game {

    Grid grid = new Grid();
    Scanner scanner = new Scanner(System.in);
    public Player start(){
        Player player1 = getPlayer();
        Player player2 = getPlayer();

        Player curPlayer = player1;
        //if player wins exit
        //grid fills, exit -> valid moves = grid.size
        while (!grid.isGridFull()){
            System.out.println("Enter row and col");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(grid.setCell(row, col, curPlayer.getSymbol())){
                return curPlayer;
            }
            curPlayer = curPlayer == player1 ? player2 : player1;
        }
        return new Player("No Player");
    }


    private Player getPlayer(){
        Player player = new Player();
        System.out.println("Enter Player name");
        player.setName(scanner.nextLine());
        System.out.println("Enter Player symbol");
        String symbolString = scanner.nextLine();
        Symbol symbol = Symbol.valueOf(symbolString);
        player.setSymbol(symbol);
        return player;
    }
}
