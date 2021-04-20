package sg.edu.rp.c346.id19034275.c347_lesson1_ps_sg_holiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecularAdapter extends ArrayAdapter<Secular> {
    private Context context;
    private ArrayList<Secular> seculars;
    private TextView tvName,tvDate;
    private ImageView ivImage;

    public SecularAdapter(Context context, int resource, ArrayList<Secular> objects){
        super(context,resource,objects);
        seculars = objects;
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
        View rowView = inflater.inflate(R.layout.activity2, parent, false);
        Secular s = seculars.get(position);
        tvName = (TextView) rowView.findViewById(R.id.tvName);
        tvName.setText(s.getName());

        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        tvDate.setText(s.getDate());

        ivImage = (ImageView) rowView.findViewById(R.id.ivProg);
        ivImage.setImageResource(s.getImage());

        return rowView;
    }
}
