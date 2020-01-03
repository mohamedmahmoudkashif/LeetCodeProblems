public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                // Shift array by one and add zero
                shiftArr(arr, i+1);
                if(i != arr.length-1){
                    arr[i+1] = 0;
                    i++;
                }
            }

        }
    }

    public void shiftArr(int[] arr, int index){
        for(int i= arr.length-1;i >= index;i--){
            arr[i] = arr[i-1];
        }
    }
}
