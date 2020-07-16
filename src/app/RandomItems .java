package app;
import java.util.Random;
class RandomItems{
    Random ran =new Random();
    int[] i = new int[301];
    public RandomItems(){
        for (int j =0;  j<i.length;j++) {
            i[j]=ran.nextInt(10000);
            
        }
    }
    public int[] RetItems(){
        return i;
    }
}
