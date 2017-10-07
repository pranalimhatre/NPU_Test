package com.example.pranali.npu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pranali.npu.R;

/**
 * Created by Bansari on 10/6/2017.
 */

public class MapFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View mapView = inflater.inflate(R.layout.map_fragment, container, false);
        return mapView;
    }
}
