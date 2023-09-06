class Solution
{
    
    public void dfs(boolean []vis,int i, ArrayList<ArrayList<Integer>>adj){
        vis[i]=true;
        for(int x:adj.get(i)){
            if(!vis[x]){
                dfs(vis,x,adj);
            }
        }
    }
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
       boolean vis[]=new boolean[V];
       int v=-1;
       for(int i=0;i<V;i++){
           if(!vis[i]){
               dfs(vis,i,adj);
               v=i;
           }
       }
       boolean check[]=new boolean[V];
       dfs(check,v,adj);
       for(int i=0;i<V;i++){
           if(!check[i]){
               return -1;
           }
       }
       return v;
    }
}
