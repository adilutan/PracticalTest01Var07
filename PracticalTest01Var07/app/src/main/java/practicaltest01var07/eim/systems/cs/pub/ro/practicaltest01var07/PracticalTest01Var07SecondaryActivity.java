package practicaltest01var07.eim.systems.cs.pub.ro.practicaltest01var07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PracticalTest01Var07SecondaryActivity extends AppCompatActivity {

    public final static String MESSAGE_KEY = "practicaltest02var07.eim.systems.cs.pub.ro";
    public final static String MESSAGE_KEY2 = "practicaltest02var07.eim.systems.cs.pub.ro2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_secondary);

        Intent intent = getIntent();
        //String message1 = intent.getStringExtra(MESSAGE_KEY);
        //String message2 = intent.getStringExtra(MESSAGE_KEY2);
        Bundle extras = intent.getExtras();

        TextView text1= (TextView)findViewById(R.id.textView);
        TextView text2= (TextView)findViewById(R.id.textView2);

        text1.setText(extras.getString("primul"));
        text2.setText(extras.getString("urmatorul"));

    }

    public void onOk(View view){
        Intent intent = new Intent (this,PracticalTest01Var07MainActivity.class);
        intent.putExtra(MESSAGE_KEY, "ok");
        startActivity(intent);
    }

    public void onCancel(View view){
        Intent intent = new Intent (this,PracticalTest01Var07MainActivity.class);
        intent.putExtra(MESSAGE_KEY, "cancel");
        startActivity(intent);
    }
}
