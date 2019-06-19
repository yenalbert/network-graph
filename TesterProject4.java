import java.util.*;

/**
 * @author albertyen
 */
public class TesterProject4 {

	public static void main(String[] args) {
		
	Item friend0 = new Item("Alex");
	Item friend1 = new Item("Bob");
	Item friend2 = new Item("Sam");
		
	graph socialNetworkFriends = new graph();
        
	socialNetworkFriends.add_vertex(friend0);
	socialNetworkFriends.add_vertex(friend1); 
	socialNetworkFriends.add_vertex(friend2); 
	socialNetworkFriends.add_edge(0,1);
	socialNetworkFriends.add_edge(0,2);
	socialNetworkFriends.add_edge(1,2);
	socialNetworkFriends.add_edge(1,0);
	socialNetworkFriends.add_edge(2,0);
	socialNetworkFriends.add_edge(2,1);
        System.out.println("The vertices in graph #1 have an even number of edges: " + socialNetworkFriends.areAllEven());
        System.out.println();
        
        HashSet<Integer> followers =socialNetworkFriends.neighbors(1);
        System.out.println("Bob's followers:");
        for(Integer vertex: followers)
        {
            System.out.println(socialNetworkFriends.get_label(vertex));
        }        
        System.out.println();
        
        HashSet<Integer> followers0 =socialNetworkFriends.neighbors(0);
        System.out.println("Alex's followers:");
        for(Integer vertex: followers0)
        {
            System.out.println(socialNetworkFriends.get_label(vertex));
        }        
        System.out.println();
        
        HashSet<Integer> followers2 =socialNetworkFriends.neighbors(2);
        System.out.println("Sam's followers:");
        for(Integer vertex: followers2)
        {
            System.out.println(socialNetworkFriends.get_label(vertex));
        }        
        System.out.println();
        
/**
 * graph #1 above, socialNetworkFriends, have an odd number of edges;
 * graph #2 below, new_socialNetworkFriends, have an even number of edges;
 * 
 * The method, areAllEven(), will return false for graph #1 and return true for graph #2
 */
        
        Item newFriend0 = new Item("June");
	Item newFriend1 = new Item("Dan");
	Item newFriend2 = new Item("Evan");
	Item newFriend3 = new Item("Frank");

	graph new_socialNetworkFriends = new graph();
        
	new_socialNetworkFriends.add_vertex(newFriend0);
	new_socialNetworkFriends.add_vertex(newFriend1); 
	new_socialNetworkFriends.add_vertex(newFriend2); 
	new_socialNetworkFriends.add_vertex(newFriend3);
	new_socialNetworkFriends.add_edge(0,2);
	new_socialNetworkFriends.add_edge(0,3);
	new_socialNetworkFriends.add_edge(1,2);
	new_socialNetworkFriends.add_edge(1,0);
	new_socialNetworkFriends.add_edge(2,3);
	new_socialNetworkFriends.add_edge(2,0);
	new_socialNetworkFriends.add_edge(3,1);
        System.out.println("The vertices in graph #2 have an even number of edges: " + new_socialNetworkFriends.areAllEven());
        System.out.println();

        HashSet<Integer> newFollowers0 = new_socialNetworkFriends.neighbors(0);
        System.out.println("June's followers:");
        for(Integer vertex: newFollowers0)
        {
            System.out.println(new_socialNetworkFriends.get_label(vertex));
        }        
        System.out.println();
        
        HashSet<Integer> newFollowers1 = new_socialNetworkFriends.neighbors(1);
        System.out.println("Dan's followers:");
        for(Integer vertex: newFollowers1)
        {
            System.out.println(new_socialNetworkFriends.get_label(vertex));
        }        
        System.out.println();
        
        HashSet<Integer> newFollowers2 = new_socialNetworkFriends.neighbors(2);
        System.out.println("Evan's followers:");
        for(Integer vertex: newFollowers2)
        {
            System.out.println(new_socialNetworkFriends.get_label(vertex));
        }        
        System.out.println();
        
        HashSet<Integer> newFollowers3 = new_socialNetworkFriends.neighbors(3);
        System.out.println("Frank's followers:");
        for(Integer vertex: newFollowers3)
        {
            System.out.println(new_socialNetworkFriends.get_label(vertex));
        }        
        System.out.println();
	}
	
}
