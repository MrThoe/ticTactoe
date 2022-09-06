import java.util.Scanner;


public class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Board b = new Board();
        int row;
        int col;
        char p = 'O';
        boolean gameExit = false;
        
        
        
        /* One player Version -- RANDOM NPC */
        
        // while(!gameExit){
        //     if(p == 'X'){
        //         System.out.println("It is player "+p+"'s turn!");
        //         b.show();
        //         System.out.print("Enter a valid row: ");
        //         row = sc.nextInt();
        //         System.out.print("Enter a valid column: ");
        //         col = sc.nextInt();
        //     } else {
        //       row = (int)Math.floor(Math.random()*(3)); 
        //       col = (int)Math.floor(Math.random()*(3)); 
        //     }
        //     if(b.isValid(row, col)){
        //         b.placePlayer(p, row, col);
        //         gameExit = b.checkWin(p);
        //         if(p == 'X'){
        //             p = 'O';
        //         } else {
        //             p = 'X';
        //         }
        //     } else {
        //         if(p == 'X'){
        //             System.out.println("==========================");
        //             System.out.println("!!! Invalid row or column !!!");
        //             System.out.println("==========================");
        //         }
        //     }
        // } 
        // b.show();
        // if(p == 'X'){
        //     p = 'O';
        // } else {
        //     p = 'X';
        // }
        // System.out.println("Player "+p+ " wins!");
        
        
        /* Two player version */
        
        // System.out.println("It is player X's turn!");
        // while(!gameExit){
        //     b.show();
        //     System.out.print("Enter a valid row: ");
        //     row = sc.nextInt();
        //     System.out.print("Enter a valid column: ");
        //     col = sc.nextInt();
        //     if(b.isValid(row, col)){
        //         System.out.println("==========================");
        //         System.out.println("It is player "+p+"'s turn!");
        //         if(p == 'X'){
        //             p = 'O';
        //         } else {
        //             p = 'X';
        //         }
        //         b.placePlayer(p, row, col);
    
        //     } else {
        //         System.out.println("==========================");
        //         System.out.println("!!! Invalid row or column !!!");
        //         System.out.println("==========================");
        //     }
        //     gameExit = b.checkWin(p);
        // } 
        // b.show();
        // System.out.println("Player "+p+ " wins!");
    }
    
}
