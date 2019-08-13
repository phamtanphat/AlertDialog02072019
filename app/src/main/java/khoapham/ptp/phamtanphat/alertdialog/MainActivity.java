package khoapham.ptp.phamtanphat.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAlert;
    int position = 0;
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
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Hộp thoại");

                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);

                final String[] mangconvat = {"Mèo","Chó","Heo","Gà","Cua"};
                boolean[] mangchecked = {true,false,false,false,true};

//                builder.setSingleChoiceItems(mangconvat, -1, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        position = i;
//                    }
//                });
                builder.setMultiChoiceItems(mangconvat, mangchecked, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        if (b){
                            Toast.makeText(MainActivity.this,"Đã chọn con "+ mangconvat[i], Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this,"Đã bỏ chọn"+ mangconvat[i], Toast.LENGTH_SHORT).show();
                        }
                    }
                });


                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Log.d("BBB",mangconvat[position]);
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                builder.show();
            }
        });

    }
}
