static void plusMinus(int[] arr) {
        double positiveNumber = 0;
        double negativeNumber = 0;
        double zeroNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > 0) {
                positiveNumber++;
            } else if (arr[i] < 0) {
                negativeNumber++;
            } else {
                zeroNumber++;
            }
        }
        System.out.printf("%.6f\n", (Double) positiveNumber / arr.length);
        System.out.printf("%.6f\n", (Double) negativeNumber / arr.length);
        System.out.printf("%.6f\n", (Double) zeroNumber / arr.length);
    }
