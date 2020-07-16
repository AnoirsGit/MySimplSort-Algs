package app;
class InsertionS implements Sorts{
    public InsertionS(){
    }
    public int[] sort(int[] arr1){
        int[] arr= arr1;
        int n =arr.length;
        for(int i=2;i<n;i++){
            int j =i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            
        }
        return arr;
    }


    public void sort1(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int k =arr[min];
            arr[min]=arr[i];
            arr[i]=k;
        }
    }
    
}