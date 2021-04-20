package sg.edu.rp.c346.id19034275.c347_lesson1_ps_sg_holiday;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lv;
    TextView tv;
    ArrayAdapter aa;
    ArrayList<Secular> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2row);

        lv = (ListView)this.findViewById(R.id.lvSecond);
        tv = (TextView) this.findViewById(R.id.textView2);

        Intent i = getIntent();
        //Get the String array named info we passed in
        int info = i.getIntExtra("",0);
//        tv.setText(info+"");

        al = new ArrayList<Secular>();
        if (info == 0) {
            tv.setText("Secular");
            al.add(new Secular(R.drawable.new_year, "New Year's Day", "1 Jan 2017"));
            al.add(new Secular(R.drawable.labour_day, "Labour Day", "1 May 2017"));
        } else if (info == 1) {
            tv.setText("Ethnics & Religion");
            al.add(new Secular(R.drawable.cny, "Chinese New Year", "28-29 Jan 2017"));
            al.add(new Secular(R.drawable.good_friday, "Good Friday", "14 April 2017"));
        }
        aa = new SecularAdapter(this, R.layout.activity2row, al);
        lv.setAdapter(aa); //null.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Secular selectedType = al.get(position);
                Toast.makeText(MainActivity2.this, selectedType.getName()
                                + " Date: " + selectedType.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
