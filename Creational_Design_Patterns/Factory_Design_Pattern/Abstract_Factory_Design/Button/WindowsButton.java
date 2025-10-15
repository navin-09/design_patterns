package Creational_Design_Patterns.Factory_Design_Pattern.Abstract_Factory_Design.Button;

public class WindowsButton extends Button {

    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }

}
