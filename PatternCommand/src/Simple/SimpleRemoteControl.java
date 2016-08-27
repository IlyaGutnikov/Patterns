package Simple;

import Commands.Command;

/**
 * Created by IlyaGutnikov on 27.08.2016.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {

        slot.execute();
    }

}
