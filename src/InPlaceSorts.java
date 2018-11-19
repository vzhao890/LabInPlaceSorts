public class InPlaceSorts
{

    public static void insertionSort(int[] list1)
    {
        int N = list1.length;
        int i;
        int j;
        int temp; 
        for (i = 1; i< N; i++)
        {
            j = i; temp = list1[i];
            while (j > 0 && temp < list1[j-1])
            {
                list1[j] = list1[j-1];
                j = j-1;
            }
            list1[j] = temp;
        }

    }
    public static void selectionSort(double[] list3)
    {
        double fillA;
        for(int i=0;i<list3.length-1;i++)
        {
            for(int k=i+1;k<list3.length;k++)
            {
                if(list3[i]>=list3[k])
                {
                    fillA=list3[i];
                    list3[i]=list3[k];
                    list3[k]=fillA;
                }
            }

        }
    }
    public static void bubbleSort(String[] list1)
    {

    }

}
