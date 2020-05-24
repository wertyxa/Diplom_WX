package com.wetyxa;

import com.wetyxa.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main extends Application {

    private static Stage globalStage;
    private static AnchorPane rootLayout;
    public void start(Stage primaryStage) throws Exception {
        this.globalStage = primaryStage;
        this.globalStage.setTitle("Application");
        initRootLayout();
        showCreateForm();
    }

    private void showCreateForm() throws IOException {
        FXMLLoader loader = loadTemplate("quizCreatorForm");
        AnchorPane pane = loader.load();
        rootLayout.getChildren().add(pane);
    }

    private void initRootLayout() {
        /*try {
            FXMLLoader loader = loadTemplate("rootLayout");
            rootLayout = (BorderPane) loader.load();
            Scene scene = new Scene(rootLayout);
            globalStage.setScene(scene);
            globalStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        rootLayout = new AnchorPane();
        Scene scene = new Scene(rootLayout);
        globalStage.setScene(scene);
        globalStage.show();

    }

    public static FXMLLoader loadTemplate(String name) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource
                ("/templates/"+name+".fxml"));
        return loader;
    }
    public static void main(String[] args) {
        launch(args);
    }

    public static AllTests testAlldata(){

        List<Question> questionsList1  = new LinkedList<>();


        Question e11 = new Question("Відомо, що 100% - це число 3. Отже 1% - це число ...", new HashMap<>());
        e11.getListAnswers().put("300", false);
        e11.getListAnswers().put("30", false);
        e11.getListAnswers().put("0.3", false);
        e11.getListAnswers().put("0.03", true);

        Question e12 = new Question("Маса сушених грибів становить 12% маси свіжих. Скільки потрібно зібрати свіжих грибів, щоб отримати 4,8 кг сушених?", new HashMap<>());
        e12.getListAnswers().put("400", true);
        e12.getListAnswers().put("40", false);
        e12.getListAnswers().put("0.4", false);
        e12.getListAnswers().put("48", false);

        Question e13 = new Question("Відомо, що 1% - це число 7. Отже 100% - це число ...", new HashMap<>());
        e13.getListAnswers().put("700", false);
        e13.getListAnswers().put("70", false);
        e13.getListAnswers().put("0.07", true);
        e13.getListAnswers().put("0.7", false);

        Question e14 = new Question("Відомо, що 10% - це число 70. Отже 1% - це число ...", new HashMap<>());
        e14.getListAnswers().put("7", true);
        e14.getListAnswers().put("700", false);
        e14.getListAnswers().put("0.7", false);
        e14.getListAnswers().put("0.07", false);


        questionsList1.add(e11);
        questionsList1.add(e12);
        questionsList1.add(e13);
        questionsList1.add(e14);


        Theme t11 = new Theme("Задачі на відсотки", questionsList1);
        List<Question> questionsList2 = new LinkedList<>();
        Theme t12 = new Theme("Множення і ділення з числами 0, 1, 10, 100.", questionsList2);

        Question e21 = new Question("Відомо, що 100% - це число 3. Отже 1% - це число ...", new HashMap<>());
        e21.getListAnswers().put("300", false);
        e21.getListAnswers().put("30", false);
        e21.getListAnswers().put("0.3", false);
        e21.getListAnswers().put("0.03", true);

        Question e22 = new Question("Маса сушених грибів становить 12% маси свіжих. Скільки потрібно зібрати свіжих грибів, щоб отримати 4,8 кг сушених?", new HashMap<>());
        e22.getListAnswers().put("400", true);
        e22.getListAnswers().put("40", false);
        e22.getListAnswers().put("0.4", false);
        e22.getListAnswers().put("48", false);

        Question e23 = new Question("Відомо, що 1% - це число 7. Отже 100% - це число ...", new HashMap<>());
        e23.getListAnswers().put("700", false);
        e23.getListAnswers().put("70", false);
        e23.getListAnswers().put("0.07", true);
        e23.getListAnswers().put("0.7", false);

        Question e24 = new Question("Відомо, що 10% - це число 70. Отже 1% - це число ...", new HashMap<>());
        e24.getListAnswers().put("7", true);
        e24.getListAnswers().put("700", false);
        e24.getListAnswers().put("0.7", false);
        e24.getListAnswers().put("0.07", false);


        questionsList2.add(e21);
        questionsList2.add(e22);
        questionsList2.add(e23);
        questionsList2.add(e24);


        List<Theme> themeList1 = new LinkedList<>();
        themeList1.add(t11);
        themeList1.add(t12);

        List<Subject> subjectList1 = new LinkedList<>();
        subjectList1.add(new Subject("Математика", themeList1));

        List<Kurs> kursList1 = new LinkedList<>();
        kursList1.add(new Kurs(1, subjectList1));




        AllTests allTests = new AllTests();
        ;
        allTests.setKursList(kursList1);
       //System.out.println(allTests);
        return allTests;
    }
}
