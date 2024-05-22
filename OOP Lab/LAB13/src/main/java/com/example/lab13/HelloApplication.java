package com.example.lab13;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 275);
        stage.setScene(scene);
        Text scenetitle = new Text("Add New User");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        Label Email = new Label("Email:");
        grid.add(Email, 0, 3);
        Label Address= new Label("Address");
        grid.add(Address, 0, 4);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        TextField userTextField2 = new TextField();
        grid.add(userTextField2, 1, 3);
        TextField userTextField3 = new TextField();
        grid.add(userTextField3, 1, 4);
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 8);
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 14);

        Label subjects= new Label("Subjects:");
        grid.add(subjects,0,5);



        CheckBox check1= new CheckBox("OOP");
//        grid.add(check1,1,6);
        CheckBox check2= new CheckBox("DB");
//        grid.add(check2,1,7);
        CheckBox check3= new CheckBox("WEB");
//        grid.add(check3,1,8);
        CheckBox check4= new CheckBox("Android");
        HBox boxes=new HBox(10);
        boxes.setAlignment(Pos.CENTER);
        boxes.getChildren().addAll(check1,check2,check3,check4);
        grid.add(boxes,1,5);

        Label Gender= new Label("Gender:");
        grid.add(Gender,0,6);
        HBox radios=new HBox(10);

        RadioButton rdbtn=new RadioButton("Male");


        RadioButton rdbtn2=new RadioButton("Female");
        radios.getChildren().addAll(rdbtn,rdbtn2);
        grid.add(radios,1,6);
        ToggleGroup tg=new ToggleGroup();
        rdbtn.setToggleGroup(tg);
        rdbtn2.setToggleGroup(tg);
        Label city=new Label("Select City");
        grid.add(city,0,7);
//
        ChoiceBox ch= new ChoiceBox<>(FXCollections.observableArrayList(
                "Rawalpindi", "Islamabad", "Sialkot", "Faisalabad", "Kohat"));
        grid.add(ch,1,7);
        String[] finalStr1 = new String[10];
        check1.setOnAction((ActionEvent event) -> {
            if (check1.isSelected()) {
                finalStr1[0]=check1.getText();
            }
        });
        check2.setOnAction((ActionEvent event) -> {
            if (check2.isSelected()) {
                finalStr1[1]=check2.getText();
            }
        });
        check3.setOnAction((ActionEvent event) -> {
            if (check3.isSelected()) {
                finalStr1[2]=check3.getText();
            }
        });
        check4.setOnAction((ActionEvent event) -> {
            if (check4.isSelected()) {
                finalStr1[3]=check4.getText();
            }
        });
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
        {
            public void changed(ObservableValue<? extends Toggle> ob,
                                Toggle o, Toggle n)
            {
                RadioButton rb = (RadioButton)tg.getSelectedToggle();
                if (rb != null) {
                    finalStr1[6]=rb.getText();
                } }
        });
        SingleSelectionModel<String> model = ch.getSelectionModel();
        model.selectedItemProperty().addListener((observableValue, s, t1) ->finalStr1[5]=t1    );
        btn.setOnAction((EventHandler<ActionEvent>) new
                EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {

                        stage.setHeight(600);
                        actiontarget.setText("Add User button pressed"
                                +"\n\nUsernme "+userTextField.getText()
                                +"\nPassword "+pwBox.getText()
                                +"\nEmail "+userTextField2.getText()
                                +"\nAddress "+userTextField3.getText()
                                +"\nYou chose "+ finalStr1[0]+","+finalStr1[1]
                                +","+finalStr1[2]+","+finalStr1[3]
                                +"\nCity: "+finalStr1[5]
                                +"\nGender: "+finalStr1[6]
                        );
                    } });

        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setHeight(450);
        stage.setWidth(375);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}