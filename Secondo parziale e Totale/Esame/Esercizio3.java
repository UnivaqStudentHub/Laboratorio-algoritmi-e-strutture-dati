package melipack.Esame;

import melipack.network.weighted.UndirectedNetwork;

import java.util.ArrayList;
import java.util.List;

public class Esercizio3<Vertex extends Comparable<? super Vertex>> extends UndirectedNetwork<Vertex> {
    public UndirectedNetwork<Vertex> complementary(){
        UndirectedNetwork<Vertex> out = new UndirectedNetwork<>();
        List<Vertex> vertici = new ArrayList<>();
        vertici.addAll( super.adjacencyMap.keySet());
        for(Vertex v : vertici){
            out.addVertex(v);
        }
        for(int i=0; i<vertici.size();i++){
            for(int j=i+1;j<vertici.size();j++){
                if(!super.containsEdge(vertici.get(i),vertici.get(j))){
                    out.addEdge(vertici.get(i),vertici.get(j),1.0);
                    //peso costante per tutti gli archi
                }
            }
        }

        return out;
    }
}
