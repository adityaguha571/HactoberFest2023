class MyBinarySearch{
 public static void binarySearch(int arr[], int first, int last, int key){
   int mid = (first + last)/2;
   while(first <= last){
      if (arr[mid] < key){
        first = mid + 1;   
      }else if (arr[mid] == key){
        System.out.println("element found, at index: " + mid);
        break;
      }else{
         last = mid - 1;
      }
      mid = (first + last)/2;
   }
   if (first > last){
      System.out.println("element not found!");
   }
 }
 public static void main(String args[]){
		int arr[] = {11,23,39,40,57};
		int key = 40;
        int last=arr.length-1;
		binarySearch(arr,0,last,key);	
 }
}
