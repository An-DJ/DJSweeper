package me.andj.djsweeper.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import me.andj.djsweeper.R;

/**
 * @program: AboutActivity
 *
 * @description: The activity which shows about information.
 *
 * @author: AnDJ
 *
 * @date: 2018/5/1
 */

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
}
