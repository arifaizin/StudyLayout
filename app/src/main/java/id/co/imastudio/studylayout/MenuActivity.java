package id.co.imastudio.studylayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    //Langkah 1
    //Kenalin variabel
    Button constraint, frame, linear, relative, table, scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Langkah 2
        //Sambungin
        constraint = (Button) findViewById(R.id.btnConstraint);
        frame = (Button) findViewById(R.id.btnFrame);
        linear = (Button) findViewById(R.id.btnLinear);
        relative = (Button) findViewById(R.id.btnRelative);
        table = (Button) findViewById(R.id.btnTable);
        scroll = (Button) findViewById(R.id.btnScrollView);

        //Langkah 3
        //ngapain  - event Handling
        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //munculin apa
                Toast.makeText(MenuActivity.this, "Ini Toast", Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(MenuActivity.this, ConstraintActivity.class);
                startActivity(pindah);
            }
        });

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MenuActivity.this);
                alert.setTitle("Ini Alert Dialog")
                        .setMessage("Meseejjjjjjj")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent pindah = new Intent(MenuActivity.this, FrameActivity.class);
                                startActivity(pindah);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setIcon(R.drawable.gambar1)
                        .show();
            }
        });

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, LinearActivity.class);
                startActivity(pindah);
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, RelativeLayoutActivity.class);
                startActivity(pindah);
            }
        });

        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, TableActivity.class);
                startActivity(pindah);
            }
        });

        scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, ScrollViewActivity.class);
                startActivity(pindah);
            }
        });
    }
}
