import static java.lang.Thread.*;

/**
 * Демонстрація пріоритетів. Створити 2 класи PriorityRunner та PriorityThread.
 * Запустити 3 потоки із пріоритетами (min, max, norm).
 * За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.
 */

public class Main {
    public static void main(String[] args) {
        PriorityRunner task1 = new PriorityRunner();
        PriorityRunner task2 = new PriorityRunner();
        PriorityRunner task3 = new PriorityRunner();
        PriorityThread pt1 = new PriorityThread(task1);
        pt1.setPriority(MIN_PRIORITY);
        pt1.setName("Thread-min-priority");
        PriorityThread pt2 = new PriorityThread(task2);
        pt2.setPriority(NORM_PRIORITY);
        pt2.setName("Thread-norm-priority");
        PriorityThread pt3 = new PriorityThread(task3);
        pt3.setPriority(MAX_PRIORITY);
        pt3.setName("Thread-max-priority");
        pt1.start();
        pt2.start();
        pt3.start();

    }
}
