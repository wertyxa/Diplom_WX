package com.wetyxa.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class QuestionCreatorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea questionText;

    @FXML
    private VBox vBoxFieldAnswer;

    @FXML
    private VBox vBoxRadioButtonsIsRight;

    @FXML
    private Button saveQuestionButton;

    @FXML
    private Button deleteQuestionButton;

    @FXML
    private Button addNewQuestionButton;

    @FXML
    private Button addNewAnswerButton;

    public TextArea getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText.setText(questionText);
    }

    public VBox getvBoxFieldAnswer() {
        return vBoxFieldAnswer;
    }

    public void setvBoxFieldAnswer(VBox vBoxFieldAnswer) {
        this.vBoxFieldAnswer = vBoxFieldAnswer;
    }

    public VBox getvBoxRadioButtonsIsRight() {
        return vBoxRadioButtonsIsRight;
    }

    public void setvBoxRadioButtonsIsRight(VBox vBoxRadioButtonsIsRight) {
        this.vBoxRadioButtonsIsRight = vBoxRadioButtonsIsRight;
    }

    public Button getSaveQuestionButton() {
        return saveQuestionButton;
    }

    public void setSaveQuestionButton(Button saveQuestionButton) {
        this.saveQuestionButton = saveQuestionButton;
    }

    public Button getDeleteQuestionButton() {
        return deleteQuestionButton;
    }

    public void setDeleteQuestionButton(Button deleteQuestionButton) {
        this.deleteQuestionButton = deleteQuestionButton;
    }

    public Button getAddNewQuestionButton() {
        return addNewQuestionButton;
    }

    public void setAddNewQuestionButton(Button addNewQuestionButton) {
        this.addNewQuestionButton = addNewQuestionButton;
    }

    public Button getAddNewAnswerButton() {
        return addNewAnswerButton;
    }

    public void setAddNewAnswerButton(Button addNewAnswerButton) {
        this.addNewAnswerButton = addNewAnswerButton;
    }

    public ToggleGroup getGroupRadioAnswer() {
        return groupRadioAnswer;
    }

    public void setGroupRadioAnswer(ToggleGroup groupRadioAnswer) {
        this.groupRadioAnswer = groupRadioAnswer;
    }

    public int getCounterIndexAnswers() {
        return counterIndexAnswers;
    }

    public void setCounterIndexAnswers(int counterIndexAnswers) {
        this.counterIndexAnswers = counterIndexAnswers;
    }


    public QuestionCreatorController() {
    }


    @FXML
    void addNewTabQuestion(ActionEvent event) {

    }

    @FXML
    void deleteQuestion(ActionEvent event) {

    }

    @FXML
    void saveQuestion(ActionEvent event) {

    }


    private ToggleGroup groupRadioAnswer;

    private int counterIndexAnswers = 0;

    @FXML
    void initialize() {

    }

    @FXML
    void addNewAnswer() {
        TextField newAnswer = new TextField();
        newAnswer.setPromptText("Відповідь");
        vBoxFieldAnswer.getChildren().add(vBoxFieldAnswer.getChildren().size(), newAnswer);

        RadioButton newRadio = new RadioButton();
        newRadio.setToggleGroup(groupRadioAnswer);
        vBoxRadioButtonsIsRight.getChildren().add(vBoxRadioButtonsIsRight.getChildren().size(), newRadio);

    }
}
