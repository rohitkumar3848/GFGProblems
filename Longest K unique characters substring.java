class Solution {
    public int longestkSubstr(String s1, int k) {
       HashMap<Character,Integer> h1=new HashMap<>();
       int max=-1;
       int i=0;
       for(int j=0;j<s1.length();j++){
           h1.put(s1.charAt(j),h1.getOrDefault(s1.charAt(j),0)+1);
           while(h1.size()>k){
               h1.put(s1.charAt(i),h1.getOrDefault(s1.charAt(i),0)-1);
               if(h1.get(s1.charAt(i))==0){
                   h1.remove(s1.charAt(i));
               }
               i++;
           }
           if(h1.size()==k){
               max=Math.max(max,j-i+1);
           }
       }
       return max;
    }
}
