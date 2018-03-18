package viewer;

/**
 * Created by sunlei on 2018/3/13.
 */
public class Viewer {

   public static int function(int i){
        int j=i+1;
       while(true){
           if(isZhiShu(j)){
               break;
           }
           else{
               j++;
           }
       }
       return j;
    }

    public static boolean isZhiShu(int j) {
       for(int i=2;i<Math.sqrt(j);i++){
           if(j%i==0){
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args){
        System.out.println(function(11));
    }

}
