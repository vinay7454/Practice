import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;


//BAeldung graphs
public class Graph {
	
	private Map<Vertex, List<Vertex>> adjVertices;
	
	class Vertex {
		String label;
		
		public Vertex(String label) {
			this.label = label;
		}
	}

	public void addVertex(String label) {
		adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
	}
	
	public void removeVertex(String label) {
		Vertex v = new Vertex(label);
		adjVertices.values().stream().forEach(e -> e.remove(v));
		adjVertices.remove(new Vertex(label));
	}
	
	public void addEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label1);
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
		
	}
	
	public void removeEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		List<Vertex> eV1 = adjVertices.get(v1);
	    List<Vertex> eV2 = adjVertices.get(v2);
	    if (eV1 != null)
	        eV1.remove(v2);
	    if (eV2 != null)
	        eV2.remove(v1);
	}
	
	List<Vertex> getAdjVertices(String label) {
	    return adjVertices.get(new Vertex(label));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
	    graph.addVertex("Bob");
	    graph.addVertex("Alice");
	    graph.addVertex("Mark");
	    graph.addVertex("Rob");
	    graph.addVertex("Maria");
	    graph.addEdge("Bob", "Alice");
	    graph.addEdge("Bob", "Rob");
	    graph.addEdge("Alice", "Mark");
	    graph.addEdge("Rob", "Mark");
	    graph.addEdge("Alice", "Maria");
	    graph.addEdge("Rob", "Maria");
		
	    graph.depthFirstTraversal(graph, "Rob");
	    
	}
	
	public Set<String> depthFirstTraversal(Graph graph, String root){
		Set<String> visited = new LinkedHashSet<String>();
		Stack<String> stack = new Stack<String>();
		stack.push(root);
		while(!stack.isEmpty()) {
			String vertex = stack.pop();
			if(!visited.contains(vertex)) {
				visited.add(vertex);
				for(Vertex v : getAdjVertices(vertex)) {
					stack.push(v.label);
				}
			}
		}
		return visited;
	}

	
	public Set<String> breadthFirstTraversal(Graph graph, String root) {
	    Set<String> visited = new LinkedHashSet<String>();
	    Queue<String> queue = new LinkedList<String>();
	    queue.add(root);
	    visited.add(root);
	    while (!queue.isEmpty()) {
	        String vertex = queue.poll();
	        for (Vertex v : graph.getAdjVertices(vertex)) {
	            if (!visited.contains(v.label)) {
	                visited.add(v.label);
	                queue.add(v.label);
	            }
	        }
	    }
	    return visited;
	}
}
