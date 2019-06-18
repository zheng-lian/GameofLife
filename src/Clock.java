public class Clock extends Thread{
    Map map;

    public Clock(Map map){
        this.map = map;
    }
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                map.table = Logic.changeStatus(map);
                map.repaint();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}