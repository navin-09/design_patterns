package Creational_Design_Patterns.Single_Ton_Design_pattern;

public class ClientMultiThread {
    public static void main(String[] args) {
        Runnable task = () -> {
            DatabaseConnection conn = DatabaseConnection.getInstance();
            System.out.println(Thread.currentThread().getName()
                + " -> instance hash: " + System.identityHashCode(conn));
        };
        
        // Run multiple threads
        for (int i = 0; i < 5; i++) {
            new Thread(task, "Thread-" + i).start();
        }
    }
}
