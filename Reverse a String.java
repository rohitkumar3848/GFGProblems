class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int l=0;
        int r=str.length()-1;
        char []ch=str.toCharArray();
        while(l<=r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}
