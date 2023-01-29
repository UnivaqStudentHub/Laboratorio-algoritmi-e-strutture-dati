package melipack.Esercizi.D2021_2022.Svolgimenti.Appello2;

import melipack.tree.binarytree.BinaryNode;
import melipack.tree.binarytree.LinkedBinaryTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Esercizio2<E> {
    public static <E> ArrayList<E> listOfNodes(LinkedBinaryTree<E> t){
        ArrayList<E> list = new ArrayList<>();
        Iterator<E> iterator = t.iteratorLevelOrder();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        return list;
    }
}
