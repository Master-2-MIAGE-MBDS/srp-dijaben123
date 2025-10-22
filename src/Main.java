public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(taskManager,"Tache 1", "Description de la tache 1");
        taskManager.addTask(taskManager,"Tache 2", "Description de la tache 2");
        taskManager.addTask(taskManager,"Tache 3", "Description de la tache 3");

        taskManager.markTaskAsComplete(1);

        taskManager.printCompletedTasks();
        taskManager.printPendingTasks();
    }
}
