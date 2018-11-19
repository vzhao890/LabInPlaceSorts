//Vincent Zhao
public class Runner
{
    public static void main(String[] args) {
        int[] list1 = {1, 2,3, 54, 4, 5, 5, 1};
        String[] list2 = {"a","b","a","f"};
        double[] list3 = {0.3,0.1,0.0,0.2,0.4,0.1};
        InPlaceSorts.selectionSort(list3);
        InPlaceSorts.insertionSort(list1);
        for(int i=0;i<list3.length;i++)
        {
            System.out.print(" "+list3[i]);
        }
        System.out.println();
        for(int i=0;i<list1.length;i++)
        {
            System.out.print(" "+list1[i]);
        }
        System.out.println();
        for(int i=0;i<list2.length;i++)
        {
            System.out.print(" "+list2[i]);
        }
    }

}
