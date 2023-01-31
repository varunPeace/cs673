public class Fibonacci {
    public static void main(String[] args){
        int n= 100, ft = 1, st = 1;
        System.out.println("Fibonacci series till 100:");
        for (int i =1; i<=n; i++){
            System.out.print(ft + ",");
             int nt = ft+st;
             ft = st;
             st = nt;
        }
    }
}
