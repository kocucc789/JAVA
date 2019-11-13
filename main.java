import java.util.*;
public class main {
	public static void main(String[] args) {
	
/*		int[][] weight = { 
				{ 0, 1, 1, 0, 1 },
				{ 1, 0, 1, 0, 0 },
				{ 1, 1, 1, 1, 0 },
				{ 0, 0, 1, 0, 1 },
				{ 1, 0, 0, 1, 0 },
		};
*/

				int N = 5;
				List<Edge>[] adjList = new List[N];
				adjList[0] = new LinkedList<>(); 
					Edge e2 = new Edge(1); adjList[0].add(e2);
					Edge e1 = new Edge(2); adjList[0].add(e1);
					Edge e7 = new Edge(4); adjList[0].add(e7);
					
				adjList[1] = new LinkedList<>(); 
					Edge e4 = new Edge(0); adjList[1].add(e4);
					Edge e3 = new Edge(2); adjList[1].add(e3);
					
				adjList[2] = new LinkedList<>(); 
					Edge e6 = new Edge(0); adjList[2].add(e6);
					Edge e5 = new Edge(1); adjList[2].add(e5);
					Edge e10 = new Edge(3); adjList[2].add(e10);
					
				adjList[3] = new LinkedList<>(); 
					Edge e8 = new Edge(2); adjList[3].add(e8);
					Edge e9 = new Edge(4); adjList[3].add(e9);
					
					
				adjList[4] = new LinkedList<>(); 
				Edge e11 = new Edge(0); adjList[4].add(e11);
				Edge e12 = new Edge(3); adjList[4].add(e12);	

			
		/*		System.out.println("입력 그래프의 Adjcency Lists:");
				for(int i=0; i<N;i++){
					System.out.print(i+":  ");
					for (Edge j : adjList[i]) {
						System.out.print(j.adjvertex+", ");
					}
					System.out.println();
				}
			*/
				System.out.printf("DFS 방문 순서:\n");
				DFS d = new DFS(adjList);

				System.out.println();
				
		/*		System.out.println("[정점: dfs 방문순서]");
				for (int i=0; i<adjList.length; i++)
					System.out.print("["+i+": "+d.getDfn()[i]+"] ");*/
			}
		}





