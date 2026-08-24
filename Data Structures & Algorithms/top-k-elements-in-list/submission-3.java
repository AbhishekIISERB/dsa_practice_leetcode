class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        int[][] cnt = new int[n][2];
        boolean[] visited = new boolean[n];

        int size = 0;

        for (int i = 0; i < n; i++) {

            if (visited[i]) {
                continue;
            }

            int c = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                    visited[j] = true;
                }
            }

            cnt[size][0] = nums[i];
            cnt[size][1] = c;
            size++;
        }

        // Sort by frequency descending
        Arrays.sort(cnt, 0, size, (a, b) -> b[1] - a[1]);

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = cnt[i][0];
        }

        return result;
    }
}