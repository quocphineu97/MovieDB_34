package com.cris.nvh.moviedb.ui.movies;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nvh
 * Contact: toiyeuthethao1997@gmail.com
 */

public class MoviesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static Intent getIntent(Context context) {
        return new Intent(context, MoviesActivity.class);
    }
}
