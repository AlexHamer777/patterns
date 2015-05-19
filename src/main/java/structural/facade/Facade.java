package structural.facade;

/**
 * Created by Oleksii_Khamar on 5/19/2015.
 */
public class Facade implements NeedInterface {

    FirstClass firstClass = new FirstClass();
    SecondClass secondClass = new SecondClass();

    @Override
    public void execute() {
        firstClass.executing();
        secondClass.executing();
    }
}
