package api;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

public class Node_Data implements NodeData {
    private int key;
    private Geo_Location point;
    private double weight;
    private String info;
    private int tag;
    private Hashtable<Integer,Edge_Data> Edges;
    private LinkedList<Integer> fromMe;
    private LinkedList<Integer> toMe;


    public Node_Data(int key,Geo_Location point,double weight, String info, int tag){
        this.key = key;
        this.point=point;
        this.weight = weight;
        this.info=info;
        this.tag=tag;
        this.fromMe = new LinkedList<Integer>();
        this.toMe = new LinkedList<Integer>();
        this.Edges=new Hashtable<Integer,Edge_Data>();

    }

    public Node_Data(int key,Geo_Location point,double weight){
        this.key = key;
        this.point=point;
        this.weight = weight;
        this.info=info;
        this.tag=tag;
        this.EdgesFromMe =new ArrayList<Edge_Data>();
    }

    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public GeoLocation getLocation() {
        return this.point;
    }

    @Override
    public void setLocation(GeoLocation p) {
        this.point = (Geo_Location)p;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double w) {
        this.weight=w;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(String s) {
        this.info = s;
    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {
        this.tag=t;
    }

    public Hashtable<Integer,Edge_Data> Edges(){
        return this.Edges;
    }

    public LinkedList<Integer> fromMe(){
        return this.fromMe;
    }
    public LinkedList<Integer> toMe(){
        return this.toMe;
    }

}
