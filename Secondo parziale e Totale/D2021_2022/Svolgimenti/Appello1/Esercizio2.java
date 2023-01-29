package melipack.Esercizi.D2021_2022.Svolgimenti.Appello1;

import melipack.examples.Examples;
import melipack.tree.BinaryTree;
import melipack.tree.binarytree.BinaryNode;
import melipack.tree.binarytree.LinkedBinaryTree;

public class Esercizio2<E> {
    public static void main(String[] args) {
        BinaryNode<String> leftFoglia = new BinaryNode<>("leftFoglia");
        BinaryNode<String> rightFoglia = new BinaryNode<>("rightFoglia");
        BinaryNode<String> left = new BinaryNode<>(leftFoglia,"left",rightFoglia);
        BinaryNode<String> right = new BinaryNode<>(leftFoglia,"right",rightFoglia);
        BinaryNode<String> finale = new BinaryNode<>(left,"root",right);


        printLeafs(finale);
    }
    public static <E> void printLeafs(BinaryNode<E> root){
        if(root.getLeft()==null && root.getRight()==null){
            System.out.println(root.getData());
        }
        else {
            printLeafs(root.getRight());
            printLeafs(root.getLeft());
        }
    }
}

