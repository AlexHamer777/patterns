package structural.adapter;

/**
 * Created by Oleksii_Khamar on 5/19/2015.
 */
public class Adapter implements NeedInterface {

    ExistingInterface existingInterface = new ExistingInterface();

    @Override
    public void execute() {
        existingInterface.executing();
    }
}
