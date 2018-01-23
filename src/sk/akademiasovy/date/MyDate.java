package sk.akademiasovy.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public void today(){
        Date date = new Date();
        System.out.println(date);
    }

    public void ddmmyy(){
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy, hh:mm:ss");
        System.out.println(sdf.format(today));
    }
}
