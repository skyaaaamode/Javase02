package structure.图;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 实现拓扑排序
 */
public class TpPuSort {
    public static ArrayList<GNode> tpsort(Graph graph){
        if(graph==null){

        }
        ArrayList<GNode> gNodes = new ArrayList<>();
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        Queue<GNode> s=new LinkedList<GNode>();
        for (GNode x:graph.nodes.values()){
            integerIntegerHashMap.put(x.value,x.in);
            if(x.in==0){
                s.add(x);
            }
        }
        while (!s.isEmpty()){
            GNode poll = s.poll();
            gNodes.add(poll);
            for (GNode next:poll.nexts){
                integerIntegerHashMap.put(next.value,next.in-1);
                if(next.in-1==0){
                    gNodes.add(next);
                }
            }


        }

        return gNodes;
    }
}
