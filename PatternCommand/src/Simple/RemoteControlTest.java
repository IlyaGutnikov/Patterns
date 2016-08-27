package Simple;

import Commands.LightOnCommand;
import Devices.Light;
import Simple.SimpleRemoteControl;

/**
 * Created by IlyaGutnikov on 27.08.2016.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}
