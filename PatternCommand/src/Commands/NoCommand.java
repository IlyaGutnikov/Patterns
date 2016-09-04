package Commands;

/**
 * Created by IlyaGutnikov on 04.09.2016.
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No command");
    }
}
