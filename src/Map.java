import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Map extends JPanel{

    static int length = 20;
    static int width = 20;
    static int [][]table = new int[20][20];

    Timer timer;

    Map(){
        /*1-alive, 0-dead*/
        for(int i = 0; i < 20; ++i){
            for(int j = 0; j < 20; ++j){
                    table[i][j] = ((int)(10 * Math.random())) % 2;
            }
        }
        this.startAnimation();
    }
    
   
    //用于测试
    Map(int n){
    	for(int i = 0; i < 20; ++i)
    		for(int j = 0; j < 20; ++j) {
    			if(i >= 8 && i <= 11 && j >= 8 && j <= 11)
    				table[i][j] = 1;
    			else
    				table[i][j] = 0;
    		}
    	table[8][11] = 0;
    	table[10][12] = 1;
    	table[11][7] = 1;
    	table[11][13] = 1;
    	table[12][9] = 1;
    	table[12][11] = 1;
    	table[12][12] = 1;
    	
    	//this.startAnimation();
    } 
 
    
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int row = 0; row < width; ++row)
            for(int col = 0; col < length; ++col){
                if(table[row][col] == 1)
                    g.fillRect(col * width, row * length, width, length);
                else
                    g.drawRect(col * width, row * length, width, length);
            }
    }
    void startAnimation(){
        new Clock(this).start();
    }
}
