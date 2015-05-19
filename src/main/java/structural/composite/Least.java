package structural.composite;

/**
 * Created by Oleksii_Khamar on 5/19/2015.
 */
public class Least implements TreeNode{

    public String name = "";

    public Least(String name){
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("I am least " + name);
    }
}
