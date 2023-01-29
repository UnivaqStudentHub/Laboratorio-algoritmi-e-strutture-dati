package melipack.Esercizi.D2021_2022.Svolgimenti.Appello3;

import melipack.tree.binarytree.BinaryNode;

public class Esercizio2 {
    public static <T extends Comparable<? super T>> boolean isAscending(BinaryNode<T> root){
        if(root==null) return true;
        if(root.getRight().getData().compareTo(root.getData()) <= 0 || root.getLeft().getData().compareTo(root.getData())<=0){
            return false;
        }
        else{
            return isAscending(root.getLeft()) && isAscending(root.getRight());
        }
    }
}
