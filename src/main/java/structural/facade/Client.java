package structural.facade;

/**
 * Created by Oleksii_Khamar on 5/19/2015.
 */
public class Client {

    public static void main(String[] args){
        NeedInterface needInterface = new Facade();

        needInterface.execute();
    }
}
