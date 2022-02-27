public class T46InnerClass {
    public static void main(String[] args) {
        Robot r1 = new Robot(1);
        r1.start();
        Robot.worker rw = new Robot.worker();
    }
    
}

class Robot{
    private int id;
    public Robot(int i){
        id = i;
    }
    
    void start(){
        worker w = new worker();
        w.work();
    }
    
    static class worker{
        
        void work(){
            System.out.println("Working...");
            collect c = new collect();
            c.collectEggs();
        }
        
        class collect{
            void collectEggs(){
                System.out.println("Collecting eggs...");
            }
        }
    }
    
    class military{
        void train(){
            System.out.println("Training...");
        }
        void fight(){
            System.out.println("Fighting...");
        }
    }
}