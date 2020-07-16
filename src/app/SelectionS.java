package app;
class SelectionS implements Sorts{
    public SelectionS(){

    }
    public int[] sort(int[] arr1){
        int[] arr= arr1;
        for(int i = 0 ; i<arr.length -1 ; i++){
            int min =i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int k = arr[min];
            arr[min]=arr[i];
            arr[i]=k;
        }
        return arr;
    }
    public void sort1(int[] arr){
        int n = arr.length;
        for(int i =2 ; i<n ;  i++){
            int k = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1
            ]=k;

        }
    }

}