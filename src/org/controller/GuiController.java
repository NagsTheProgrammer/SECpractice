package org.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class GuiController
{
    @FXML
    private TextArea routeText;

    @FXML
    public void route1Pressed(ActionEvent e)
    {
        String s = DrivingInstructions(0);

        System.out.println("Route 1 pressed");
        routeText.setText(s);
    }

    @FXML
    public void route2Pressed(ActionEvent e)
    {
        String s = DrivingInstructions(1);

        System.out.println("Route 2 pressed");
        routeText.setText(s);
    }

    @FXML
    public void route3Pressed(ActionEvent e)
    {
        String s = DrivingInstructions(2);

        System.out.println("Route 1 pressed");
        routeText.setText(s);
    }

    @FXML
    public void routeInfoPressed(ActionEvent e)
    {
        String s = DrivingInstructions(1);

        System.out.println("Route 1 pressed");
        routeText.setText(s);
    }

    @FXML
    public void changeValuesPressed(ActionEvent e)
    {
        

        System.out.println("Route 1 pressed");
        routeText.setText(s);
    }

}
