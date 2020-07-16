package app;
class MergeS{
    public  MergeS(){
    }
    public void sort(int[] arr){
        int n = arr.length;
        int mid = n/2;

        if(n<=1){
            return;
        }
        int[] L = new int[n-mid];
        for (int i = 0 ; i<mid ; i++){
            L[i]=arr[i];
        }
        int[] R = new int[n-mid];
        for(int i = 0;i<(n-mid+1); i++){
            R[i]=arr[i+mid];
        }
        sort(L);
        sort(R);
        int[] c = merge(L, R);
        for(int i = 0; i<arr.length; i++){
            arr[i]=c[i];
        }
    }

    public int[] merge(int[] a, int[] b){
        int[] c = new int[a.length+b.length ];
        int i = 0 ;
        int k = 0;
        int n =0;
        while (i <a.length && k<b.length){
            if( a[i]<=b[k]){
                c[n]=a[i];
                i++;n++;
            }
            else{
                c[n]=b[k];
                k++;
                n++;
            }
        }
        while(i<a.length){
            c[n]=a[i];
            i++;n++;
        }
        while(k<b.length){
            c[n]=b[k];
            k++;n++;
        }
        return c;
        
    }
}