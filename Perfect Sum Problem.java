class Solution{
    public final int mod=1000000007;
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    int tsum=0;
	    for(int ele:arr){
	        tsum+=ele;
	    }
	    if(tsum<sum){
	        return 0;
	    }
	    int dp[][]=new int [n+1][sum+1];
	    for (int[] x : dp){
            Arrays.fill(x, -1);
	    }
	    int ans=count(arr,n,sum,0,dp);
	    return ans;
	} 
	public int count(int []arr,int n,int sum,int i,int [][]dp){
	    if(i >= n){
            if(sum == 0) return 1;
            return 0;
        }
	    if(sum < 0 ) return 0;
	    if(dp[i][sum]!=-1){
	        return dp[i][sum];
	    }
	    int select=count(arr,n,sum-arr[i],i+1,dp)%mod;
	    int not_select=count(arr,n,sum,i+1,dp)%mod;
	    return dp[i][sum]=(select+not_select)%mod;
	}
}
