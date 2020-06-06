static int computeSum(List<List<Integer>> ar, int r, int c, int offsetR,
            int offsetC, int step) {
        int sum = 0;
        for (int i = 0; i < step; i++) {
            sum += ar.get(r + offsetR * i).get(c + offsetC * i);
        }
        return sum;
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        return (Math.abs(computeSum(arr, 0, 0, 1, 1, arr.size())
                - computeSum(arr, 0, arr.size() - 1, 1, -1, arr.size())));
    }
