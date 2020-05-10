package sample.android.example.aclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    SubClass number = new SubClass();

    Button negative;
    Button positive;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        negative = (Button)findViewById(R.id.nagative);
        positive = (Button)findViewById(R.id.positive);
        textView = (TextView)findViewById(R.id.textView);

        // -ボタンを押したときの処理
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // SubClassのnumberDOWNの処理
                number.numberDOWN();
                //文字列に変換してTextViewに表示
                textView.setText(String.valueOf(number.getNumber()));
            }
        });

        // +ボタンを押したときの処理
        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //SubClassのnumberUPの処理
                number.numberUP();
                //文字列に変換してTextViewに表示
                textView.setText(String.valueOf(number.getNumber()));
            }
        });
    }
}
