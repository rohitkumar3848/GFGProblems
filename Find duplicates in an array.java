class Solution {
    public static ArrayList<Integer> duplicates(int nums[], int n) {
        int arr[]=new int[n];
        ArrayList<Integer> a1=new ArrayList<>();
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>1){
                a1.add(i);
            }
        }
        if(a1.size()==0){
               a1.add(-1);
            return a1;
        }
        return a1;
    }
}
