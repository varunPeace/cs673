import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Combine2Lists {

    public static void main(String[] args)
    {
        List<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");

        List<String> l2 = new ArrayList<String>();
        l2.add("1");
        l2.add("2");
        l2.add("3");

        System.out.print("List1 contents: ");

        Iterator iterator = l1.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();

        System.out.print("List2 contents: ");

        iterator = l2.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();

        int i = 0;
        int j = 0;

        List<String> merged_list = new ArrayList<String>();

        while (i < l1.size() && j < l2.size()) {
            merged_list.add(l1.get(i));
            merged_list.add(l2.get(j));
            i++;
            j++;
        }

        while (i < l1.size()) {
            merged_list.add(l1.get(i));
            i++;
        }

        while (j < l2.size()) {
            merged_list.add(l2.get(j));
            j++;
        }

        System.out.print("Merged List contents: ");

        iterator = merged_list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
