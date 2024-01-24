package com.epam.design.patterns.behavioural.observer;

public interface Activity {
    void subscribe(Observer observer);
    void UnSubscribe(Observer observer);
    void notifySubscribers(String message);
}
