package com.example.listacruceros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listacruceros.Adapter.CruceroAdapter
import com.example.listacruceros.Models.Crucero

class PrincipalActivity : AppCompatActivity()  {
    private lateinit var rvCrucero: RecyclerView
    private lateinit var cruceroAdapter: CruceroAdapter

    private var listCruceros = ArrayList<Crucero>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        iniComponents()
        iniUI()
    }

    fun iniComponents(){
        rvCrucero = findViewById(R.id.rvCrucero)
    }

    fun iniUI(){
        listCruceros = getListCruceros()
        cruceroAdapter = CruceroAdapter(listCruceros)
        rvCrucero.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) //Que el Recycler View sea Horizontal
        rvCrucero.adapter = cruceroAdapter
    }

    fun getListCruceros(): ArrayList<Crucero> {
        val list = ArrayList<Crucero>()
        list.add(Crucero("MSC Seaview", "MSC Seaview es el segundo de dos de los barcos de la generación Seaside.Inspirado en un concepto pionero, MSC Seaview te acercará aún más al mar, gracias a su exclusivo diseño expresamente concebido para crear un clima más cálido.", "https://cdn.logitravel.com/contenidosShared/cruises/ship/757/generic.jpg"))
        list.add(Crucero("MSC Fantasia", "El buque de cruceros MSC Fantasia tiene un espíritu moderno, mientras ayuda a conservar el medio ambiente sin sacrificar la comodidad de los pasajeros. MSC Fantasia no es sólo un viaje de placer, es también un descubrimiento. Por primera vez en un barco, los pasajeros podrán caminar por unas escaleras de cristal de Swarovski.Un techo transparente permite a los pasajeros experimentar toda la magia de la navegación al contemplar el cielo estrellado.", "https://cdn.logitravel.com/wsimgresize/resize/crop/450/210/cdn.logitravel.com/contenidosShared/cruises/ship/196/generic.jpg?jpegQuality=85"))
        list.add(Crucero("Wonder of the Seas", "Wonder of the Seas ofrece una exclusiva aventura en el mar con muchas características nuevas. Diviértete sin fin en el nuevo Wonder Playscape o disfruta de las impresionantes vistas panorámicas al mar desde el Vue Bar. También encontrarás las atracciones emblemáticas de la clase Oasis, como el increíble tobogán Ultimate Abyss, los simuladores de surf FlowRider, la tirolina Zip Line o el minigolf Wonder Dunes mejorado.", "https://cdn.logitravel.com/contenidosShared/cruises/ship/994/generic.jpg"))
        list.add(Crucero("Costa Toscana", "Costa Toscana, el buque insignia de Costa Cruceros. Propulsado por gas natural licuado, el combustible fósil más limpio del mundo, lo convierte en un aliado del medio ambiente.Un fabuloso barco, que rinde homenaje a la belleza de Italia, en el que podrás disfrutar de espectáculos y actuaciones de artistas internacionales, una excelente gastronomía e increíbles instalaciones para la diversión y relax.", "https://cdn.logitravel.com/contenidosShared/cruises/ship/968/generic.jpg"))
        list.add(Crucero("Norwegian Epic", "Descubre el barco que ha reinventado el concepto de Freestyle Cruising aportando una marca propia de innovación emoción, diversión y libertad en alta mar. Saborea un sinfín de opciones culinarias disfruta de un entretenimiento que te dejará boquiabierto y pásalo en grande en los estupendos bares, incluído el primer bar de hielo auténtico en alta mar.", "https://cdn.logitravel.com/wsimgresize/resize/crop/450/320/cdn.logitravel.com/contenidosShared/cruises/ship/309/header.jpg?jpegQuality=85"))
        list.add(Crucero("Icon of the Seas", "Icon of the Seas, el primer barco de la clase Icon de Royal Caribbean, ¡dónde te divertirás como nunca antes!A bordo no solo encontrarás nuevas categorías de alojamiento que te dejarán con la boca abierta como las Ultimate Family TownHouse, sino que disfrutarás de grandes emociones como en el parque acuático Category 6, el parque acuático más grande de alta mar o pondrás a prueba tu valentía en el Crown´s Edge.", "https://cdn.logitravel.com/wsimgresize/resize/crop/450/210/cdn.logitravel.com/contenidosShared/cruises/ship/1078/generic.jpg?jpegQuality=85"))
        return list
    }
}