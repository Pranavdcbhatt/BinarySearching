# BinarySearching
This is a program for searching an element in an array using the Binary Search method.
This method is more effecient than the Linear Search method as anyone would tell you.
In Binary Searching method, the particular array in which the element is going to be searched, must be in a sorted manner (either in an ascending manner or in a decending manner).
After the user has entered the element he/ she wishes to search for in the array, the compiler after carrying out comparisions in the while loop of the program, may get 3 results:
1.) The middle element is equal to the element entered by the user.
In this case no further comparisions in the while loop will be done and the index value of the element will be returned to main() for it's display.
2.) The middle element is lesser in value than the element entered by the user - (Assuming that the array has been sorted in ascending order)
In this case, the lower limit will be changed to the element to the right of the middle element(which will be bigger in value than the middle element), and all the elements to the left(including the middle value) will not be considered in the array for comparisions anymore.
Hence, the array gets trimmed, consisiting of elements to the upper limit from the changing lower limit.
3.) The middle element is greater in value than the element entered by the user (Again assuming that the sorting of the array has been done in ascending order)
Then, the element to the left of the middle element gets assigned the upper limit(which will be lesser in value than the middle element), and the elements to the right of the new upper limit will be disregarded for the further processes of comparisions.
Therefore, the array in this case gets trimmed also with elements consisting of only till the changing upper limit.
In cases 2 and 3, the process will keep repeating itself and the array will keep getting trimmed until the lement at middle is = to the element entered by the user, otherwise it will return index value as -1 which would mean that the element was not present in the array.
While in this method only a few elements are taken into consideration for comparisions (as the array keeps getting shorter and shorter or trimmed), this method is much more effecient than Linear Searching where each element starting for the index position 0 of the array is checked until index position n(where n may be any big value and hence it would take a lot oftime to compare each one of them).
You may also think of another program where an array is declared according to the size wished by the user, and all the elements in it are entered by the user. Then, we may use a method (Bubble Sort or Selection sort) to sort those elements and then ask the user to enter any element which he had entered in the initial array and use Binary Search method to search for the new index position of that element in the new sorted array and present to the user it's index position and the new sorted array both.
And so, Sorting and Searching can be used in one programm upon one array too.
I hope you had fun viewing my program!!
