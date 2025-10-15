
package Creational_Design_Patterns.Single_Ton_Design_pattern;

public  class Client {

    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // Both references should point to the same instance
        System.out.println("Connection 1 hash: " + System.identityHashCode(connection1));
        System.out.println("Connection 2 hash: " + System.identityHashCode(connection2));

        // Example usage
        connection1.query("SELECT * FROM users");
    }

    
}