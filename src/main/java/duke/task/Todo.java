/*
 * Todo.java
 * This class represents a todo task in the Duke application.
 * It extends the Task class and does not have specific date and time.
 */

package duke.task;

public class Todo extends Task {
    /**
     * Creates a new Todo task with the specified description.
     *
     * @param description The description of the todo task.
     */
    public Todo(String description) {
        super(description);
    }

    /**
     * Returns a string representation of the Todo task, including its type.
     *
     * @return The formatted string representation of the Todo task.
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
