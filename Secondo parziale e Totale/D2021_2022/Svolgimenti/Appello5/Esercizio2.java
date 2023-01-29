package melipack.Esercizi.D2021_2022.Svolgimenti.Appello5;

import melipack.tree.binarytree.BinaryNode;

public class Esercizio2 {

    private static int numeroNodi = 0;
    public static <E> int countInternalNodes(BinaryNode<E> root){
        BinaryNode<E> current = root;
        if(current == null)
            return 0;
        if(current.getLeft() != null || current.getRight() != null){
            numeroNodi++;
            numeroNodi += countInternalNodes(current.getLeft());
            numeroNodi += countInternalNodes(current.getRight());
        }
        return numeroNodi;
    }
}
