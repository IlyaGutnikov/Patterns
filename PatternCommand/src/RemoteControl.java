import Commands.Command;
import Commands.NoCommand;

/**
 * Created by IlyaGutnikov on 04.09.2016.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {

        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i< 7; i++) {
            offCommands[i] = noCommand;
            onCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand (int slot, Command onCommand, Command offCommand) {

        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPuched() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----Remote Control-----\n");

        for (int i = 0; i < onCommands.length; i++) {

            stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }

}
