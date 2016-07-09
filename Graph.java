package mstkruskalsalgo;

public class Graph {
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Graph {
		private List<GraphVertex>			vertexes;
		private ArrayList<GraphEdge> 		edges;
		
		public Graph(List<GraphVertex> vertexes) 
		{
			this.edges = new ArrayList<GraphEdge>();
			this.vertexes = vertexes;

			// construct all the possible edges
			for(int i =0;i<vertexes.size();i++){
				GraphVertex fromVertex = vertexes.get(i);

				for(int j=i+1;j<vertexes.size();j++)
				{
					GraphVertex toVertex = vertexes.get(j);
					GraphEdge edge = new GraphEdge(fromVertex, toVertex);
					this.edges.add(edge);
				}
			}
		}
		
		public SpanningTree constructSpanningTree(){
			
			// sort the edges in ascending order
			Collections.sort(this.edges);
			
			int numberOfVertexesInGraph = this.vertexes.size();
			
			SpanningTree spanningTree = new SpanningTree();
			
			for(GraphEdge edge: this.edges)
			{
				spanningTree.addEdge(edge);
				if(numberOfVertexesInGraph == spanningTree.getNumberOfEdgesInTree()-1)
					break;
			}
			return spanningTree;
		}

		public void setTraffic(int fromVertexId, int toVertexId, int traffic) 
		{
			GraphEdge edge = getEdge(fromVertexId, toVertexId);
			edge.setTraffic(traffic);
		}
		
		public GraphEdge getEdge(int fromVertexId, int toVertexId)
		{
			for(GraphEdge edge :this.edges)
			{
				int edgeFromVertexId = edge.getFrom().getVertexId();
				int edgeToVertexId = edge.getTo().getVertexId();
				
				if((fromVertexId == edgeFromVertexId && toVertexId == edgeToVertexId) ||
						(fromVertexId == edgeToVertexId && toVertexId == edgeFromVertexId))
				{
					return edge;
				}
			}
			return null;
		}
		
		public void updateMstUtilization(SpanningTree spanningTree) 
		{	
			for(int i =0;i<this.vertexes.size();i++)
			{
				GraphVertex fromVertex = this.vertexes.get(i);
				
				for(int j=i+1;j<this.vertexes.size();j++)
				{
					GraphVertex toVertex = this.vertexes.get(j);
					
					Path path = spanningTree.getPath(fromVertex, toVertex);
		
					if(path.getSize() > 1)
					{
						GraphEdge originalEdge = getEdge(fromVertex.getVertexId(), toVertex.getVertexId());
						
						for(GraphEdge edgeInPath : path.getEdges())
						{						  							edgeInPath.incrementMstTraffic(originalEdge.getTraffic());
						}
					}
				}
			}
		}

		public double printAllPathsAndGetAverageHopCounts(SpanningTree spanningTree) 
		{
			int totalHopCount = 0;
			int totalTraffic = 0;
			double avgHopCount = 0;

			System.out.println("Num of hops for each pair of vertex (both directions) plus the data rate");
			for(int i =0;i<this.vertexes.size();i++)
			{
				GraphVertex fromVertex = this.vertexes.get(i);	
				for(int j=i+1;j<this.vertexes.size();j++)
				{
					if(i==j)
						continue;
					GraphVertex toVertex = this.vertexes.get(j);
					
					Path path = spanningTree.getPath(fromVertex, toVertex);
					GraphEdge originalEdge = getEdge(fromVertex.getVertexId(), toVertex.getVertexId());
						
					System.out.println(fromVertex.getVertexId() + " " + toVertex.getVertexId() +
	                        "  " + originalEdge.getTraffic() + " kbps  " +
	                        path.getSize() + " hops");
					
					totalHopCount += path.getSize() * originalEdge.getTraffic();
					totalTraffic += originalEdge.getTraffic();
				}
			}
			avgHopCount = (totalHopCount / totalTraffic);
			System.out.println("Average Hops = " + avgHopCount);
			return avgHopCount;
		}
	}


}
