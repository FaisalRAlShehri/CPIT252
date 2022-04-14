package edu.kau.fcit.cpit252.subjects;
 
import edu.kau.fcit.cpit252.observers.Observer;
import java.util.ArrayList;
import java.util.List;

 
public class MessageSubject implements Subject {
     
     private List<Observer> obsevers = new ArrayList<>();


    @Override
    public void subscribe(Observer observer) {
        obsevers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        obsevers.remove(observer);
    }

    @Override
    public void notifyUpdate(String message) {
        for(Observer o : obsevers) {
            o.update(message);
        }
    }
}
