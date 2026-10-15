//Frequency of Number Count in an array.
public class NumberFrequency{
    public static void main(String[] args){
        int[] arr = {1,2,2,3,1,4,2};
        int n = arr.length;

        //An array to keep track of elements we already counted.
        boolean[] visited = new boolean[n];

        System.out.println("Element Frequencies: ");

        //Outer loop for pick an element one by one
        for(int i=0;i<n;i++){
            //if element already processed in previous iteration, skip that
            if(visited[i]==true){
                continue;
            }

            int count = 1; //For initially count of element

            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println("Element: " + arr[i] + " -> Frequency: " + count);
        }

    }
}