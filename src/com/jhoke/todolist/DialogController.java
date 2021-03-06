package com.jhoke.todolist;

import com.jhoke.todolist.DataModel.ToDoData;
import com.jhoke.todolist.DataModel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadLinePicker;

    public ToDoItem processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadLineValue = deadLinePicker.getValue();

        ToDoItem newItem = new ToDoItem(shortDescription,details,deadLineValue);
        ToDoData.getInstance().addToDoItem(newItem);
        return newItem;
    }

}
