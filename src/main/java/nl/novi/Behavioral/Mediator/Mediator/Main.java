package nl.novi.Behavioral.Mediator.Mediator;

import nl.novi.Behavioral.Mediator.Mediator.elementen.*;
import nl.novi.Behavioral.Mediator.Mediator.mediator.Editor;
import nl.novi.Behavioral.Mediator.Mediator.mediator.Mediator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
