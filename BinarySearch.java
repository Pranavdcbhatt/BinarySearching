import java.util.Scanner;
public class BinarySearch
{
    public static void main()
    {
        BinarySearch a = new BinarySearch(); //Creating an object of the class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search for: ");
        int element = sc.nextInt();
        int array[] = {1,2,3,4,5,6,7,8,9,10,1729,1728,9999,2018,2019,2020}; 
        int length = array.length; //Length of the array (Number of elements in the array or Array's size)
        int result = a.loop(array, element, length);
        if(result!=-1)
        {
            System.out.println("Your element is present at index number: "+result);
        }
        else
        {
            System.out.println("Your element is not present in the array.");
        }
    }
    
    public static int loop(int array[], int element, int length)
    {
        int lower = 0; //Beginning value (Lower Limit)
        int upper = length-1; //Ending value (Upper Limit)
        int mid;
        int index = -1; //Initial value of index
        while(index == -1 && (lower<=upper))
        {
            mid = (lower+upper)/2;
            if(array[mid]==element)
            {
                index = mid;
                return index;
            }
            
            else if(array[mid]<element)
            {
                lower=mid+1; //Beginning value (Lower limit) gets increased
            }
            else
            {
                upper = mid-1; //Ending value (Upper Limit) gets decreased
            }
        }
        return index;
    }
    
}
