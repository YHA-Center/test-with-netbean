package jump_search;

public class jump_search{

    public static int jumpSearch(int[] arr, int x){
        int n = arr.length;
        //FInding block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));
        //Finding the block where element is prensent (if it is present)
        int prev = 0;
        for(int minStep = Math.Min(step,n)-1; arr[minStep] < x; minStep=Math.Min(step,n)-1){
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if(prev >= n){
                return -1;
            }
        }

        //Doing a linear search for x in block
        //beginning with prev;
        while(arr[prev] < x){
            prev++;
            //if we reached next block or end of array, element is not present.
            if(arr[prev] == x){
                return -1;
            }
        }
        //if element is found
        if(arr[prev] == x){
            return prev;
        }
        return -1;
    }

    public static void main(String args[]){
        
    }
}