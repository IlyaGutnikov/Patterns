/**
 * Created by IlyaGutnikov on 11.09.2016.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter (Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gouble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
