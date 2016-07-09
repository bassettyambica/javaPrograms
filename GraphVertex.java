package mstkruskalsalgo;

public class GraphVertex {

	private int xCoOrdinate;
	private int yCoOrdinate;
	private int vertexId;
	
	public GraphVertex(int xCoOrdinate, int yCoOrdinate, int vertexId) 
	{
		super();
		this.xCoOrdinate = xCoOrdinate;
		this.yCoOrdinate = yCoOrdinate;
		this.vertexId = vertexId;
	}
	public int getxCoOrdinate() 
	{
		return xCoOrdinate;
	}

	public int getyCoOrdinate() 
	{
		return yCoOrdinate;
	}
	public int getVertexId() 
	{
		return vertexId;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof GraphVertex)
			if(((GraphVertex)obj).getVertexId()==this.getVertexId())
				return true;
		return false;
	}

	@Override
	public String toString() 
	{
		return vertexId+"";
	}
}



