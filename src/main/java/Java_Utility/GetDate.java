package Java_Utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDate {
    public String getSystemDateDDMMYY() {
        Date dateObject = new Date();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        String alignedDate = sim.format(dateObject);
        return alignedDate;
    }

    public String getRequiredDateYYYYDDMM(int days) {
        Date dateObject = new Date();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calender = sim.getCalendar();
        calender.add(Calendar.DAY_OF_MONTH, +30);
        String requiredDate = sim.format(calender.getTime());
        return requiredDate;

    }
}
