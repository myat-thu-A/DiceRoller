package it.myatthu.diceroller;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

import it.myatthu.diceroller.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    int[] imgDices = {R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4,
                        R.drawable.dice_5, R.drawable.dice_6};
    int imgIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initUI();
        initListeners();

    }

    private void initListeners() {
        binding.btRoll.setOnClickListener(v -> {
            imgIndex = new Random().nextInt(imgDices.length);
            binding.imageView.setImageResource(imgDices[imgIndex]);
        });
    }

    private void initUI() {
        binding.imageView.setImageResource(imgDices[0]);
    }
}