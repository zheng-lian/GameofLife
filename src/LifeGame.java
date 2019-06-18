import javax.swing.JFrame;

public class LifeGame extends JFrame{
    LifeGame(){
        this.setSize(400, 425);
        this.setTitle("Life Game");
        //测试
        //this.add(new Map(1));
        this.add(new Map());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public static void main(String[] args){
        LifeGame lg = new LifeGame();
        lg.setVisible(true);
    }
}