/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Test {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new TreeNode(1, 0, "1"));
        list.add(new TreeNode(11, 1, "1.1"));
        list.add(new TreeNode(12, 1, "1.2"));
        list.add(new TreeNode(111, 11, "1.1.1"));
        list.add(new TreeNode(112, 11, "1.1.2"));
        list.add(new TreeNode(121, 12, "1.2.1"));
        list.add(new TreeNode(122, 12, "1.2.2"));
        
        MultiTreeBuilder tree = new MultiTreeBuilder(list);
        System.out.println( tree.isValidTree());
        System.out.println( tree.getTreeNodeById(121).getNodeName());
        tree.toTree().levelOrderTraversal();
    }
}
