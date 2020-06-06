static int finalValue(int grade) {
        int five = (grade / 5 + 1) * 5;
        int third = five - grade;
        return (third < 3) ? five : grade;
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> arr=new ArrayList<Integer>();
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
           arr.add(grade < 38 ? grade : finalValue(grade));
        }
        return arr;
    }
