package Creational_Design_Patterns.Single_Ton_Design_pattern;


/**
 * Thread-safe Singleton example using Double-Checked Locking.
 * 
 * ✅ Ensures only one instance is created, even when accessed by multiple threads.
 * ✅ Uses 'volatile' to prevent instruction reordering.
 * ✅ Demonstrated with a multi-thread test that prints instance identity (proof).
 */
public class DatabaseConnection {
    // Step 1: Declare a private static volatile instance
    // 'volatile' ensures all threads see the latest initialized value
    private static volatile DatabaseConnection instance;

    // Step 2: Private constructor to prevent external instantiation
    private DatabaseConnection() {
        System.out.println("✅ Constructor called: DatabaseConnection created!");
    }

     /**
     * Step 3: Public accessor method to get the single instance.
     * Uses "Double-Checked Locking" for thread-safe lazy initialization.
     *
     * - First 'if' avoids synchronization for already-created instance (fast).
     * - Second 'if' (inside synchronized) ensures only one thread can create it.
     */
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    // Example method to simulate usage
    public void query(String sql) {
        System.out.println("Executing SQL: " + sql);
    }
}
