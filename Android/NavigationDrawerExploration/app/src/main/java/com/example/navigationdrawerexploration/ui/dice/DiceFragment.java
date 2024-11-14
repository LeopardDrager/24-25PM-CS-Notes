package com.example.navigationdrawerexploration.ui.dice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navigationdrawerexploration.R;
import com.example.navigationdrawerexploration.databinding.FragmentDiceBinding;

import java.util.Random;

public class DiceFragment extends Fragment {
    private ImageView dice;

    private FragmentDiceBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDiceBinding.inflate(inflater,container,false);
        View root = binding.getRoot();


        //to make image clickable
        dice = root.findViewById(R.id.diceImg);
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });

        return root;

    }


private void rollDice(){
        //generate a random #
        Random rng = new Random();
        int randomNumber = rng.nextInt(6);
        //if randomNumber == 0 { setimage to Dice1}
        switch (randomNumber){
            case 0:
                dice.setImageResource(R.drawable.dice1);
                break;
            case 1:
                dice.setImageResource(R.drawable.dice2);
                break;
            case 2:
                dice.setImageResource(R.drawable.dice3);
                break;
            case 3:
                dice.setImageResource(R.drawable.dice4);
                break;
            case 4:
                dice.setImageResource(R.drawable.dice5);
                break;
            case 5:
                dice.setImageResource(R.drawable.dice6);
                break;
        }


        //depending on the number we set our image to that sided dice


    }

}
