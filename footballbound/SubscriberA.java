package footballbound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SubscriberA implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        System.out.println("live result: " + e.getNewValue());
    }
    
}
