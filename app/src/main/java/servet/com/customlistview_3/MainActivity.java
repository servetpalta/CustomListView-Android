package servet.com.customlistview_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] foods={"water","tea","coffee","coke","meat","chicken","cake","salad"};
        String [] price= {"0.5 $","1 $","2 $","2 $","15 $","10 $ ","5 $","7 $"};
        Integer [] images={R.drawable.water,R.drawable.tea,R.drawable.coffee,R.drawable.coke,R.drawable.meat,R.drawable.chicken,R.drawable.cake,R.drawable.salad};

        ListAdapter listAdapter=new CustomAdapter(this,foods,price,images);
        ListView listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(listAdapter);



        listView.setOnItemClickListener(
            new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String choice= String.valueOf(adapterView.getItemAtPosition(position));

                    Toast.makeText(MainActivity.this,"choice is : "+choice,Toast.LENGTH_SHORT).show();



            }
        });

    }
}
