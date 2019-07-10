/**
 * @author xufei
 * @date 2019/7/4 9:22
 */
public class zsTest {
    public static void main(String[] args) {

        int [] arr = {10,5,20,4,7};
       for (int i = 0;i <arr.length; i++){
           for (int j = 0;j<arr.length -i -1;j++){
               if (arr[j] >arr[j+1]){
                   int tmp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = tmp;
               }
           }


       }

        for (int i : arr) {
            System.out.println(i);
        }




   /*   int n,m;

      A:for (n = 100; n <= 200;n++) {
         for(m = 2;m <= n/2; m++){
             if(n%m ==0){
                 continue  A;
             }
         }
          System.out.println(n);
      }*/
    }
}
