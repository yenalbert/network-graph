import java.util.*;

public class Item {
	    public String name;
	    public Item(String inputName)
	    {
	        name = inputName;
	    }
	    @Override
	    public String toString()
	    {
	        return name;
	    }
	}

	class graph
	
	{
	        int max_num = 70;
	        boolean[][] edges = new boolean[max_num][max_num];
	        Item[] labels = new Item[max_num];
	        int many_vertices;
	        
	        //Returns true if every vertex in a graph is of even degree. Otherwise, returns false;
	        public boolean areAllEven ()
	        {
	        		boolean var = false;
	        		for (int i=0; i<many_vertices; ++i)
	        		{
		        		int counter = 0;
		        				        		
	        			for(int j=0; j<many_vertices; ++j) 
	        			{
	        				
	        				boolean x = edges[i][j];
	        				if (x == true)
	        				{
	        					counter = counter+1;
	        				}
	        			}
	        			
	        			//end of row;
        				System.out.println(counter);

	        			if (counter%2 == 0)
	        			{
	        				 var = true;
	        			}
	        			else 
	        			{
	        				var = false;
	        			}	        	
	        			
	        		}
	        		return var;
	        } 	        
	        
	        public void add_vertex(Item label)
	        {
	            int new_vertex_number;
	            int other_number;

	            new_vertex_number = many_vertices;
	            many_vertices++;
	            for (other_number = 0; other_number < many_vertices; ++other_number)
	            {
	                edges[other_number][new_vertex_number] = false;
	                edges[new_vertex_number][other_number] = false;
	            }
	            labels[new_vertex_number] = label;
	        }
	        public void add_edge(int source, int target)
	        {
	            
	            edges[source][target] = true;
	        }
	        public void remove_edge(int source, int target)
	        {
	            edges[source][target] = false;
	        }
	        public int size( ) 
	        { 
	            return many_vertices; 
	        }
	        boolean is_edge(int source, int target) 
	        {
	            return edges[source][target];
	        }
	        HashSet<Integer> neighbors(int vertex)
	        {
	            HashSet<Integer> answer = new HashSet<Integer>();
	            int i;

	            for (i = 0; i < size( ); ++i)
	            {
	                if (edges[vertex][i])
	                    answer.add(i);
	            }
	            return answer;
	        }
	        public Item get_label(int vertex)
	        {
	             return labels[vertex];
	        }
	   
	    
	}


