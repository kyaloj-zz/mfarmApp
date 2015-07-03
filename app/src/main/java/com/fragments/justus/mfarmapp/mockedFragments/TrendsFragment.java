package com.fragments.justus.mfarmapp.mockedFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by justus on 7/3/15.
 */
public class TrendsFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView text = new TextView(this.getActivity());
        text.setText("Trends");
        text.setGravity(Gravity.CENTER);
        return text;
    }
}
