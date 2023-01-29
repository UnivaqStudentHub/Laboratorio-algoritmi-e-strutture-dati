package melipack.Esercizi.D2021_2022.Svolgimenti.Appello1;


import melipack.network.weighted.Network;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Esercizio3<Vertex extends Comparable<? super Vertex>> extends Network<Vertex> {
    public Network<Vertex> transpose() {
        Network<Vertex> transpose = new Network<>(this);
        Set<Vertex> vertices = adjacencyMap.keySet();

        Iterator<Vertex> iterator = vertices.iterator();
        Vertex v1 = iterator.next();
        while (iterator.hasNext()) {
            Vertex v2 = iterator.next();
            Double peso = transpose.getEdgeWeight(v1, v2);
            transpose.removeEdge(v1, v2);
            transpose.addEdge(v2, v1, peso);
            v1 = v2;
        }

        return transpose;
    }
}
