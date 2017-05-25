package servet.com.customlistview_3;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Servet on 14.05.2017.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    Context context;
    String[] foodsArray;
    String [] detailArray;
    Integer [] imagesArray;

    public CustomAdapter(Context context,  String[] foods,String [] detail ,Integer [] images ) {
        super(context,R.layout.custom_row,R.id.textview ,foods );

        this.context=context;
        this.foodsArray=foods;
        this.detailArray=detail;
        this.imagesArray=images;


    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View customView=layoutInflater.inflate(R.layout.custom_row,parent,false);


        TextView textView=(TextView)customView.findViewById(R.id.textview);
        TextView detail=(TextView)customView.findViewById(R.id.detail);
        ImageView imageview=(ImageView)customView.findViewById(R.id.imageView);

        textView.setText(foodsArray[position]);
        detail.setText(detailArray[position]);
        imageview.setImageResource(imagesArray[position]);

        return customView;

    }

}
