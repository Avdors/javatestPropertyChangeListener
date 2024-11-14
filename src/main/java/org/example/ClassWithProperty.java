package org.example;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClassWithProperty {
    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    private boolean isRecordComplete = false;
    private boolean isTetxtDone = false;


    public ClassWithProperty() {
    }


    public boolean isRecordComplete() {
        return isRecordComplete;
    }

    public void setRecordComplete(boolean isRecordComplete) {
        this.isRecordComplete = isRecordComplete;
        changes.firePropertyChange("isRecordComplete", !isRecordComplete, isRecordComplete);
    }

    public void setTextDone(boolean isTextDone) {
        this.isTetxtDone = isTextDone;
        changes.firePropertyChange("isTextDone", !isTextDone, isTextDone);
    }

    public boolean isTextDone() {
        return isTetxtDone;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
    }
}
