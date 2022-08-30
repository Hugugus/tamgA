package com.example.tamg.ui.bloom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.tamg.databinding.FragmentBloomBinding;
import com.example.tamg.databinding.FragmentCcBinding;

public class BloomFragment extends Fragment {

    //image https://www.manager-go.com/organisation-entreprise/articles/un-processus-est-un-systeme

    private BloomModel bloomModel;
    private FragmentBloomBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bloomModel =
                new ViewModelProvider(this).get(BloomModel.class);

        binding = FragmentBloomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}