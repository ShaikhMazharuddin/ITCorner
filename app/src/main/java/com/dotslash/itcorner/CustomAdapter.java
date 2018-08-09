package com.dotslash.itcorner;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shaikh on 09,Sep,17.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] names;
    int[] imageIds;
    private static LayoutInflater inflator = null;

    public CustomAdapter(Context context, String[] names , int[] imageIds) {
        this.context = context;
        this.names = names;
        this.imageIds = imageIds;
        inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup viewGroup) {
        View customGridView;
        customGridView = inflator.inflate(R.layout.custom_grid, null);
        ImageView ivCourse = (ImageView) customGridView.findViewById(R.id.ivCourse);
        TextView txtCourse = (TextView) customGridView.findViewById(R.id.txtCourse);
        txtCourse.setText(names[position]);
        ivCourse.setImageResource(imageIds[position]);
        //Listener
        customGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // view.getContext().startActivity(new Intent(context , ));
                switch (position) {
                    case 0:
                        view.getContext().startActivity(new Intent(context, ShortTermCourseActivity.class));
                        break;
                    case 1:
                        view.getContext().startActivity(new Intent(context, ShortTermDiplomaActivity.class));
                        break;
                    case 2:
                        view.getContext().startActivity(new Intent(context ,AdvancedDiplomaActivity.class));
                        break;
                    case 3:
                        view.getContext().startActivity(new Intent(context ,DigitalMarketingActivity.class));
                        break;


                   /* case 6:
                        view.getContext().startActivity(new Intent(context ,ShortTermCourseActivity.class));
                        break;*/

                }
            }
        });
        return customGridView;
    }
}
