package com.quimicadigital.qumicadigital40.ui;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.quimicadigital.qumicadigital40.R;
import com.quimicadigital.qumicadigital40.databinding.FragmentInformacaoBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Informacao extends Fragment {

    private FragmentInformacaoBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentInformacaoBinding.inflate(inflater, container, false);

        View rootView = binding.getRoot();
        LinearLayout layout_info = binding.layoutInfo1;
        LinearLayout layout_info2 = binding.layoutInfo2;
        LinearLayout layout_info3 = binding.layoutInfo3;
        LinearLayout layout_info4 = binding.layoutInfo4;
        LinearLayout layout_info5 = binding.layoutInfo5;
        if (rootView != null) {
            Drawable backgroundDrawable = rootView.getBackground();
            if (backgroundDrawable instanceof ColorDrawable) {
                int backgroundColor = ((ColorDrawable) backgroundDrawable).getColor();
                String hexColor = String.format("#%06X", (0xFFFFFF & backgroundColor));
                if(hexColor.equals("#B2D8EB")){
                    layout_info.setBackgroundResource(R.drawable.forma_borda_elemento_light_info);
                    layout_info2.setBackgroundResource(R.drawable.forma_borda_elemento_light_info);
                    layout_info3.setBackgroundResource(R.drawable.forma_borda_elemento_light_info);
                    layout_info4.setBackgroundResource(R.drawable.forma_borda_elemento_light_info);
                    layout_info5.setBackgroundResource(R.drawable.forma_borda_elemento_light_info);
                }

            }
        }
        View root = binding.getRoot();
        return root;
    }
}