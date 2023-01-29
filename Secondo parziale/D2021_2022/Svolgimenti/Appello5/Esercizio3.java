package melipack.Esercizi.D2021_2022.Svolgimenti.Appello5;

import melipack.network.weighted.UndirectedNetwork;

import java.util.Iterator;
import java.util.Set;

public class Esercizio3<Vertex extends Comparable<? super Vertex>> extends UndirectedNetwork<Vertex> {
    public void grafoCompleto(){
        Set<Vertex> vertici = super.adjacencyMap.keySet();
        Iterator<Vertex> iteratore = vertici.iterator();
        Vertex v1 = iteratore.next();
        while(iteratore.hasNext()){
            Vertex v2 = iteratore.next();
            if(!super.containsEdge(v1, v2)){
                super.addEdge(v1, v2, 0.0);
            }
            v1 = v2;
        }
    }
}
