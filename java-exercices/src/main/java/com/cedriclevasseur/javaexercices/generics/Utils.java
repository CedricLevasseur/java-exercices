package com.cedriclevasseur.javaexercices.generics;

public class Utils {
    /* Une fonction generique ! */

    public static <T, U> String show(TreeNode<T, U> root) {
        return show(root, "");
    }

    public static <T, U> String show(TreeNode<T, U> root, String indent) {
        StringBuilder sb = new StringBuilder();

        if (indent != "") {
            sb.append(indent+"|-- ");
        }
        sb.append(root.getName() + "\n");
        indent += "   ";
        for (TreeNode<T, U> child : root.getChildren()) {
            sb.append( Utils.<T, U>show(child, indent));
        }
        

        String result = (String) sb.toString();

        return result;

    }
}
