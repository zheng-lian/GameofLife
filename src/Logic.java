import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logic extends JFrame{
    static int [][]table = new int[20][20];

    static int getNeighbor(Map map, int row, int col) {
        int result = 0;

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r < 0 || r >= 20 || c < 0|| c >= 20) {
                    continue;
                }
                if (map.table[r][c] == 1) {
                    result++;
                }
            }
        }
        if (map.table[row][col] == 1) {
            result--;
        }

        return result;
    }

    static int[][] changeStatus(Map map){
        for(int i = 0; i < Map.width; i++){
            for(int j = 0; j < Map.length; j++){
            	
            	int num=Logic.getNeighbor(map,i,j);
            	
                if(num == 3){
                    table[i][j] = 1;
                }
                else if(num == 2){
                    table[i][j] = map.table[i][j];
                }
                else{
                    table[i][j] = 0;
                }

            }
        }
        return table;
    }

}