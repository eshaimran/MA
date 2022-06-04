package com.labs.lab9;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FAQ extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        txt=findViewById(R.id.textView2);
        txt.setText("You can place the order by doing the following:" +
                        "\nSignup or Login to your account." +
                        "\nDrop your actual location" +
                        "\nChoose the restaurant or store from available restaurant" +
                        "\nSelect the items you want to order" +
                        "\nAdd them to cart" +
                        "\nAdd the promo (If you do have any)" +
                        "\nClick on checkout" +
                        "\nAdd the address" +
                        "\nSelect payment method" +
                "\nSlide to place the order");
    }
}
