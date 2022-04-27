package com.example.tableviewpractice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Fam extends Application implements Serializable  {
    private TableView table = new TableView();
    String name;
    int age;
    String relationship;

    public Fam(){}

    public Fam(String name, int age, String relationship) {
        this.name = name;
        this.age = age;
        this.relationship = relationship;
    }

    public String toString(){
        return "name= " + name+
                " age= " + age+
                " relationship= " + relationship;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Fam fam = new Fam("Quentin", 1, "son");
        Fam fam1 = new Fam("Katie", 34, "wife");
        List list = new ArrayList();
        list.add(fam);
        System.out.println(list.get(0));
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.text"));
            oos.writeObject(list);
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }

        /*Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(300);
        stage.setHeight(500);

        final Label label = new Label("Family Tree");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn NameCol = new TableColumn("First Name");
        TableColumn AgeCol = new TableColumn("Age");
        TableColumn RelationshipCol = new TableColumn("Relationship");

        table.getColumns().addAll(NameCol, AgeCol, RelationshipCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();*/
    }
}
