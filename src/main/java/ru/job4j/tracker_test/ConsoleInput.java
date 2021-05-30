package ru.job4j.tracker_test;


import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInput  {

    private Scanner scanner = new Scanner(System.in);

    public String askStr() {
        return scanner.nextLine();
    }

}
