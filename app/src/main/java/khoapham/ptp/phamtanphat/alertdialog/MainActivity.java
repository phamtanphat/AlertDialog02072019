package khoapham.ptp.phamtanphat.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlert = findViewById(R.id.buttonDialog);

//        Nhanvien builder = new NhanvienBuilder()
//                        .ten("Phat")
//                        .builder();
//
//        Log.d("BBB",builder.getTen());
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Hộp thoại");
                builder.setMessage("Bạn có muốn đóng ứng dụng");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.show();
            }
        });

    }
}
