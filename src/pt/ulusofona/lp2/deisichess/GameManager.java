package pt.ulusofona.lp2.deisichess;
import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GameManager {
    int jogada = 0;
    Tabuleiro tabuleiro = new Tabuleiro();

    public GameManager() {}

   public boolean loadGame(File file){

    return true;

    }
   public int getBoardSize(){
        return 0;
    }
   public boolean move (int x0, int y0, int x1, int y1){
        return true;
    }

  public   String[] getSquareInfo( int x, int y){
        return null;
    }

  public   String[] getPieceInfo(int ID){
        return null;
    }

  public   String getPiecesInfoAsString(int ID){
        return "";
    }

   public int getCurrentTeamID(){

       if (Objects.equals(jogada, 0)) {
           return 0;
       } else if (Objects.equals(jogada, 1)) {
          return 1;
       }
       return -1;
    }

  public   boolean gameOver(){
return true;
  }
  public   ArrayList<String> getGameResults(){
      ArrayList<String> results = new ArrayList<>();



      return results;
    }

   public JPanel getAuthorsPanel(){
        return null;
    }

}