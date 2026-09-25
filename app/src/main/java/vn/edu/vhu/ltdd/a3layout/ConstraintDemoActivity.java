package vn.edu.vhu.ltdd.a3layout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Hiển thị layout dựng bằng ConstraintLayout để so sánh trực quan với bản LinearLayout.
 */
public class ConstraintDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_demo);
        setTitle(R.string.constraint_title);
    }
}
