package ru.job4j.tracker_test;


public class StartUI {

    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add() {
        store.add(consoleInput.askStr());
    }




    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
