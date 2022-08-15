import java.util.Scanner;
class Tommy{
    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
}

public class OOPS {
    public static void main(String[] args) {
       Tommy tm = new Tommy();
       tm.hit();
       tm.fire();
       tm.run();
    }
}
