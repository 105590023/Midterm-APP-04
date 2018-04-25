package tw.edu.ntut.csie.app04_105590023;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView std1, std2, std3, std4, std5,
                     std6, std7, std8, std9, std10;
    private TextView result;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        std1 = (TextView) findViewById(R.id.std1);
        std2 = (TextView) findViewById(R.id.std2);
        std3 = (TextView) findViewById(R.id.std3);
        std4 = (TextView) findViewById(R.id.std4);
        std5 = (TextView) findViewById(R.id.std5);
        std6 = (TextView) findViewById(R.id.std6);
        std7 = (TextView) findViewById(R.id.std7);
        std8 = (TextView) findViewById(R.id.std8);
        std9 = (TextView) findViewById(R.id.std9);
        std10 = (TextView) findViewById(R.id.std10);
        btn = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.result);

        std1.setOnClickListener(stdOnClick);
        std2.setOnClickListener(stdOnClick);
        std3.setOnClickListener(stdOnClick);
        std4.setOnClickListener(stdOnClick);
        std5.setOnClickListener(stdOnClick);
        std6.setOnClickListener(stdOnClick);
        std7.setOnClickListener(stdOnClick);
        std8.setOnClickListener(stdOnClick);
        std9.setOnClickListener(stdOnClick);
        std10.setOnClickListener(stdOnClick);

    }

    private View.OnClickListener stdOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
    };
}
