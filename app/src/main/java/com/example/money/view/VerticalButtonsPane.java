package com.example.money.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

public class VerticalButtonsPane extends LinearLayout {
    public VerticalButtonsPane(Context context) {
        super(context);
        initialize();
    }

    public VerticalButtonsPane(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public VerticalButtonsPane(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    public VerticalButtonsPane(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();
    }

    private void initialize() {
        setOrientation(LinearLayout.VERTICAL);
    }

    public void addButton(String buttonText) {
        Button button = new Button(getContext());
        button.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        button.setText(buttonText);
        addView(button);
    }
}
