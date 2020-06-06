static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                scoreA++;
            } else if (a.get(i) < b.get(i)) {
                scoreB++;
            }
        }
        List<Integer> c=new ArrayList<Integer>();
        c.add(scoreA);
        c.add(scoreB);
        return c;
    }
