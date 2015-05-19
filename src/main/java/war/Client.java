package war;

/**
 * Created by Oleksii_Khamar on 5/19/2015.
 */
public class Client {

    public static void main(String[] args){

        Bot first = Bot.createBot("Droid");
        Bot second = Bot.createBot("Droideka");
        first.beat();
        second.beat();
    }
}
