class ProductOfNumbers {
    ArrayList<Long> nums;

    public ProductOfNumbers() {
        nums = new ArrayList<>();
    }

    public void add(int num) {

        if (num == 0)
            nums.clear();

        else {
            if (nums.isEmpty()) {
                nums.add((long)num);
            } else {
                nums.add((long)num * nums.get(nums.size() - 1));
            }
        }

    }

    public int getProduct(int k) {
        int n = nums.size();
        if (n < k) {
            return 0;
        }
        else if (n == k)
            return nums.get(n - 1).intValue();
        return (int)(nums.get(n - 1) / nums.get(n - k-1));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */