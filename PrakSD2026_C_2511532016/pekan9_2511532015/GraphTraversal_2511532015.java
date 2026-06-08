package pekan9_2511532015;
 import java.util.*;
 public class GraphTraversal_2511532015{
	 private Map<String, List<String>> graph_2015 = new HashMap<>();
	 
	 //menambahkan edge (graf tak berarah)
	 public void addEdge_2015 (String nodel, String node2) {
		 graph_2015.putIfAbsent (nodel, new ArrayList<>());
		 graph_2015.putIfAbsent (node2, new ArrayList<>());
		 graph_2015.get(nodel).add(node2);
		 graph_2015.get(node2).add(nodel);
	 }
	 //menampilkan graf awal
	 public void printGraph() {
		 System.out.println("Graf awal (Adjacency List): ");
		 for (String node : graph_2015.keySet()) {
			 System.out.print(node + "->");
			 List<String> neighbors = graph_2015.get(node);
			 System.out.println(String.join (", ", neighbors));
		 }
		 System.out.println();
	 }
	 //DFS rekursif
	 public void dfs_2015 (String start) {
		 Set<String> visited = new HashSet<>();
		 System.out.println("Penelusuran DFS: ");
		 dfsHelper(start, visited);
		 System.out.println();
	 }
	 private void dfsHelper (String current, Set<String> Visited) {
		 if (Visited.contains (current)) return;
		 Visited.add(current);
		 System.out.print(current + " ");
		 for (String neighbor: graph_2015.getOrDefault(current,  new ArrayList<>())) {
			 dfsHelper(neighbor, Visited);
		 }
	 }
	 //BFS iteratif
	 public void bfs_2015 (String start) {
		 Set<String> visited = new HashSet<>();
		 Queue<String> queue = new LinkedList<>();
		 queue.add(start);
		 visited.add(start);
		 System.out.println("Penelusuran BFS: ");
		 while (!queue.isEmpty()) {
			 String current = queue.poll();
			 System.out.print(current+ " ");
			 for (String neighbor : graph_2015.getOrDefault (current, new ArrayList<>())) {
				 if (!visited.contains(neighbor)) {
					 queue.add(neighbor);
					 visited.add(neighbor);
				 }
			 }
		 }
		 System.out.println();
	 }
	 //main
	 public static void main(String[] args) {
		 GraphTraversal_2511532015 graph_2015 = new GraphTraversal_2511532015();
		 
		 //contoh graf : A-B, A-C, B-D, B-E
		 graph_2015.addEdge_2015("A", "B");
		 graph_2015.addEdge_2015("A", "C");
		 graph_2015.addEdge_2015("B", "D");
		 graph_2015.addEdge_2015("B", "E");
		 //cetak graf awal
		 System.out.println("Graf Awal adalah: ");
		 graph_2015.printGraph();
		 //lakukan penelusuran
		 graph_2015.dfs_2015("A");
		 graph_2015.bfs_2015("A");

	 }
 }
