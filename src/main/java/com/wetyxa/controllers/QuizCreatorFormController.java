/*
package com.wetyxa.controllers;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import com.wetyxa.Main;
import com.wetyxa.model.*;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class QuizCreatorFormController {

    @FXML
    private AnchorPane paneCreatorQuestion;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private HBox paneQuestion;

    @FXML
    private TextArea questionText;

    @FXML
    private ChoiceBox<String> listKurs;

    @FXML
    private Button butAddNewKurs;

    @FXML
    private Button butAddKursToList;

    @FXML
    private TextField textFieldKurs;

    @FXML
    private ChoiceBox<String> listSubjects;

    @FXML
    private Button butAddNewSubject;

    @FXML
    private Button butAddSubjectToList;

    @FXML
    private TextField textFieldSubject;

    @FXML
    private ChoiceBox<String> listThemes;

    @FXML
    private Button butAddNewTheme;

    @FXML
    private Button butAddThemeToList;

    @FXML
    private TextField textFieldTheme;

    @FXML
    private Button saveQuestionButton;

    @FXML
    private Button deleteQuestionButton;

    @FXML
    private Button addNewQuestionButton;

    @FXML
    private AnchorPane quetionAnchor;


    @FXML
    private TabPane tabPane;



    private ToggleGroup radioAnswersGroup;
    private ToggleGroup buttonQuestionGroup;


    //method var
    private boolean butKurs = true;
    private boolean butSubject = true;
    private boolean butTheme = true;

    @FXML
    void initialize() {


*/
/*
        addNewQuestionButton.setOnAction(event -> {
            paneQuestion.getChildren().add(getNewButtonQuiz(paneQuestion.getChildren().size()));
        });
*//*

        AllTests allTests = Main.testAlldata();
        for (Kurs kurs : allTests.getKursList()){
            listKurs.getItems().add(String.valueOf(kurs.getNumberKurs()));
        }



        listKurs.setOnAction(event ->{
            String selectedItem = listKurs.getSelectionModel().getSelectedItem();
            for (Kurs kurs : allTests.getKursList()){
                if(String.valueOf(kurs.getNumberKurs()).equals(selectedItem)){
                    listSubjects.setDisable(false);
                    butAddNewSubject.setDisable(false);
                        for (Subject subject : kurs.getSubjectList()){
                        listSubjects.getItems().add(subject.getNameSubject());
                    }
                }
            }

        });

        listSubjects.setOnAction(event ->{
            String selectedItem = listKurs.getSelectionModel().getSelectedItem();
            for (Kurs kurs : allTests.getKursList()){
                if(String.valueOf(kurs.getNumberKurs()).equals(selectedItem)){
                     for (Subject subject : kurs.getSubjectList()){
                         if (subject.getNameSubject().equals(listSubjects.getSelectionModel().getSelectedItem())){
                             listThemes.setDisable(false);
                             butAddNewTheme.setDisable(false);
                                for (Theme theme : subject.getThemeList()){
                                listThemes.getItems().add(theme.getNameTheme());
                                }
                         }
                        listSubjects.getItems().add(subject.getNameSubject());
                    }
                }
            }

        });



        listThemes.setOnAction(event ->{
            if (!listThemes.getSelectionModel().isEmpty()) {
                paneCreatorQuestion.setDisable(false);
            }
        });

    }

    private ToggleButton getNewButtonQuiz(int index) {
        index++;
        ToggleButton button = new ToggleButton(String.valueOf(index));
        button.setSelected(true);
        button.setToggleGroup(buttonQuestionGroup);
        System.out.println(button.getText());
        return button;
    }

    @FXML
    public void addNewKurs() {
        if (butKurs){
            textFieldKurs.setVisible(true);
            butAddKursToList.setVisible(true);
            butAddNewKurs.setText("-");
            butKurs = false;
        }else {
            textFieldKurs.setVisible(false);
            butAddKursToList.setVisible(false);
            butAddNewKurs.setText("+");
            butKurs = true;
        }

    }

    @FXML
    public void addKursToList() {
        if(!textFieldKurs.getText().equals("") &&
                textFieldKurs.getText()!=null)
            listKurs.getItems().add(textFieldKurs.getText());
            textFieldKurs.setText("");
    }

    @FXML
    public void addNewSubject() {
        if (butSubject){
            textFieldSubject.setVisible(true);
            butAddSubjectToList.setVisible(true);
            butAddNewSubject.setText("-");
            butSubject = false;
        }else {
            textFieldSubject.setVisible(false);
            butAddSubjectToList.setVisible(false);
            butAddNewSubject.setText("+");
            butSubject = true;
        }
    }

    @FXML
    public void addSubjectToList() {
            if(!textFieldSubject.getText().equals("") &&
                    textFieldSubject.getText()!=null)
            listSubjects.getItems().add(textFieldSubject.getText());
            textFieldSubject.setText("");


    }

    @FXML
    public void addNewTheme() {
        if (butTheme){
            textFieldTheme.setVisible(true);
            butAddThemeToList.setVisible(true);
            butAddNewTheme.setText("-");
            butTheme = false;
        }else {
            textFieldTheme.setVisible(false);
            butAddThemeToList.setVisible(false);
            butAddNewTheme.setText("+");
            butTheme = true;
        }
    }

    @FXML
    public void addThemeToList() {
        if(!textFieldTheme.getText().equals("") &&
                textFieldTheme.getText()!=null)
            listThemes.getItems().add(textFieldTheme.getText());
            textFieldTheme.setText("");
    }
}
*/
package com.wetyxa.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class QuizCreatorFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneCreatorQuestion;

    @FXML
    private TabPane tabPane;

    @FXML
    private ChoiceBox<String> listKurs;

    @FXML
    private Button butAddNewKurs;

    @FXML
    private Button butAddKursToList;

    @FXML
    private TextField textFieldKurs;

    @FXML
    private ChoiceBox<String> listSubjects;

    @FXML
    private Button butAddNewSubject;

    @FXML
    private Button butAddSubjectToList;

    @FXML
    private TextField textFieldSubject;

    @FXML
    private ChoiceBox<String> listThemes;

    @FXML
    private Button butAddNewTheme;

    @FXML
    private Button butAddThemeToList;

    @FXML
    private TextField textFieldTheme;


    //method var
    private boolean butKurs = true;
    private boolean butSubject = true;
    private boolean butTheme = true;

    @FXML
    void initialize() {

    }

