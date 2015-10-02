package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int quantity = 1;
    private int price=0;

    /**
     * This method is called when caramel checkbox is used
     */
    public void caramel (View view)
    {
        CheckBox cb = (CheckBox) view;
        if(cb.isChecked())
        {
            price+=2;
        }
    }

    /**
     * This method is called when chocolate checkbox is used
     */
    public void chocolate (View view)
    {
        CheckBox cb = (CheckBox) view;
        if(cb.isChecked())
        {
            price+=2;
        }
    }

    /**
     * This method is called when vanilla checkbox is used
     */
    public void vanilla (View view)
    {
        CheckBox cb = (CheckBox) view;
        if(cb.isChecked())
        {
            price+=2;
        }
    }

    /**
     * This method is called when '+' button is clicked.
     */
    public void increment(View view)
    {
        quantity++;
        display(quantity);
    }

    /**
     * This method is called when '-' button is clicked.
     */
    public void decrement(View view)
    {
        quantity--;
        display(quantity);

        if(quantity<0)
        {
            quantity=0;
            display(quantity);
        }
    }

    /**
     * This method is called when order button is clicked.
     */
    public void submitOrder(View view)
    {
        price = price + (quantity * 5);
        String priceMessage = ("Total: $" + price + "\nThank You!");
        displayMessage(priceMessage);
    }



    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number){
        TextView quantityTextView=(TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays message on the screen.
     */
    private void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }


}
