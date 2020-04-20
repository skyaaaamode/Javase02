package structure.图;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Dijkstra {
    public static HashMap<GNode,Integer> dijkstra(GNode head){
        if(head==null){
            return null;
        }
        HashMap<GNode, Integer> distance = new HashMap<>();
        HashSet<GNode> touchedNode = new HashSet<>();
        distance.put(head,0);
        GNode mInNode = getMInNode(distance, touchedNode);
        while (mInNode!=null){
            Integer mindistance = distance.get(mInNode);
            for (Edge edge:mInNode.edges){
                GNode to = edge.to;
                if(!distance.containsKey(to)){
                    Integer old = distance.get(to);
                    int newValue = mindistance + edge.weight;
                    distance.put(to,newValue<old?newValue:old);
                }
                else {
                distance.put(to,mindistance+edge.weight);
            }

        }
            touchedNode.add(mInNode);
            mInNode=getMInNode(distance,touchedNode);
        }
      return distance;
    }
    public static GNode getMInNode( HashMap<GNode,Integer> distance,HashSet<GNode> touchedNode){
        GNode minNdoe = null;
        int min=Integer.MAX_VALUE;
        for (Map.Entry<GNode,Integer> node: distance.entrySet())
        {
            if(!touchedNode.contains(node)){
                GNode key = node.getKey();
                Integer value = node.getValue();
                if(min>value){
                    minNdoe=key;
                    min=value;
                }

            }
        }
        return minNdoe;
    }


}
