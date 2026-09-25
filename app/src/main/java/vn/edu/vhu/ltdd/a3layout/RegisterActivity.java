package vn.edu.vhu.ltdd.a3layout;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

/**
 * Màn hình Đăng ký tài khoản (Bài nâng cao NC4) dựng bằng ConstraintLayout và dùng lại view_profile_card.xml.
 */
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle(R.string.register_title);

        Button btnSubmit = findViewById(R.id.btnSubmitReg);
        if (btnSubmit != null) {
            btnSubmit.setOnClickListener(v ->
                    Snackbar.make(v, "Đã gửi thông tin đăng ký!", Snackbar.LENGTH_SHORT).show());
        }
    }
}
