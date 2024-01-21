package www.affaxerd.customlistview;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import www.affaxerd.customlistview.R;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final Integer[] imgss;


    public MyListAdapter( @NonNull Activity context1, @NonNull String[] mainTitle, String[] description, Integer[] imgss ) {
        super(context1, R.layout.item_custom_layout, mainTitle );

        this.context = context1;
        this.mainTitle = mainTitle;
        this.description = description;
        this.imgss = imgss;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater= context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.item_custom_layout, null,true);

        TextView titleText= rowView.findViewById(R.id.title);
        TextView subTitle=rowView.findViewById(R.id.subtitle);
        ImageView imageView=rowView.findViewById(R.id.icon);

        titleText.setText(mainTitle[position]);
        subTitle.setText(description[position]);
        imageView.setImageResource(imgss[position]);

        return rowView;

    }
}
