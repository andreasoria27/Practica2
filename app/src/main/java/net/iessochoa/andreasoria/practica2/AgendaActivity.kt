package net.iessochoa.andreasoria.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AgendaActivity : AppCompatActivity() {

    private lateinit var btAceptar: Button
    private lateinit var btCancelar: Button

    private lateinit var etNombre: TextView;
    private lateinit var etApellidos: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        btAceptar.setOnClickListener{ponerNombreTitulo()}

        btCancelar.setOnClickListener() { finish() }
    }



    fun ponerNombreTitulo(){
        if (etNombre.text.isEmpty() && etApellidos.text.toString().isEmpty()){
            println("Es necesario introducir el Nombre y el Apellido.")
        }
        val intent = Intent(this, AgendaActivity::class.java)
        startActivity(intent)
    }
}