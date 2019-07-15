class ContainerWithMostWater {
    public int maxArea(int[] height) {
        
        int i = 0, j = height.length - 1;
        int result = 0;
        while(i <= j){
            
            int h = Math.min(height[i], height[j]);
            result = Math.max(result, h * (j-i));
            
            if(height[i] < height[j])
                i++;
            else
                j--;
            
        }
        
        return result;
    }
}