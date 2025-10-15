package Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design;
import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Button.Button;
import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Button.WindowsButton;
import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Checkbox.CheckBox;
import Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Checkbox.WindowsCheckBox;

public class WindowsFactory extends ComponentFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
    
}
