import java.util.HashMap;

public class TwoSum {
    public static int[] findTwosum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return  new int[0];
    }

    public static void main(String[] args){
        int[] nums = {2,7,5,15};
        int target = 17;
        int[] result = findTwosum(nums, target);
        System.out.println(result[0]+ " , " + result[1]);
    }
}
