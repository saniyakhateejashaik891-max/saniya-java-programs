import java.util.*;
class Node {
    char label;
    boolean visited;
    public Node(char label) {
        this.label = label;
        this.visited = false;
    }
    @Override
    public String toString() {
        return String.valueOf(label);
    }
}
class Graph {
    public Map<Node, List<Node>> adjList; 
    public List<Node> nodes;
    public Graph() {
        adjList = new HashMap<>();
        nodes = new ArrayList<>();
    }
 public void addNode(Node node) {
        nodes.add(node);
        adjList.put(node, new ArrayList<>());
    }
    public void addEdge(Node source, Node destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // For undirected graph
    }
    public void resetVisited() {
        for (Node node : nodes) {
            node.visited = false;
        }
    }
    public void bfs(Node startNode) {
        resetVisited(); // Reset visited status before starting
        Queue<Node> queue = new LinkedList<>();
        startNode.visited = true;
        queue.add(startNode);
        System.out.print("BFS Traversal starting from " + startNode.label + ": ");
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.label + " ");
            for (Node neighbor : adjList.get(current)) {
                if (!neighbor.visited) {
                    neighbor.visited = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    public void dfsRecursive(Node startNode) {
        if (!startNode.visited) {
            startNode.visited = true;
            System.out.print(startNode.label + " ");
            for (Node neighbor : adjList.get(startNode)) {
                dfsRecursive(neighbor);
            }
        }
    }
    public void dfsIterative(Node startNode) {
        resetVisited(); // Reset visited status before starting
        Stack<Node> stack = new Stack<>();
        stack.push(startNode);
        startNode.visited = true;
        System.out.print("DFS Iterative Traversal starting from " + startNode.label + ": ");
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.label + " ");
            for (Node neighbor : adjList.get(current)) {
                if (!neighbor.visited) {
                    neighbor.visited = true;
                    stack.push(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        graph.addNode(e);
        graph.addNode(f);
        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(b, d);
        graph.addEdge(c, e);
        graph.addEdge(d, f);
        graph.addEdge(e, f);
        graph.bfs(a);
        graph.resetVisited(); 
        System.out.print("DFS Recursive Traversal starting from " + a.label + ": ");
        graph.dfsRecursive(a);
        System.out.println();
        graph.dfsIterative(a);
    }
}