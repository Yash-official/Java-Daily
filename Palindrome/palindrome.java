class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int[] a=new int[10];
        int i=0;
        while(n!=0){
            a[i]=n%10;
            i++;
            n/=10;
        }
       int j=i-1;
        i=0;
        while(i<j){
        System.out.println("Comparing "+i+" and "+j);
        System.out.println("Comparing "+a[i]+" and "+a[j]);
        if(a[i]!=a[j]){
            return false;
        }
        i++;
        j--;
        }
     return true;
    }
}
