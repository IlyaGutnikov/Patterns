package Commands;

import Devices.Light;

/**
 * Created by IlyaGutnikov on 27.08.2016.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand (Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.on();
    }
}
