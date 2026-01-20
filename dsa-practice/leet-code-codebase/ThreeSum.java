public class ThreeSum{
public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1])
        continue;
        int st=i+1;
        int end=nums.length-1;
        while(st<end){
            int sum=nums[i]+nums[st]+nums[end];
            if(sum==0){
                List<Integer> list=new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[st]);
                list.add(nums[end]);
                ans.add(list);
                st++;end--;
                while(st<end && nums[st]==nums[st-1])
                st++;
            }else if(sum>0){
                end--;
            }else{
                st++;
            }
        }
       }
       return ans;       
    }	
}