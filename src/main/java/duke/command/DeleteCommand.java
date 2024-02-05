/*
 * DeleteCommand.java
 * This class represents a command to delete a task from the Duke application.
 * It allows the user to remove a task by specifying its index in the task list.
 */

package duke.command;

import java.io.IOException;

import duke.DukeException;
import duke.Ui;
import duke.task.Storage;
import duke.task.Task;
import duke.task.TaskList;


public class DeleteCommand extends Command {
    private final String fullCommand;

    public DeleteCommand(String fullCommand) {
        this.fullCommand = fullCommand;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException, IOException {
        try {
            int index = Integer.parseInt(fullCommand.substring(7).trim()) - 1;
            if (index < 0 || index >= tasks.size()) {
                throw new DukeException("Task number " + (index + 1) + " does not exist.");
            }
            Task removedTask = tasks.removeTask(index);
            ui.showDeletedMessage(tasks, removedTask);
        } catch (NumberFormatException e) {
            throw new DukeException("Please enter a valid task number to delete.");
        }
        storage.saveTasks(tasks);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
