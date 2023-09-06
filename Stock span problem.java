class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n){
        Stack<Integer> s1 = new Stack<>();
        s1.push(0);
        int arr[]=new int[n];
        arr[0] = 1;
 
        for (int i = 1; i < n; i++) {
            while (!s1.empty()
                   && price[s1.peek()] <= price[i])
                s1.pop();
            arr[i] = (s1.empty()) ? (i + 1)
                                  : (i - s1.peek());
 
            s1.push(i);
        }
        return arr;
    }
    
}
