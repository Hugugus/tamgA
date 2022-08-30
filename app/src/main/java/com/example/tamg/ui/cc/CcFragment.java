package com.example.tamg.ui.cc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.tamg.databinding.FragmentCcBinding;

public class CcFragment extends Fragment {

    //image https://www.manager-go.com/organisation-entreprise/articles/un-processus-est-un-systeme

    private CcModel ccModel;
    private FragmentCcBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ccModel =
                new ViewModelProvider(this).get(CcModel.class);

        binding = FragmentCcBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}