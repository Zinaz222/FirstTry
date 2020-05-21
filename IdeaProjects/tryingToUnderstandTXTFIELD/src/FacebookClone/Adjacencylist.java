import java.util.ArrayList;
import java.util.*;

public class Adjacencylist <E extends Profile> {
    //this is a class that represents the ADT Graph as an adjacency list

    private ArrayList<E> connections;

    public Adjacencylist(){
        connections = new ArrayList<E>();
    }
    //add a new connection
    public void addvertex(E  vertex){
        connections.add(vertex);
    }

    //removing a friend from friends list (removing vertex from graph)
    public void remove(E vertex){
        Profile removevert = (Profile) vertex;
        ArrayList<Profile> profilelist = removevert.getconnections();
        for(i=0;i<profilelist.size();i++){
            profilelist.get(i).removeFriend(removevert);
        }
        connections.remove(vertex);
    }
    //return the users connections
    public ArrayList<E> getConnections(){
        return connections;
    }


}
