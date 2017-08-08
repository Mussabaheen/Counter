package mussabaheen.example.com.counter;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Counter extends AppCompatActivity {
        Button butto1;
        String res;
        int num=0;
        int a;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        txt=(TextView)findViewById(R.id.t1);
        if(savedInstanceState!=null)
        {
            String s1=savedInstanceState.getString("count");
            if(txt!=null)
            {
               num=Integer.parseInt(s1);
                txt.setText(s1);
            }
        }
    }



    public void incre(View view) {

        num++;
        txt.setText(Integer.toString(num));

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        a=num;
        res=Integer.toString(num);
        outState.putString("count", res);

    }


}

