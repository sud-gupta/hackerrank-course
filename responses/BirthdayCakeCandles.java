static int birthdayCakeCandles(int[] ar) {
        int maxHeight = Arrays.stream(ar).max().getAsInt();
        return (int) Arrays.stream(ar).filter(val -> val == maxHeight).count();
    }
