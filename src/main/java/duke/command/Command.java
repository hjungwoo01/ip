/*
 * Command.java
 * This class is the base class for all command-related classes in the Duke application.
 * It defines the common interface and properties that all command classes must have.
 */

package duke.command;

import java.io.IOException;

import duke.DukeException;
import duke.Ui;
import duke.task.Storage;
import duke.task.TaskList;

public abstract class Command {
    /**
     * Executes the specific command and returns a response message as a String.
     * This method must be implemented by all subclasses to define the behavior of the command.
     *
     * @param tasks   The TaskList containing the list of tasks to be manipulated or queried.
     * @param ui      The Ui object for interacting with the user interface.
     * @param storage The Storage object for reading from or writing to the storage file.
     * @return A String representing the outcome of the command execution.
     * @throws DukeException If an application-specific error occurs during command execution.
     * @throws IOException   If an I/O error occurs while accessing the storage file.
     */
    public abstract String execute(TaskList tasks, Ui ui, Storage storage) throws DukeException, IOException;

    /**
     * Determines whether this command is an "exit" command that should signal the application to terminate.
     *
     * @return True if this command is an exit command; false otherwise.
     */
    public abstract boolean isExit();
}
