package sg.edu.rp.c346.id19034275.c347_lesson1_ps_sg_holiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainListAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<String> list;
    private TextView tvName;

    public MainListAdapter(Context context, int resource, ArrayList<String> objects){
        super(context,resource,objects);
        list = objects;
        this.context = context;
    }
    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
// "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvName = (TextView) rowView.findViewById(R.id.tvSelect);
        String s = list.get(position);
        tvName.setText(s);


        return rowView;
    }
}
