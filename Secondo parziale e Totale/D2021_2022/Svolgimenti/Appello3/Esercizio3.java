package melipack.Esercizi.D2021_2022.Svolgimenti.Appello3;

import melipack.network.weighted.Network;

public class Esercizio3 {
    public  static Network<String> NetworkOfStrings(String[] v){
        Network<String> network = new Network<>();
        for(String s : v){
            network.addVertex(s);
        }
        for(int i = 0;i<v.length;i++){
            for(int j=i+1;j<v.length;j++){
                Double peso = v[i].length()+v[j].length()+0.0;
                network.addEdge(v[i],v[j],peso);
                network.addEdge(v[j],v[i],peso);
            }
        }
        return network;
    }
}
