package melipack.Esercizi.D2021_2022.Svolgimenti.Appello4;

import melipack.network.weighted.Network;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Esercizio2<Vertex extends Comparable<? super Vertex>> extends Network<Vertex> {
    public void trasposto(){
        Set<Vertex> vertici = super.adjacencyMap.keySet();
        Iterator<Vertex> iterator = vertici.iterator();
        Vertex v1 = iterator.next();
        while (iterator.hasNext()){
            Vertex v2 = iterator.next();
            if(super.containsEdge(v1,v2)){
                Double peso = super.getEdgeWeight(v1,v2);
                super.removeEdge(v1,v2);
                super.addEdge(v1,v2,peso);
            }
            v1=v2;
        }
    }
}
