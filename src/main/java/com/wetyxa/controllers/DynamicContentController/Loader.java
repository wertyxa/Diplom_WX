package com.wetyxa.controllers.DynamicContentController;

import com.wetyxa.Main;
import com.wetyxa.controllers.QuestionCreatorController;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Map;

public class Loader {
/*
    public Tab loadQuestion(String textQuestion,Map<String,Boolean> answers, String nameTab) throws IOException {
        Tab tab = new Tab(nameTab);
            FXMLLoader fxmlLoader = Main.loadTemplate("dinamic/questionCreator.fxml");
                QuestionCreatorController controller = new QuestionCreatorController();
            fxmlLoader.setController(controller);
                tab.setContent(fxmlLoader.load());
            controller.setQuestionText(textQuestion);

        for (Map.Entry<String,Boolean> answer :answers.entrySet()){
            controller.getvBoxFieldAnswer()
                    .getChildren().
                    add(new TextField(answer.getKey()));
            RadioButton radioButton = new RadioButton();
            radioButton.setToggleGroup(controller.getGroupRadioAnswer());
            radioButton.setSelected(answer.getValue());
            controller.getvBoxRadioButtonsIsRight()
                    .getChildren().
                    add(radioButton);
        }
        return tab;
    }
*/
}
