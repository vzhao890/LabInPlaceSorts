public class InPlaceSorts
{

    public static void insertionSort(int[] list1)
    {
        int k;
        for (int i = 1; i < list1.length; i++)
        {
            int currentElement = list1[i];
            for (k = i - 1; k >= 0 && list1[k] > currentElement; k--) {
                list1[k + 1] = list1[k];
            }
            list1[k + 1] = currentElement;
        }

    }
    public static void selectionSort(double[] list3)
    {
        double fillA;
        for(int i=0;i<list3.length-1;i++)
        {
            if(list3[i]>list3[i+1])
            {
                fillA=list3[i];
                list3[i]=list3[i+1];
                list3[i+1]=fillA;

            }

        }
    }
    public static void bubbleSort(String[] list1)
    {

    }

}
