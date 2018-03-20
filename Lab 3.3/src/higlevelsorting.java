
//Aneudys Germosen period 2


public class higlevelsorting 
{
	public static String[] mergeSort(String[] list) 
	{
	    String[] left = new String[(int)(list.length/2)];
	    
	    String[] right = new String[(int)(list.length/2)];
	    
	    int center;
	 
	    if (list.length == 1) 
	    {    
	        return list;
	    } 
	    
	    else {
	        center = list.length/2;
	        for (int x=0; x<center; x++) 
	        {
	                left[x] = list[x];
	        }
	 
	        for (int i=center; i<list.length; i++) 
	        {
	                right[i - center] = list[i];
	        }
	 
	        left  = mergeSort(left);
	        right = mergeSort(right);
	 
	        merge(left, right, list);
	    }
	    return list;
	}
	public static void merge(String[] left, String[] right, String[] list) 
	{
	    int leftIndex = 0;
	    int rightIndex = 0;
	    int listIndex = 0;
	 
	    while (leftIndex < left.length && rightIndex < right.length) 
	    {
	        if ( (left[leftIndex].compareTo(right[rightIndex])) < 0) 
	        {
	            list[listIndex] = left[leftIndex];
	            leftIndex++;
	        } 
	        else 
	        {
	            list[listIndex] = right[rightIndex];
	            rightIndex++;
	        }
	        listIndex++;
	    }
	 
	    String[] rest;
	    int restIndex;
	    if (leftIndex >= left.length) 
	    {
	        rest = right;
	        restIndex = rightIndex;
	    } 
	    else 
	    {
	        rest = left;
	        restIndex = leftIndex;
	    }

	    for (int x=restIndex; x<rest.length; x++) 
	    {
	        list[listIndex] = rest[x];
	        listIndex++;
	    }
	}
	public void quickSort(int list1[], int front, int back)
    {
        if (front < back)
        {
            int partitionIndex = partition(list1, back, front);
 
            quickSort(list1, front, partitionIndex-1);
            quickSort(list1, partitionIndex+1, back);
        }
    }

	public static int partition(int list1[], int front, int back)
    {
        int pivot = list1[back]; 
        int i = (front-1);
        for (int j=front; j<back; j++)
        {
            if (list1[j] <= pivot)
            {
                i++;
 
                int temp = list1[i];
                list1[i] = list1[j];
                list1[j] = temp;
            }
        }
 
        int temp = list1[i+1];
        list1[i+1] = list1[back];
        list1[back] = temp;
 
        return i+1;
    }
}
