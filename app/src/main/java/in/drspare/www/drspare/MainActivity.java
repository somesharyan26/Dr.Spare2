package in.drspare.www.drspare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do_login(((EditText)MainActivity.this.findViewById(R.id.main_id)).getText().toString().trim(),
                        ((EditText)MainActivity.this.findViewById(R.id.main_pass)).getText().toString().trim());
            }
        });
    }

    private void do_login(String user_id, String pass){
        if(user_id.equals("admin") && pass.equals("admin"))
            startActivity(new Intent(this, Menu.class));
        else
            Toast.makeText(this,"Invalid id or password.",Toast.LENGTH_SHORT).show();
    }
}
