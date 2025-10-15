package Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design;

import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Button.Button;
import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Checkbox.CheckBox;

public abstract class ComponentFactory {
    public abstract Button createButton();
    public abstract CheckBox createCheckBox();
}
