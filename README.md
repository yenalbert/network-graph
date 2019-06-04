# network-graph

Network Graph project: A communications network consists of a set of switching centers (vertices) and a set of communications lines (edges) that connect these centers. When designing a network, a communications company needs to know whether the resulting network will continue to support communications between all centers should any one of these communications lines be rendered inoperative due to weather or equipment failure. That is, they need to know the answer to the following question.

Given a graph in which there is a path from every vertex to every other vertex, will removing any edge from the graph always produce a graph in which there is still a path from every vertex to every other vertex?

Simple graph theory: If all the vertices in a connected graph are of even degree, then removing any one edge from the graph will always produce a connected graph.

The graph class will have a method called 'areAllEven()' that takes no parameters, and will test whether or not an instance of the graph class has vertices with an even degree.

There will be two graphs, graph #1 (not all vertices have an even degree) and graph #2 (all vertices have an even degree). The method, areAllEven(), will test both graph #1 and graph #2.
