package com.example.jonathan.navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.LayoutInflaterCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jonathan on 01/12/16.
 */

public class fragmentOne extends Fragment {

    @Nullable
    @Override


    public View OncreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        return  inflater.inflate(R.layout.fragment_one, container,false);
    }


}
