package com.example.magicball;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity View.OnClickListened {

    private ImageView ball;
    private TextView respuesta;

    private String[] respuestaArray = {"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
        "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
        "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
        "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia imagen
        ball=findViewById(R.id.boton);

        //Referencia segundo texto
        respuesta=findViewById(R.id.respuesta);
        ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this,"Buscando Respuesta",Toast.LENGTH_SHORT).show();
        }
     @Override
    public void onClick(View V){
        //Creacion de metodo de respuesta aleatorio
        switch (v.getId()){
        case R.id.boton:
            int random = new Random().nextInt(respuestaArray.length);
            respuesta.setText(respuestaArray[random]);
            break;
        }
    }
}
