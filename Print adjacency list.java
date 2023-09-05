    public List<List<Integer>> printGraph(int V, int edges[][]) {
       List<List<Integer>> l1=new ArrayList<>();
       for(int i=0;i<V;i++){
            l1.add(new ArrayList<>());
       }
       
       for(int i=0;i<edges.length;i++){
           l1.get(edges[i][0]).add(edges[i][1]);
           l1.get(edges[i][1]).add(edges[i][0]);
       }
       return l1;
    }
}
