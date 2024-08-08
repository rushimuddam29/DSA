public class Kadanes {
    public static int kadanes(int[] a)
    
   {
       int maxsum=Integer.MIN_VALUE;
       int currentsum=0;
       for(int i=0;i<a.length;i++)
       {
        currentsum+=a[i];
        if (currentsum<=0)
        {
            currentsum=0;
        }
        maxsum=Math.max(currentsum,maxsum);
       }
       return maxsum;
   }
   public static void main(String[] args) {
    int[] a={-2,-3,4,-1,-2,1,5,-3};
    int maxsum=kadanes(a);
    System.out.println(maxsum);
   }
    
}
