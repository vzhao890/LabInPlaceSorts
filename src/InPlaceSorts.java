public class InPlaceSorts
{

    public static void insertionSort(int[] list1)
    {
        int[] sorted= new int[list1.length];
        int a= list1.length-1;
        int b=1;
        int hold;
        list1[a]=list1[0];

        while(a>0)
        {
            if(list1[b]>=sorted[a])
            {
                hold=sorted[a];
                sorted[a]=list1[b];
                a=a-1;
                b += 1;
                sorted[a]=hold;

            }

        }
        for(int i=0;i<list1.length-1;i++)
        {
            list1[i]=sorted[i];
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
