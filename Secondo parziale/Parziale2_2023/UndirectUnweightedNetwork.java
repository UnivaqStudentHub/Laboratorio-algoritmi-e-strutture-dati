package melipack.Esercizi.Parziale2_2023;

import melipack.network.unweighted.UnweightedNetwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UndirectUnweightedNetwork<Vertex> extends UnweightedNetwork<Vertex> {

    public UndirectUnweightedNetwork(){
        super();
    }

    public UndirectUnweightedNetwork(UnweightedNetwork<Vertex> network){
        super(network);
    }

    public int edgeSize() {
        int count = 0;
        List<Vertex> vertici = new ArrayList<>();

        /*
        for (HashSet<Vertex> neighborsSet: adjacencyMap.values()){
            for(Vertex vertice : neighborsSet){
                if(!vertici.contains(vertice)){
                    count ++;
                    vertici.add(vertice);
                }
            }
        }
        */

        for (HashSet<Vertex> neighborsSet: adjacencyMap.values()) count += neighborsSet.size();


        return  count/2;
    }

    public boolean addEdge(Vertex v1,Vertex v2){
        return super.addEdge(v1,v2) && super.addEdge(v2,v1);
    }

    public boolean removeEdge (Vertex v1, Vertex v2){
        return super.removeEdge(v1,v2) && super.removeEdge(v2,v1);
    }

    // devo ridefinirlo perchè cambia il tipo di Oggetto
    public boolean equals (Object obj)
    {
        if ((obj == null) || !(obj instanceof UndirectUnweightedNetwork<?>))
            return false;
        UndirectUnweightedNetwork<?> other = (UndirectUnweightedNetwork<?>)obj;
        return adjacencyMap.equals (other.adjacencyMap);
    }
}
