package com.example.navigationdrawerexploration.ui.songs;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navigationdrawerexploration.databinding.FragmentMoviesBinding;
import com.example.navigationdrawerexploration.databinding.FragmentSongsBinding;

public class SongFragment extends Fragment {
    private FragmentSongsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSongsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}

