import java.util.ArrayList;
import java.util.List;

public class BFSTraversal {

    /* What are the requirement to create graph
       1. number vertex
       2. edge between vertex
            a. Directed (a -> b)
            b. UnDirected (a <-> b)
    * */


    public static class GraphClass{
        private final int vertex;
        private final int [][] graph_matrix_representation;
        private final List<List<Integer>> graph_list_representation;

        GraphClass(int vertex){
            this.vertex = vertex;
            graph_matrix_representation = new int[this.vertex][this.vertex];
            graph_list_representation = new ArrayList<>(this.vertex);

            for(int i = 0 ; i < this.vertex ; i++){
                graph_list_representation.add(new ArrayList<>());
            }
        }

        void add_edge(int a , int b){
            add_edge_into_matrix(a , b);
            add_edge_into_list(a , b);
        }

        void print_representation(){

            for(int i = 0 ; i < this.vertex ; i++){
                for(int j = 0 ; j < this.vertex ; j++){
                    System.out.print(graph_matrix_representation[i][j] + ",");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println(graph_list_representation);
        }


        private void add_edge_into_matrix(int a , int b){
            graph_matrix_representation[a][b] = 1;
            graph_matrix_representation[b][a] = 1;
        }

        private void add_edge_into_list(int a , int b){
            graph_list_representation.get(a).add(b);
            graph_list_representation.get(b).add(a);
        }

    }


    public static void main(String[] args) {
        GraphClass graph = new GraphClass(8);
        graph.add_edge(0 , 1);
        graph.add_edge(0 , 3);
        graph.add_edge(0 , 7);
        graph.add_edge(7 , 3);
        graph.add_edge(3 , 4);
        graph.add_edge(2 , 4);
        graph.add_edge(1 , 2);
        graph.add_edge(4 , 5);
        graph.add_edge(5 , 6);

        graph.print_representation();
    }
}
