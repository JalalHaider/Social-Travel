package layout.testapp2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by hp on 4/4/2016.
 */
public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    private TextView lift_expiry;
    TextView month;
    TextView day;
    private int val=0;

    DatePickerFragment(){

    }

    public DatePickerFragment (TextView month,TextView day,int val){
        this.month=month;
        this.day=day;
        this.val=val;
    }

    public DatePickerFragment (TextView liftExpiry,int val){
        this.lift_expiry = liftExpiry;
        this.val=val;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user
        String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        if(val==1) {
            this.month.setText(months[month]);
            this.day.setText(String.valueOf(day));
        }
        if(val==2){
            this.lift_expiry.setText(day+", "+months[month]+" "+year);
        }
    }
}
