    package com.example.s10q1;

    import android.os.Bundle;
    import android.widget.CompoundButton;
    import android.widget.Switch;
    import android.widget.TextView;

    import androidx.activity.EdgeToEdge;
    import androidx.annotation.NonNull;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;

    public class MainActivity extends AppCompatActivity {

        Switch switch1;
        TextView switchStatus;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);
            switch1=(Switch)findViewById(R.id.switch1);
            switchStatus=(TextView)findViewById(R.id.switchStatus);


            switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
                    if(isChecked) {
                        switchStatus.setText("Switch 1 is on");
                    }
                    else {
                        switchStatus.setText("Switch 1 is off");
                    }
                }
            });

        }
    }