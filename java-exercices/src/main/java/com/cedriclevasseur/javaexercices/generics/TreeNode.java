package com.cedriclevasseur.javaexercices.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cedric Levasseur <cedric.levasseur@gmail.com>
 */
public class TreeNode<String,T> {
    private List<TreeNode<String, T>> children = new ArrayList<TreeNode<String, T>>();
    private String name;
    private T value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode(String name, T value) {
        this.name = name;
        this.value = value;
    }
    
    public TreeNode(String name, T value, List<TreeNode<String,T>> children) {
        this.name = name;
        this.value = value;
        this.children=children;
    }
    
    

    public List<TreeNode<String, T>> getChildren() {
        return children;
    }

    public void addChild(TreeNode<String, T> child) {
        this.children.add(child);
    }
    
    public String show(){
        return show(0);
    }
    
    public String show(int indentInt){
        StringBuilder sb = new StringBuilder();
        StringBuilder indent=new StringBuilder();
        for(int i=0;i<indentInt;i++){
            indent.append("   ");
        }
        sb.append(name+"\n");
        for(TreeNode child : children){
            sb.append(indent).append("|--"+child.show(indentInt+1));
        }
        String result = (String) sb.toString();
        return result;
    }
    
    
}
