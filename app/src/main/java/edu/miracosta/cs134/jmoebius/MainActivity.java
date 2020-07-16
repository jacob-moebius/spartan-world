package edu.miracosta.cs134.jmoebius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Instance variables/fields are named views in our layout
    private ImageView logoImageView;
    private Button swapImageButton;
    private boolean isMCCLogo = true;

    // Equivalent of main()
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Displays first page of app. Write all code beneath these 2 lines
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Wire up controller to view
        logoImageView = findViewById(R.id.logoImageView);
        System.out.println(logoImageView);
        swapImageButton = findViewById(R.id.swapImageButton);

    }

    // Method for swapping the image displayed. Used for Swap Image button click
    public void swapImage(View V) {
        if (isMCCLogo) {
            logoImageView.setImageResource(R.drawable.spartan_logo);
            Toast.makeText(this, R.string.toast_text, Toast.LENGTH_LONG).show();
        } else {
            logoImageView.setImageResource(R.drawable.miracosta_logo);
        }
        isMCCLogo = !isMCCLogo;
    }
}
