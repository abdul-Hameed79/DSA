package Arrays.TrappingRainWater_Problem;

public class TrappedRainWater {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped rain water: " + trapRainWater(height));
    }

    public static int trapRainWater(int[] height) {
       int n = height.length;
       int left = 0, right = n - 1;
       int leftmax = 0, rightmax = 0;
       int water = 0;

        while(left <= right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftmax) {
                    leftmax = height[left];
                } else {
                    water += leftmax - height[left];
                }
                left++;
            } else {
                if(height[right] >= rightmax) {
                    rightmax = height[right];
                } else {
                    water += rightmax - height[right];
                }
                right--;
            }
        }
        return water;
    }      
}