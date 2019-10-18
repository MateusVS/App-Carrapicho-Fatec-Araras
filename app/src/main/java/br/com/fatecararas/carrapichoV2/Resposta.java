package br.com.fatecararas.carrapichoV2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Resposta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta2);

        Intent intent = getIntent();
        int total = intent.getIntExtra("total", 0);
        String mensagem = " ";
        String titulo = " ";
        ImageView imageView = findViewById(R.id.imageView);

        if (total >= 0 && total <= 10){
            titulo = "Só nas Calorias\n";
            mensagem ="Ninguém vive só de pizza e brigadeiro né? Clarque tudo isso é uma delícia, mas nosso corpo \n" +
                    "precisa de um pouco de tudo: carboidratos, \n" +
                    "proteínas, fibras… Consultar um nutricionista \n" +
                    "pose ser uma ótima maneira de começar.";
            imageView.setImageResource(R.drawable.img2);
        } else if (total >= 11 && total <= 20){
            titulo = "#partiumalhar\n";
            mensagem = "Cuidar da alimentação é o primeiro passo para \n" +
                    "uma vida saudável. Lembre: Você é aquilo que \n" +
                    "você come. Fazer algum exercício físico também \n" +
                    "ajuda a manter o peso em equilíbrio. Pode ser \n" +
                    "jazz, natação, vôlei…\n" +
                    "Bora se mexer?";
            imageView.setImageResource(R.drawable.img);
        } else if (total >= 21 && total <= 28){
            titulo = "Viva a genética\n";
            mensagem = "Às vezes, rolam algumas encanações com o \n" +
                    "corpo, certo? Mas, mesmo assim, você sabe que \n" +
                    "é bonita do seu jeito e não precisa fazer muita \n" +
                    "coisa para continuar de bem com a balança. Só \n" +
                    "fique esperta para também manter a saúde em dia!";
            imageView.setImageResource(R.drawable.img3);
        } else if(total >= 29 && total <= 40){
            titulo = "Garota Fitness\n";
            mensagem ="Comer frutas nos intervalos das refeições, se \n" +
                    "exercitar três vezes por semana e não jantar \n" +
                    "coisa muito pesadas: é assim que você leva a \n" +
                    "vida. Parabéns pelo foco! Só que não precisa \n" +
                    "virar a doida da dieta, combinado? Tudo em \n" +
                    "exagero acaba sendo prejudicial a saúde. ";
            imageView.setImageResource(R.drawable.img4);
        }

        TextView msg = findViewById(R.id.textViewMsg);
        TextView tit = findViewById(R.id.textViewTitulo);
        msg.setText(mensagem);
        tit.setText(titulo);
    }
}
