package emsi.com.appemploidutremps;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import emsi.com.appemploidutremps.dao.ClasseDAO;
import emsi.com.appemploidutremps.models.Classe;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Button btn=(Button) findViewById(R.id.buttonTest);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> listEt= new ArrayList<>();
                listEt.add("r0t0Wkn4w3M0ZGYdVcUfHLSmVw63");
                listEt.add("fzefzefzefzefzefzef63");
                ClasseDAO.getInstance().addClasse(new Classe("Miage3",null,listEt));
            }
        });
    }
}
