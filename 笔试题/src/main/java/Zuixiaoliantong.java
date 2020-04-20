import java.util.*;

class GNode{
    public int in;
    public int out;
    public int value;
    public ArrayList<GNode> nexts;
    public ArrayList<Edge> edges;
    public GNode(int value){
        this.value=value;
        in=0;
        out=0;
        nexts=new ArrayList<GNode>();
        edges=new ArrayList<Edge>();
    }

}
class Edge
{
    public int weight;
    public GNode from;
    public GNode to;
    public Edge(int weight,GNode f,GNode t){
        this.weight=weight;
        this.from=f;
        this.to=t;
    }
}
class Graph {
    public HashMap<Integer, GNode> nodes;
    public HashSet<Edge> edges;

    public Graph() {
        nodes = new HashMap<Integer, GNode>();
        edges = new HashSet<Edge>();
    }
}

class Graphgene {
    /**
     * @param matrix(权重，from，to)
     * @return
     */
    public static Graph geneGraph(int[][] matrix) {
        Graph graph = new Graph();
        int edgenum=matrix.length;
        for (int i=0;i<edgenum;i++){
            int weight=matrix[i][0];
            int from=matrix[i][1];
            int to=matrix[i][2];
            if(!graph.nodes.containsKey(from))
            {
                graph.nodes.put(from,new GNode(from));
            }
            if(!graph.nodes.containsKey(to))
            {
                graph.nodes.put(to,new GNode(to));
            }
            GNode fromNode = graph.nodes.get(from);
            GNode toNode =graph.nodes.get(to) ;
            fromNode.out++;
            toNode.in++;
            Edge edge = new Edge(weight, fromNode, toNode);
            fromNode.edges.add(edge);
            fromNode.nexts.add(toNode);
            graph.edges.add(edge);
        }
        return graph;
    }

}


public class Zuixiaoliantong {
    public static void method(Graph p,int[][] s){
        for (int i=0;i<s.length;i++)
        {

        }
        PriorityQueue<Edge> gNodes = new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight-o2.weight;
            }
        });
        for (Edge i:p.edges){
            gNodes.add(i);
        }
        HashSet<GNode> gNodes1 = new HashSet<>();
        int value=0;
        while (!gNodes.isEmpty()){
            Edge poll = gNodes.poll();
            if(gNodes1.contains(poll.from)&&gNodes1.contains(poll.from))
            {
                continue;
            }
            value=value+poll.weight;
            gNodes1.add(poll.from);
            gNodes1.add(poll.from);
        }
        System.out.println(value);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int[][] ints = new int[l][4];
        int[][] ints02 = new int[l][3];
        for (int i=0;i<l;i++){
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            ints[i][0] = Integer.parseInt(s1[0]);
            ints[i][1] = Integer.parseInt(s1[1]);
            ints[i][2] = Integer.parseInt(s1[2]);
            ints[i][3] = Integer.parseInt(s1[3]);
            ints02[i][0] = Integer.parseInt(s1[0]);
            ints02[i][1] = Integer.parseInt(s1[1]);
            ints02[i][2] = Integer.parseInt(s1[2]);
        }
        Graph graph = Graphgene.geneGraph(ints02);
        Zuixiaoliantong.method(graph,ints);
    }
    }
