package ru.job4j.tracker_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.tracker_test");
        context.refresh();

        Store store = context.getBean(Store.class);
        store.add("Petr Arsentev");
        Store another = context.getBean(Store.class);
        another.add("another");
        another.getAll().forEach(System.out::println);

        StartUI ui = context.getBean(StartUI.class);
        ui.add();
//        ui.add();
//        ui.print();
        StartUI uiAnother = context.getBean(StartUI.class);
        uiAnother.print();
    }
}
