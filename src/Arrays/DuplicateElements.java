package Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[]=new int[]{1,1,5,3,9,1,8,3,8,5,4};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
                    break;

            }
        }
    }
}
