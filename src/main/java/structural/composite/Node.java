package structural.composite;

import java.util.ArrayList;

/**
 * Created by Oleksii_Khamar on 5/19/2015.
 */
public class Node implements TreeNode{

    public TreeNode[] treeNodes;
    public String name = "";

    public Node(){
        
    }

    public Node(String name, TreeNode[] treeNodes){
        this.treeNodes = treeNodes;
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("I am node " + name);
        for (TreeNode node: treeNodes){
            node.execute();
        }
    }
}
