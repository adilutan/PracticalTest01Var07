package practicaltest01var07.eim.systems.cs.pub.ro.practicaltest01var07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PracticalTest01Var07MainActivity extends AppCompatActivity {

    //CheckBox check1 = (CheckBox) findViewById(R.id.checkBox);
    //CheckBox check2 = (CheckBox) findViewById(R.id.checkBox2);
    EditText text1 = (EditText) findViewById(R.id.editText);
    EditText text2 = (EditText) findViewById(R.id.editText2);

    public void check1Listen(View view)
    {
        switch(view.getId()) {
            case R.id.checkBox:
                EditText text1 = (EditText) findViewById(R.id.editText);
                text1.setCursorVisible(true);
                text1.setFocusable(true);
                text1.setFocusableInTouchMode(true);
                text1.setEnabled(true);
                break;

            case R.id.checkBox2:
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_main);
    }

   @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("text1", text1.getText().toString());
        savedInstanceState.putString("text2", text2.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState.containsKey("text1")) {
            text1.setText(savedInstanceState.getString("text1"));
        } else {
            text1.setText(String.valueOf(0));
        }
        if (savedInstanceState.containsKey("text2")) {
            text2.setText(savedInstanceState.getString("text2"));
        } else {
            text2.setText(String.valueOf(0));
        }
    }
}
