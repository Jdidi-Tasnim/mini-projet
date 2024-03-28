import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            TaskManager taskManager = (TaskManager) registry.lookup("TaskManager");

            // Use taskManager methods here
            // Example: taskManager.addTask("Complete Project");
        } catch (Exception e) {
            System.err.println("RMI Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
