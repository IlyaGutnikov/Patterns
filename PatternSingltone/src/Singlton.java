/**
 * Created by IlyaGutnikov on 25.08.2016.
 */
public class Singlton {

    private static Singlton unique;

    private Singlton() {}

    public static synchronized Singlton getInstance() {

        if (unique == null) {
            unique = new Singlton();
            System.out.println("Create new Singlton");
        } else {

            System.out.println("Singlton already created");
        }

        return unique;
    }

}
