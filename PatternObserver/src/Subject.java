
/**
 * Created by MartinSeptim on 14.07.2016.
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