/*  Методи управлння списками   */
    @FXML
    public void addKursToList() {
        if(!textFieldKurs.getText().equals("") &&
                textFieldKurs.getText()!=null)
            listKurs.getItems().add(textFieldKurs.getText());
        textFieldKurs.setText("");
    }

    @FXML
    public void addNewKurs() {
        if (butKurs){
            textFieldKurs.setVisible(true);
            butAddKursToList.setVisible(true);
            butAddNewKurs.setText("-");
            butKurs = false;
        }else {
            textFieldKurs.setVisible(false);
            butAddKursToList.setVisible(false);
            butAddNewKurs.setText("+");
            butKurs = true;
        }

    }


    @FXML
    public void addNewSubject() {
        if (butSubject){
            textFieldSubject.setVisible(true);
            butAddSubjectToList.setVisible(true);
            butAddNewSubject.setText("-");
            butSubject = false;
        }else {
            textFieldSubject.setVisible(false);
            butAddSubjectToList.setVisible(false);
            butAddNewSubject.setText("+");
            butSubject = true;
        }
    }

    @FXML
    public void addSubjectToList() {
        if(!textFieldSubject.getText().equals("") &&
                textFieldSubject.getText()!=null)
            listSubjects.getItems().add(textFieldSubject.getText());
        textFieldSubject.setText("");


    }

    @FXML
    public void addNewTheme() {
        if (butTheme){
            textFieldTheme.setVisible(true);
            butAddThemeToList.setVisible(true);
            butAddNewTheme.setText("-");
            butTheme = false;
        }else {
            textFieldTheme.setVisible(false);
            butAddThemeToList.setVisible(false);
            butAddNewTheme.setText("+");
            butTheme = true;
        }
    }

    @FXML
    public void addThemeToList() {
        if(!textFieldTheme.getText().equals("") &&
                textFieldTheme.getText()!=null)
            listThemes.getItems().add(textFieldTheme.getText());
        textFieldTheme.setText("");
    }



}
