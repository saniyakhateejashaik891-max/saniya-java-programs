import java.util.Arrays;
class Arrayoperation{
    public static void main(String[]args){
        int[] arr={5,8,3,9,12,4};
        System.out.println("Acessing elements:");
        System.out.println("element at index 0:"+arr[0]);
        System.out.println("element ai index 3:"+arr[3]);
        int elementtoInsert=7;
        int insertIndex=2;
        int [] newArr=new int[arr.length+1];
        for(int i=0;i<insertIndex;i++){
            newArr[i]=arr[i];
        }
        newArr[insertIndex]=elementtoInsert;
        for(int i=insertIndex;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }
        arr=newArr;
        System.out.println("\narray after insertion of :"+elementtoInsert+ " at index " + insertIndex + ": " + Arrays.toString(arr));
        int deleteIndex=3;
        int[] arrAfterDeletion=new int[arr.length-1];
        for(int i=0,k=0;i<arr.length;i++){
            if(i==deleteIndex){
                continue;
            }
            arrAfterDeletion[k++]=arr[i];
        }
        arr=arrAfterDeletion;
        System.out.println("Array after deletion at index " + deleteIndex + ": " + Arrays.toString(arr));
        int elementtosearch=9;
        boolean found=false;
        int foundIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elementtosearch){
                found=true;
                foundIndex=i;
                break;
            }
        }
        if(found){
            System.out.println("\nElement " + elementtosearch + " found at index: " + foundIndex);
        }
        else {
            System.out.println("\nElement " + elementtosearch + " not found.");
        }
        System.out.println("\nArray before sorting: " + Arrays.toString(arr));
        Arrays.sort(arr); // Sorts the array in ascending order
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}