public class Runner
{
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 3, 3, 3, 3, 54, 4, 5, 5, 1};
        String[] list2 = {"a","b","a"};
        double[] list3 = {0.3,0.1,0.0,0.2};
        InPlaceSorts.selectionSort(list3);
        for(int i=0;i<list3.length;i++)
        {
            System.out.print(" "+list3[i]);
        }
        System.out.println();
        for(int i=0;i<list1.length;i++)
        {
            System.out.print(" "+list1[i]);
        }
    }

}
