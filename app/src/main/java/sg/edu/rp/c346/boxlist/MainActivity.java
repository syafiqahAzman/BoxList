package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    ListView lvColor;
    ArrayList<color_list> alColor;
    CustomAdapter caColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColor = findViewById(R.id.listView);

        alColor = new ArrayList<>();
        color_list pic1 = new color_list("blue");
        color_list pic2 = new color_list("orange");
        color_list pic3 = new color_list("brown");
        alColor.add(pic1);
        alColor.add(pic2);
        alColor.add(pic3);

        caColor = new CustomAdapter(this, R.layout.colour_box, alColor);

        lvColor.setAdapter(caColor);

    }
}
