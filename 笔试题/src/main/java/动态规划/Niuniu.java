//package 动态规划;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//
//class GNode{
//    public int in;
//    public int out;
//    public int value;
//    public ArrayList<GNode> nexts;
//    public ArrayList<Edge> edges;
//    public GNode(int value){
//        this.value=value;
//        in=0;
//        out=0;
//        nexts=new ArrayList<GNode>();
//        edges=new ArrayList<Edge>();
//    }
//
//}
//class Edge
//{
//    public int weight;
//    public GNode from;
//    public GNode to;
//    public Edge(int weight,GNode f,GNode t){
//        this.weight=weight;
//        this.from=f;
//        this.to=t;
//    }
//}
//class Graph {
//    public HashMap<Integer, GNode> nodes;
//    public HashSet<Edge> edges;
//
//    public Graph() {
//        nodes = new HashMap<Integer, GNode>();
//        edges = new HashSet<Edge>();
//    }
//    public static void main(String[] args) {
//        int[][] arr={{1,1,2},{2,2,3}};
//        Graph graph = Graphgene.geneGraph(arr);
//        System.out.println();
//    }
//}
//class Graphgene {
//    /**
//     * @param matrix(权重，from，to)
//     * @return
//     */
//    public static Graph geneGraph(int[][] matrix) {
//        Graph graph = new Graph();
//        int edgenum=matrix.length;
//        for (int i=0;i<edgenum;i++){
//            int weight=matrix[i][0];
//            int from=matrix[i][1];
//            int to=matrix[i][2];
//            if(!graph.nodes.containsKey(from))
//            {
//                graph.nodes.put(from,new GNode(from));
//            }
//            if(!graph.nodes.containsKey(to))
//            {
//                graph.nodes.put(to,new GNode(to));
//            }
//            GNode fromNode = graph.nodes.get(from);
//            GNode toNode =graph.nodes.get(to) ;
//            fromNode.out++;
//            toNode.in++;
//            Edge edge = new Edge(weight, fromNode, toNode);
//            fromNode.edges.add(edge);
//            fromNode.nexts.add(toNode);
//            graph.edges.add(edge);
//        }
//        return graph;
//    }
//public class Niuniu {
//    public void method(GNode head01,GNode head02,Graph)
//    {
//
//    }
//}
//}
