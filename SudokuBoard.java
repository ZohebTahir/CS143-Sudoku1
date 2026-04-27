import java.util.*;
import java.util.Scanner; 
import java.io.*;

public class SudokuBoard {
   private String[][] board;
   
   public SudokuBoard(String fileName) throws FileNotFoundException {
   
      board = new String[9][9];
      Scanner file = new Scanner(new File(fileName));
         
      for(int r = 0; r < 9; r++) {
         String rowData = file.next();
         
         for(int c = 0; c < 9; c++) {
            String val = rowData.substring(c, c + 1);
            board[r][c] = val;
         }
      }
   }
  
   public String toString() {
      String boardPrint = "";
      
      for(int r = 0; r < board.length; r++) {
         for(int c = 0; c < board[r].length; c++) {
            boardPrint += board[r][c]; 
         }
         boardPrint += "\n"; 
      }
            
      return boardPrint; 
   }
}
