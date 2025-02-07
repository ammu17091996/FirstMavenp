class BubbleSort
{
    static void bubbleSorting(int a[])
    {
        int len = a.length; 
        for (int i = 0; i < len-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < len - i - 1; j++) 
            { 
                if (a[j] > a[j + 1]) 
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }

            if(swapped == false)
                break;

        }
    }
    static void printArray(int a[])
    {
        int len = a.length;
        for (int i = 0; i < len; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        bubbleSorting(arr);

        System.out.println("Sorted array");

        printArray(arr); 
    }
}