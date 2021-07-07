package sg.rp.edu.c346.id20040896.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        

        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        String ms = prefs.getString("Greeting", "No Greetings");
        Toast.makeText(MainActivity.this, ms, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences prefs  =getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor prefEdit  = prefs.edit();
        prefEdit.putString("Greeting", "Hello!");
        prefEdit.commit();
    }
}