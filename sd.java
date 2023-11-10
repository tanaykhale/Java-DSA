public class sd {
    public static void main(String[] args) {
        int arr[] = { 1, 34, 6, 2, 65, 3 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int l=0,r=arr.length-1;
        int mid =l+(r-l)/2 ;
        int key=2;
        while(l<=r){
            if(arr[mid]==key)
                System.out.println(mid);
            if(arr[])
        }

    }
}
