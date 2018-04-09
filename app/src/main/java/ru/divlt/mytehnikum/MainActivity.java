package ru.divlt.mytehnikum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;


public class MainActivity extends AppCompatActivity {

    private SlidingUpPanelLayout slidingUpPanelLayout;

    private ImageButton imageButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);


        ImageButton imageButton = (ImageButton) findViewById (R.id.imageButton);

        slidingUpPanelLayout = (SlidingUpPanelLayout)findViewById (R.id.sliding_layout);

        imageButton.setOnClickListener (new OnClickListener());


    }

    private class OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (slidingUpPanelLayout != null) {
                if (slidingUpPanelLayout.getPanelState() != SlidingUpPanelLayout.PanelState.HIDDEN) {
                    slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.HIDDEN);
                } else {
                    slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.EXPANDED);
                }
            }
        }
    }
}
