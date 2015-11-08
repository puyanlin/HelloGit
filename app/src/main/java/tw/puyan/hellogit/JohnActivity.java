package tw.puyan.hellogit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JohnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_john);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //declare a local field to catch find out view(button) object
        Button btn = (Button) findViewById(R.id.btn);

        //then, set clicked listener to handle click event
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //handling body


                //get TextView
                TextView tv = (TextView) findViewById(R.id.tv);
                tv.setText("HelloTaiwan");
            }
        });
    }

}
