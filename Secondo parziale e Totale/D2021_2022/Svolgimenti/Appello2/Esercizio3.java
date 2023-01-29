package melipack.Esercizi.D2021_2022.Svolgimenti.Appello2;

import melipack.network.weighted.Network;

import java.util.TreeMap;
import java.util.Vector;

public class Esercizio3<Vertex extends Comparable<? super Vertex>> extends Network<Vertex> {
    public Network<Vertex> invertiNegativi(){
        Network<Vertex> inverted = new Network<>();
        for(Vertex v : super.adjacencyMap.keySet()) {
            inverted.addVertex(v);
        }

        for (Vertex v : super.adjacencyMap.keySet()){
            TreeMap<Vertex,Double> map = super.adjacencyMap.get(v);
            for(Vertex vertex : map.keySet()){
                if(map.get(vertex)>0) inverted.addEdge(v,vertex,map.get(vertex));
                else{
                    inverted.addEdge(vertex,v,-map.get(vertex));
                }
            }
        }

        return inverted;
    }
}
