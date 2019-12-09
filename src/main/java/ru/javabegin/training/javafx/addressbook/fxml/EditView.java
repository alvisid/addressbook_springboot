package ru.javabegin.training.javafx.addressbook.fxml;

import org.springframework.stereotype.Component;
import ru.javabegin.training.javafx.fxml.SpringFxmlView ;

@Component
public class EditView extends SpringFxmlView {

    private static final String FXML_EDIT = "ru/javabegin/trainig/javafx/fxml/edit.fxml";

    public EditView() {
        super (MainView.class.getClassLoader().getResource(FXML_EDIT));
    }
}
