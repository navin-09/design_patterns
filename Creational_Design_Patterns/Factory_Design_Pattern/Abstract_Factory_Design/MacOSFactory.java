package Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design;

import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Button.Button;
import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Button.MacOSButton;
import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Checkbox.CheckBox;
import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Checkbox.MacOSCheckBox;

public class MacOSFactory extends ComponentFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
    
}
