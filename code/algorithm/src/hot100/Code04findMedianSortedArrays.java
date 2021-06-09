package hot100;

public class Code04findMedianSortedArrays {
    public static void main(String args[]){

        int[] nums1= {1,2};
        int[] nums2= {3,4};


        int[] nums = merge(nums1,nums2);

        for(int num:nums){

            System.out.print(num + " ");
        }


        System.out.println("\r\n" + findMedianSortedArrays1(nums1,nums2));

    }


    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;

        int index1 = 0 ,index2 = 0;
        int leftValue = 0, rightValue = 0;

        for(int count = 0; count <= len / 2; count++){
            leftValue = rightValue;
            if( (index1 < nums1.length ) &&( (index2 >= nums2.length) || nums1[index1] < nums2[index2])){
                rightValue = nums1[index1++];
            }
            else {
                //index2 < len2  &&   nums2[index2] < nums1[index1]
                rightValue = nums2[index2++];
            }
        }

        if(len % 2 == 1){
            return rightValue;
        }
        else {
            return (leftValue + rightValue ) / 2.0;
        }

    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int[] nums = merge(nums1,nums2);

        if(nums.length  == 0){
             return 1;
        }
        if(nums.length  == 1){
            return nums[0];
        }

        int flag = nums.length % 2;
        int index = nums.length / 2;
        if(flag == 1){

            return nums[index];
        }

        else {
            return (nums[index] + nums[index -1 ]) / 2.0;
        }

    }

    public static  int[] merge(int[] nums1, int[] nums2){
        int[] nums = new int[nums1.length + nums2.length];


        int i = 0,j = 0;
        int index = 0;

        while ( (i < nums1.length) && (j  < nums2.length)){

            if(nums1[i] <= nums2[j]){
                nums[index++] = nums1[i++];
            }
            else {
                nums[index++] = nums2[j++];
            }
        }

        if(i >= nums1.length){
            while (j  < nums2.length){

                nums[index++] = nums2[j++];
            }
        }
        else {
            while ( i < nums1.length){
                    nums[index++] = nums1[i++];
            }
        }


        return nums;

    }

}
