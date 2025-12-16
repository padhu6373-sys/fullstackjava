public class SortOneTwo {
    public static void main(String[] args) {
    int a[]={0, 2, 1, 2, 0,1};
    int c0=0,c1=0,c=2;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==0)
        {
            c0++;
        }else if(a[i]==1)    
        {
            c1++;
        }
        else{
            c2++;
        }
    }
}