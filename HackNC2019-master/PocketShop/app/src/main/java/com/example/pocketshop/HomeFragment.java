package com.example.pocketshop;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment implements View.OnClickListener {

    Button dayButton;
    Button weekButton;
    Button monthButton;
    Button yearButton;

    TextView revenueDate;
    TextView revenue;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        dayButton = view.findViewById(R.id.dayButton);
        weekButton = view.findViewById(R.id.weekButton);
        monthButton = view.findViewById(R.id.monthButton);
        yearButton = view.findViewById(R.id.yearButton);

        revenueDate = view.findViewById(R.id.revenueDate);
        revenue = view.findViewById(R.id.revenue);

        dayButton.setOnClickListener(this);
        weekButton.setOnClickListener(this);
        monthButton.setOnClickListener(this);
        yearButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        if(dayButton.getId() == view.getId()) {
            dayButton.setBackgroundColor(Color.parseColor("#0059B3"));
            weekButton.setBackgroundColor(Color.parseColor("#000080"));
            monthButton.setBackgroundColor(Color.parseColor("#000080"));
            yearButton.setBackgroundColor(Color.parseColor("#000080"));
            revenueDate.setText("For the day");
            revenue.setText("$" + calculateRevenue(1,2,3,4));
        } else if(weekButton.getId() == view.getId()) {
            weekButton.setBackgroundColor(Color.parseColor("#0059B3"));
            dayButton.setBackgroundColor(Color.parseColor("#000080"));
            monthButton.setBackgroundColor(Color.parseColor("#000080"));
            yearButton.setBackgroundColor(Color.parseColor("#000080"));
            revenueDate.setText("For the week");
            revenue.setText("$" + calculateRevenue(10,2,3,4));
        } else if(monthButton.getId() == view.getId()) {
            monthButton.setBackgroundColor(Color.parseColor("#0059B3"));
            weekButton.setBackgroundColor(Color.parseColor("#000080"));
            dayButton.setBackgroundColor(Color.parseColor("#000080"));
            yearButton.setBackgroundColor(Color.parseColor("#000080"));
            revenueDate.setText("For the month");
            revenue.setText("$" + calculateRevenue(11,2,3,4));
        } else {
            yearButton.setBackgroundColor(Color.parseColor("#0059B3"));
            weekButton.setBackgroundColor(Color.parseColor("#000080"));
            monthButton.setBackgroundColor(Color.parseColor("#000080"));
            dayButton.setBackgroundColor(Color.parseColor("#000080"));
            revenueDate.setText("For the year");
            revenue.setText("$" + calculateRevenue(123,2,3,4));
        }
    }

    public int calculateRevenue(int day, int week, int month, int year) {
        return day + week + month + year;
    }
}
