package Commands;

import Devices.Light;

/**
 * Created by IlyaGutnikov on 04.09.2016.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand (Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.off();
    }
}
