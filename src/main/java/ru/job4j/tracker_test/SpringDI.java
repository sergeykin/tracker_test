package ru.job4j.tracker_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.tracker_test");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add();
        ui.add();
        ui.print();
    }
}
