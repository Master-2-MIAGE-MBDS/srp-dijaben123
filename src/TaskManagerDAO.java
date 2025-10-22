public class TaskManagerDAO {
    // Ajouter une nouvelle tâche
    public void addTask(taskManager TaskManager,String title, String description) {
        tasks.add(new Task(title, description));
    }

    // Marquer une tâche comme terminée
    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }
}
