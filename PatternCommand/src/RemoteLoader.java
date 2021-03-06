import Commands.Command;
import Commands.LightOffCommand;
import Commands.LightOnCommand;
import Commands.MacroCommand;
import Devices.Light;

/**
 * Created by IlyaGutnikov on 04.09.2016.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        //создали устройства
        Light livingRoomLight = new Light("LivingRoom");
        Light bedRoomLight = new Light("BedRoom");
        Light wcRoomLight = new Light("WC");
        Light kitchenRoomLight = new Light("KitchenRoom");

        //создали вкл\выкл
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand bedRoomLightOnCommand = new LightOnCommand(bedRoomLight);
        LightOffCommand bedRoomLightOffCommand = new LightOffCommand(bedRoomLight);

        LightOnCommand wcRoomLightOnCommand = new LightOnCommand(wcRoomLight);
        LightOffCommand wcRoomLightOffCommand = new LightOffCommand(wcRoomLight);

        LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenRoomLightOffCommand = new LightOffCommand(kitchenRoomLight);

        //макрокоманда
        Command[] allLightsOn = { livingRoomLightOnCommand, bedRoomLightOnCommand, wcRoomLightOnCommand, kitchenRoomLightOnCommand};
        Command[] allLightsOff = { livingRoomLightOffCommand, bedRoomLightOffCommand, wcRoomLightOffCommand, kitchenRoomLightOffCommand};

        MacroCommand lightOnMacro =  new MacroCommand(allLightsOn);
        MacroCommand lightOffMacro = new MacroCommand(allLightsOff);

        //записали ячейки
        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, bedRoomLightOnCommand, bedRoomLightOffCommand);
        remoteControl.setCommand(2, wcRoomLightOnCommand, wcRoomLightOffCommand);
        remoteControl.setCommand(3, kitchenRoomLightOnCommand, kitchenRoomLightOffCommand);
        remoteControl.setCommand(4, lightOnMacro, lightOffMacro);

        System.out.print(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPuched();

        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPuched();

    }
}
