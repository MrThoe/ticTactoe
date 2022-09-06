public class Board {
    
    char[][] b = new char[3][3];
    boolean isActive;
    
    public Board(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                b[i][j] = '-';
            }
        }
        isActive = true;
    }
    
    public void show(){
        System.out.println("\t0\t1\t2");
        for(int i = 0; i < 3; i++){
            System.out.print(i);
            for(int j = 0; j < 3; j++){
                System.out.print("\t" + b[i][j]);
            }
            System.out.println();
        } 
        System.out.println("==========================");
    }
    
    public boolean isValid(int row, int col){
        if(row > 2 || row < 0 || col > 2 || col < 0){
            return false;
        }
        if(b[row][col] != '-'){
            return false;
        }
        return true;
    }
    
    public void placePlayer(char player, int row, int col){
        b[row][col] = player;
    }
    
    public boolean checkWin(char player){
        if(winRow(player) || winCol(player) || winDiag(player)){
            return true;
        }
        return false;
    }
    
    public boolean winRow(char player){
        for(int i = 0; i < 3; i++){
            if(b[i][0]==b[i][1] && b[i][1]==b[i][2] && b[i][1]==player){
                return true;
            }
        }
        return false;
    }
    
    public boolean winCol(char player){
        for(int i = 0; i < 3; i++){
            if(b[0][i]==b[1][i] && b[1][i]==b[2][i] && b[1][i]==player){
                return true;
            }
        }
        return false;        
    }
    
    public boolean winDiag(char player){
        if(b[1][1] != player){
            return false;
        }
        if(b[0][0]==player && b[2][2]==player){
            return true;
        }
        if(b[2][0]==player && b[0][2]==player){
            return true;
        }
        return false;
    }
}
