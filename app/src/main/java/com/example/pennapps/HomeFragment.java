package com.example.pennapps;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeFragment extends Fragment {
    private int barStat = 0;
    private Handler handler = new Handler();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        final ProgressBar bar = (ProgressBar) view.findViewById(R.id.progressbar);
        TextView text = (TextView) view.findViewById(R.id.money);
        text.setTextSize(25);
        text.setTextColor(Color.WHITE);

        TextView amount = (TextView) view.findViewById(R.id.amount);
        amount.setTextSize(25);
        amount.setTextColor(Color.WHITE);

        final ImageView pichu = (ImageView) view.findViewById(R.id.pichu);
     //   final ImageView pikachuSad = view.findViewById(R.id.pikachuSad);
        final ImageView pikachuHappy = view.findViewById(R.id.pikachuHappy);
        final ImageView levelUp = view.findViewById(R.id.levelup);

        pichu.setVisibility(View.VISIBLE);
        levelUp.setVisibility(View.INVISIBLE);
     //   pikachuSad.setVisibility(View.INVISIBLE);
        pikachuHappy.setVisibility(View.INVISIBLE);

        Button button = (Button) view.findViewById(R.id.button);
  //      final TextView percent = (TextView) view.findViewById(R.id.percent);
        
     /*     button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar.setProgress(amountXP(String x) / 1000 * 100);
            }
        }); */


      button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               new Thread(new Runnable() {
                   @Override
                   public void run() {
                       while(barStat < 100) {
                           barStat++;
                           android.os.SystemClock.sleep(100);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    bar.setProgress(barStat);
                                    if(bar.getProgress() >= 95) {
                                        pichu.setVisibility(View.GONE);
                                        levelUp.setVisibility(View.VISIBLE);
                                        if(bar.getProgress() == 100) {
                                            levelUp.setVisibility(View.GONE);
                                           // pichu.setVisibility(View.GONE);
                                            pikachuHappy.setVisibility(View.VISIBLE);

                                        }
                                    }
                                }
                            });
                       }

                   }
               }).start();

                }

        });
        
   /*   public static int amountXP(String str) {
        int idx = str.lastIndexOf("-");
        if (str.contains("transaction_date")){
            return Integer.parseInt(str.substring(idx + 4));
        } else {
            return Integer.parseInt(str.substring(idx + 4)) * -1;
        }
    } */




        return view;

        // return inflater.inflate(R.layout.fragment_home, null);
    }
}
