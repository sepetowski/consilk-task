package com.consilk.recruitment.main;


import com.consilk.recruitment.controller.Controller;
import com.consilk.recruitment.model.Model;
import com.consilk.recruitment.view.View;

public class Main {
    public static void main(String[] args) {


        View view = new View();
        Model model= new Model();
        Controller controller= new Controller(model,view);

        controller.runController();
    }
}