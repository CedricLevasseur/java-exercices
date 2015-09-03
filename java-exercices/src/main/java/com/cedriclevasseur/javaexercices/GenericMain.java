package com.cedriclevasseur.javaexercices;

import com.cedriclevasseur.javaexercices.generics.TreeNode;

/**
 *
 * @author Cedric Levasseur <cedric.levasseur@gmail.com>
 */
public class GenericMain {

    
    
    public static void main(String[] args){
        TreeNode<String, String> root = new TreeNode<>("root", "0");
        TreeNode<String, String> branch1 = new TreeNode<>("branch1", "1");
        TreeNode<String, String> branch2 = new TreeNode<>("branch2", "2");
        TreeNode<String, String> leaf1 = new TreeNode<>("leaf1", "3");
        TreeNode<String, String> leaf2 = new TreeNode<>("leaf2", "4");
        TreeNode<String, String> leaf3 = new TreeNode<>("leaf3", "5");
        TreeNode<String, String> leaf4 = new TreeNode<>("leaf4", "6");

        branch1.addChild(leaf1);
        branch1.addChild(leaf2);
        branch2.addChild(leaf3);
        branch2.addChild(leaf4);
        root.addChild(branch1);
        root.addChild(branch2);
        
        System.out.println((String)root.show());
        
    }
    
}
