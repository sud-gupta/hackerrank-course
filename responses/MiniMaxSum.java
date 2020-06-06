static void miniMaxSum(int[] arr) {
        long sum = Arrays.stream(arr).mapToLong(x -> x).sum();
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println(String.format("%d %d", sum - max, sum - min));

    }
