package api;

import java.util.ArrayList;
import java.util.Iterator;

public class Directed implements DirectedWeightedGraph{
    private ArrayList<Node_Data> Nodes;
    private ArrayList<Edge_Data> Edges;

    @Override
    public NodeData getNode(int key) {
        return this.Nodes.get(key);
    }

    @Override
    public EdgeData getEdge(int src, int dest){
        return Edges.get(dest + src*10);
    }

    @Override
    public void addNode(NodeData n) {
        Nodes.add(n.getKey(),(Node_Data) n);
        //assuming that the key is the next one that clear
    }

    @Override
    public void connect(int src, int dest, double w) {
        Edge_Data edgi = new Edge_Data(src,dest,w);
        Nodes.get(src).fromMe().add(dest);
        Nodes.get(src).Edges().put(dest,edgi);
        Nodes.get(dest).toMe().add(src);
        Edges.add(dest + src*10,edgi);
    }

    @Override
    public Iterator<NodeData> nodeIter() {



        return null;
    }

    @Override
    public Iterator<EdgeData> edgeIter() {
        return null;
    }

    @Override
    public Iterator<EdgeData> edgeIter(int node_id) {
        return null;
    }

    @Override
    public NodeData removeNode(int key) {
        int k = Nodes.get(key).fromMe().size();
        for (int i = 0; i < k; i++) {
            int j = Nodes.get(key).fromMe().remove();

        }
    }

    @Override
    public EdgeData removeEdge(int src, int dest) {
        return null;
    }

    @Override
    public int nodeSize() {
        return 0;
    }

    @Override
    public int edgeSize() {
        return 0;
    }

    @Override
    public int getMC() {
        return 0;
    }
}
