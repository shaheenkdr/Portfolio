package nanodegree.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printX(View v)
    {
        switch (v.getId())
        {
            case (R.id.spotify):
                    Toast.makeText(getApplicationContext(), "This button will launch my Spotify app", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.scores):
                Toast.makeText(getApplicationContext(), "This button will launch my Scores app", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.library):
                Toast.makeText(getApplicationContext(), "This button will launch my library app", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.build):
                Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.xyz):
                Toast.makeText(getApplicationContext(), "This button will launch my XYZ reader app", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.capstone):
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone app", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
