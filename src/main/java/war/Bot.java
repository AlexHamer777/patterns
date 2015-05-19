package war;

/**
 * Created by Oleksii_Khamar on 5/19/2015.
 */
public abstract class Bot {

    public Shock shock = null;

    public Bot(){

    }

    public static Bot createBot(String name){
        Class c = null;
        Bot b = null;
        try {
            c = Class.forName("war."+name);
            try {
                b = (Bot)c.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return b;
    }

    public abstract void beat();

}
