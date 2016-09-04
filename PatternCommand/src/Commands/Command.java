package Commands;

/**
 * Created by IlyaGutnikov on 27.08.2016.
 */
public interface Command {

    public void execute();

    public void undo();
}
