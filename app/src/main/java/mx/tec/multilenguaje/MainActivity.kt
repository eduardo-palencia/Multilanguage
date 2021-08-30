package mx.tec.multilenguaje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener {
            //Toast
            //1. Contexto (componente que lo llama)
            // 2. Texto que va a mostrar
            // 3. Duracion (Constantes)
            //!! No olviden el .show()
            Toast.makeText(this@MainActivity,
                edtTexto.text,
                Toast.LENGTH_SHORT
            ).show()
        }

        btnAlert.setOnClickListener {
            // 3 botones, maximo 2 de un tipo
            // 3 tipos: NeutralButton, PositiveButton, NegativeButton
            val builder = AlertDialog.Builder(this@MainActivity)
            // R.id.btnAlert <- Es un entero largo (long)
            builder.setTitle(R.string.str_tituloDialog)
                .setMessage(edtTexto.text) //Contenido del texto
                .setPositiveButton(R.string.str_yes) { dialog, button ->
                    dialog.dismiss()
                }
                .setNegativeButton(R.string.str_no) { dialog, button ->
                    dialog.dismiss()
                }
                .setNeutralButton(R.string.str_later) { dialog, button ->
                    dialog.dismiss()
                }
                .show()
            resources.getString(R.string.str_tituloDialog)
        }
        btnConsola.setOnClickListener {
            //Log
            //.e Error
            // .d debug
            // .i informativos
            // .w wtf .v
            Log.w("VOLLEY", "El servicio web no está disponible")
        }
    }
}