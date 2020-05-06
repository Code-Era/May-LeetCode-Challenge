class MajorityElementCal {
    public int majorityElement(int[] nums) {
        
        var count = 0;
        var result = 0;

        for (var num : nums) {
            if (count == 0) {
                result = num;
            }
            count += (num == result) ? 1 : -1;
        }

        return result;
    }
        
}
