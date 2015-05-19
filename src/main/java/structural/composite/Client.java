package structural.composite;

import java.util.ArrayList;

/**
 * Created by Oleksii_Khamar on 5/19/2015.
 */
public class Client {

    public static void main(String[] args){
        TreeNode node = new Node("first",
                new TreeNode[]{
                        new Least("fleast"),
                        new Node("second",
                                new TreeNode[]{
                                        new Least("sfleast"),
                                        new Least("ssleast")})});
        node.execute();
    }
}
