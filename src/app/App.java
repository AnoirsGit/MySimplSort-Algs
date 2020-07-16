package app;

public class App {
    public static void main(String[] args) throws Exception {
        RandomItems ran = new RandomItems();
        // InsertionS ins = new InsertionS();
        // SelectionS sel =new SelectionS();
        int[] A=ran.RetItems();
        MergeS ms = new MergeS();
        // int[] a = ins.sort(A);

        ms.sort(A);
        for(int i= 0 ; i<A.length;i++){
            System.out.print(A[i]+" ");
        }

    }
}