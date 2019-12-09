package ru.javabegin.training.javafx.addressbook.fxml;

import ru.javabegin.training.javafx.fxml.SpringFxmlView ;


public class MainView  extends SpringFxmlView {

    private static final String FXML_MAIN = "ru/javabegin/training/javafx/fxml/main.fxml";

    public MainView() {
        super(MainView.class.getClassLoader().getResource(FXML_MAIN));
    }
}
