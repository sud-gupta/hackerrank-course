static String timeConversion(String s) {
        DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        Date result = new Date();
        try {
        result =  df.parse(s);
        } catch (Exception e) { }
        DateFormat dr =  new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        return (String) dr.format(result);
    }
