package com.cedriclevasseur.javaexercices;

import com.cedriclevasseur.javaexercices.generics.TreeNode;
import com.cedriclevasseur.javaexercices.generics.Utils;

/**
 *
 * @author Cedric Levasseur <cedric.levasseur@gmail.com>
 */
public class GenericMain {

    
    
    public static void main(String[] args){
        TreeNode<String, String> root = new TreeNode<>("root", "0");
        TreeNode<String, String> branch1 = new TreeNode<>("branch1", "1");
        TreeNode<String, String> branch2 = new TreeNode<>("branch2", "2");
        TreeNode<String, String> subbranch1 = new TreeNode<>("subbranch1", "3");
        TreeNode<String, String> leaf1 = new TreeNode<>("leaf1", "4");
        TreeNode<String, String> leaf2 = new TreeNode<>("leaf2", "5");
        TreeNode<String, String> leaf3 = new TreeNode<>("leaf3", "6");
        TreeNode<String, String> leaf4 = new TreeNode<>("leaf4", "7");
        TreeNode<String, String> leaf5 = new TreeNode<>("leaf5", "8");
        TreeNode<String, String> leaf6 = new TreeNode<>("leaf6", "9");

        subbranch1.addChild(leaf5);
        subbranch1.addChild(leaf6);
        branch1.addChild(leaf1);
        branch1.addChild(leaf2);
        branch2.addChild(leaf3);
        branch2.addChild(leaf4);
        branch2.addChild(subbranch1);
        root.addChild(branch1);
        root.addChild(branch2);
        
        System.out.println((String)Utils.show(root));
        
    }
    
}
