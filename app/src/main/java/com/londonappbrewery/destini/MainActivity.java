package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:


    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonButtom;
    private int mQuestion = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonButtom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //pass in the mQuestion variables to update the content??

                topButtonClick(mQuestion);


            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        mButtonButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                botoomButtonClick(mQuestion);
            }
        });

    }


    private void topButtonClick(int mQuestion){

        if (mQuestion == 1){
            mStoryTextView.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonButtom.setText(R.string.T3_Ans2);
            mQuestion = 3;
        }

        else if (mQuestion == 2){

            mStoryTextView.setText(R.string.T6_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonButtom.setVisibility(View.GONE);
        }

        else if (mQuestion == 3){

            mStoryTextView.setText(R.string.T6_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonButtom.setVisibility(View.GONE);

        }

    }

    private void botoomButtonClick(int mQuestion){

        if (mQuestion == 1){
            mStoryTextView.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonButtom.setText(R.string.T2_Ans2);
            mQuestion = 2;
        }

        else if (mQuestion == 2){

            mStoryTextView.setText(R.string.T4_End);
            mButtonTop.setVisibility(View.GONE); //Hide Button
            mButtonButtom.setVisibility(View.GONE); //Hide Button

        }

        else if (mQuestion == 3){

            mStoryTextView.setText(R.string.T5_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonButtom.setVisibility(View.GONE);

        }


    }


}
