package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16046491 on 25/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<color_list> colorList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<color_list> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        colorList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivColor = rowView.findViewById(R.id.imageView);



        color_list currentItem = colorList.get(position);
        if(currentItem.getColor().equalsIgnoreCase("blue")){
            ivColor.setImageResource(R.drawable.blue_box);
        }
        else if(currentItem.getColor().equalsIgnoreCase("orange")){
            ivColor.setImageResource(R.drawable.orange_box);
        }
        else{
            ivColor.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }

}
