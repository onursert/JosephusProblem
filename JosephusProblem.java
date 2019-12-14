import java.util.LinkedList;
import java.util.Scanner;

public class JosephusProblem {
    public static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Total People: ");
        int people = s.nextInt();
        System.out.print("Skip X times: ");
        int skip = s.nextInt();

        for (int i = 1; i <= people; i++) {
            list.add(i);
        }
        System.out.println(list);

        if (people != 1) {
            int left = list.get(skip % list.size());
            list.remove((skip - 1) % list.size());
            int leftIndex = list.indexOf(left);
            System.out.println(list);

            while (list.size() != 1) {
                left = list.get(((leftIndex + skip - 1) % list.size() + 1) % list.size());
                list.remove((leftIndex + skip - 1) % list.size());
                leftIndex = list.indexOf(left);
                System.out.println(list);
            }
        }
    }
}