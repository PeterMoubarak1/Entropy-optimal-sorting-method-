public class Entropy{

    public static void Sort(char []a,int lo,int hi)
    {
    if(hi<=lo)
    {
        return;
    }
    
    int it=lo;
    int gt=hi;
    int i=lo;
    char v=a[lo];
    int z=0;
    while(i<=gt)
    {
    
    z=compare(a[i],v);
    if(z<0)
    {
        char temp=a[i];
        a[i]=a[it];
        a[it]=temp;
        i++;
        it++;
    }
    
    else if(z>0)
    {
        char temp=a[i];
        a[i]=a[gt];
        a[gt]=temp;
        gt--;
    }
    
    else 
         i++;
    
    }
    
    Sort(a,lo,it-1);
    Sort(a,gt+1,hi);
    
    
    }
    
    public static int compare(char A, char B)
    {
        if(A>B)
        {return 1;}
        if(A<B)
        {return -1;}
        else 
        return 0;
    }
    
    public static void main(String[] args) 
    {
    char []a={'B','A','B','A','B','A','B','A','C','A','D','A','B','R','A'};  
    System.out.println("Steps: ");
    Sort(a,0,a.length-1);
    System.out.println("Result: ");
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
    
    }
    
   
    }