package AaLeetCode;

import java.util.ArrayList;
import java.util.List;

class Solution3 {
    public static int maxSubArray(int[] nums) {
        List<Integer> sumList1 = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        int singleSum = 0;

        for (int a = 0; a <= nums.length - 1; a++) {
            singleSum += nums[a];
            finalList.add(nums[a]);
            sumList1.add(singleSum);
            if (a >= 2) {
                for (int b = a - 2; b >= 0; b--) {
                    finalList.add(singleSum - sumList1.get(b));
                }
            }
        }
        sumList1.stream().forEach(finalList::add);
        System.out.println(finalList.toString());
        return finalList.stream().mapToInt(v -> v).max().orElseThrow();
    }

    public static void main(String[] args) {
        int[]nums =new int[]{-52,-19,93,-22,39,-6,-47,2,45,2,-92,-97,-10,91,-14,-81,-7,60,48,8,-57,-25,92,-25,77,97,-85,25,-45,-2,-71,2,78,98,56,-5,-30,-91,73,-85,10,80,93,76,48,-44,72,-58,-83,20,49,-64,94,18,11,48,16,2,-26,47,99,-21,-50,55,-23,-94,-73,46,-85};

        System.out.println(maxSubArray(nums));
    }
}