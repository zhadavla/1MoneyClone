package com.example.money;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import java.text.SimpleDateFormat;
import java.util.ArrayList; // Import ArrayList
import java.util.Calendar;
import java.util.Locale;

import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Button> createdButtons = new ArrayList<>(); // ArrayList to store buttons

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);

        // Set the Toolbar as the ActionBar
        setSupportActionBar(toolbar);

        // Get the current month and set it as the Toolbar title
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
        String currentMonth = dateFormat.format(calendar.getTime());
        getSupportActionBar().setTitle(currentMonth);

        // Find the upperLayout LinearLayout from the XML
        LinearLayout upperLayout = findViewById(R.id.upperLayout);

        // Add 4 buttons dynamically to the upperLayout
        // Add 4 buttons dynamically to the upperLayout
        for (int i = 1; i <= 4; i++) {
            Button button = new Button(this);
            button.setText("Button " + i);
            button.setGravity(Gravity.CENTER); // Center the button both vertically and horizontally
//            button.setBackgroundResource(R.drawable.button_selector); // Set the selector drawable as the background
            LayoutParams params = new LayoutParams(
                    LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT
            );
            params.weight = 1; // Distribute available space equally among buttons
            button.setLayoutParams(params); // Set layout params for the button
            upperLayout.addView(button);
            createdButtons.add(button); // Add button reference to the ArrayList
        }


        // Rest of your code...
    }
}
