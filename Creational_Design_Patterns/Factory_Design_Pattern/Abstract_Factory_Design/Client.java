package Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design;

import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Button.Button;
import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Checkbox.CheckBox;

public class Client {

    public static void main(String[] args) {

        ComponentFactory factory = new WindowsFactory(); // one choice creates entire family
        Button b = factory.createButton();
        CheckBox c = factory.createCheckBox();

        b.paint();
        c.paint();

    }

}
