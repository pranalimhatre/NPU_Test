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

public class SocialFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View socialView = inflater.inflate(R.layout.social_fragment, container, false);
        return socialView;
    }

}
