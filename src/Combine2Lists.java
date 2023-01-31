import java.util.ArrayList;

public class Combine2Lists {
    public static void main(String[] args){
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");

        ArrayList<String> l2= new ArrayList<String>();
        l2.add("1");
        l2.add("2");
        l2.add("3");

       ArrayList<String> cl = new ArrayList<String>();

        for (int k = 0; k < 10 ; k++){
            if(k%2!=0)
                cl.add(l1.get(k));
            else
                cl.add(l2.get(k));
        }

        System.out.println("Combined List:"+cl);

    }
}

