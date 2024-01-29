/*
 * ExitCommand.java
 * This class represents a command to exit the Duke application.
 * It allows the user to terminate the application gracefully.
 */

package duke.command;

import duke.task.Storage;
import duke.task.TaskList;
import duke.Ui;

public class ExitCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showGoodbyeMessage();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
