package ru.job4j.tracker_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StartUI {

    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput consoleInput;

//    public StartUI(Store store, ConsoleInput consoleInput) {
//        this.store = store;
//        this.consoleInput = consoleInput;
//    }

    public void add() {
        store.add(consoleInput.askStr());
    }




    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
