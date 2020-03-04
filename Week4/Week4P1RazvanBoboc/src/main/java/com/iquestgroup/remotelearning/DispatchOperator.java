package com.iquestgroup.remotelearning;

import com.iquestgroup.remotelearning.interfaces.Dispatcher;
import com.iquestgroup.remotelearning.interfaces.Human;

import java.util.List;

public class DispatchOperator implements Human, Dispatcher {

    private String name;
    private List<TaxiDriver> drivers;

    public DispatchOperator(String name, List<TaxiDriver> drivers) {
        this.name = name;
        this.drivers = drivers;
    }

    public void eat() {
        System.out.println("Operator " + name + " eats");
    }

    public void sleep() {
        System.out.println("Operator " + name + " sleeps");
    }

    private TaxiDriver getBestAvailableTaxi(String location) {
        return drivers.get(0);
    }

    public void dispatch(String location) {
        getBestAvailableTaxi(location).goToAddress(location);
    }
}
