package Devices;

/**
 * Created by IlyaGutnikov on 27.08.2016.
 */
public class Light {

    private String name = "";

    public Light() {

    }

    public Light(String name) {

        this.name = name;
    }

    public void on() {

        System.out.println(name + " Light turns on");
    };

    public void off() {

        System.out.println(name + " Light turns off");
    };
}
