package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ClassListen {
    private static ClassWithProperty test;
    private ClassChenge classChenge;
    public ClassListen() {
        test = new ClassWithProperty();
        test.addPropertyChangeListener(listen());
        classChenge = new ClassChenge(test);
    }

    private static PropertyChangeListener listen() {
        return new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property changed: " + evt.getPropertyName() + " -> " + evt.getNewValue());
            }
        };
    }

    public void ChengStatus(){
        classChenge.ChengStatus();
    }

    public void ChengStatusFalse(){
        classChenge.ChengStatusFalse();
    }
}
