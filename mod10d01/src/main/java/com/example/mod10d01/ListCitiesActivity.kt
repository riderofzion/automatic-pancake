package com.example.mod10d01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListCitiesActivity : AppCompatActivity() {
    val cities = arrayListOf(
        City("Paris", 2140526, "75", 4.7f),
        City("Marseille", 869815, "13", 4.1f),
        City("Lyon", 515695, "69", 4.3f),
        City("Toulouse", 479553, "31", 4.0f),
        City("Nice", 342522, "06", 4.2f),
        City("Nantes", 309346, "44", 4.0f),
        City("Strasbourg", 290841, "67", 4.1f),
        City("Montpellier", 285121, "34", 3.9f),
        City("Bordeaux", 254436, "33", 4.2f),
        City("Lille", 233098, "59", 4.1f),
        City("Rennes", 216815, "35", 4.0f),
        City("Reims", 182460, "51", 4.0f),
        City("Le Havre", 172807, "76", 3.8f),
        City("Cergy", 158889, "95", 3.7f),
        City("Saint-Étienne", 156320, "42", 3.6f),
        City("Toulon", 165514, "83", 3.9f),
        City("Angers", 152199, "49", 3.8f),
        City("Grenoble", 157424, "38", 4.0f),
        City("Dijon", 156920, "21", 3.9f),
        City("Nîmes", 152787, "30", 3.8f),
        City("Aix-en-Provence", 142482, "13", 4.1f),
        City("Saint-Quentin-en-Yvelines", 145150, "78", 3.7f),
        City("Brest", 139384, "29", 3.7f),
        City("Le Mans", 143240, "72", 3.8f),
        City("Amiens", 142521, "80", 3.6f),
        City("Tours", 136125, "37", 3.8f),
        City("Limoges", 133627, "87", 3.7f),
        City("Clermont-Ferrand", 141569, "63", 3.7f),
        City("Villeurbanne", 151753, "69", 4.0f),
        City("Metz", 117619, "57", 3.7f),
        City("Besançon", 117267, "25", 3.6f),
        City("Perpignan", 121875, "66", 3.7f),
        City("Orléans", 114235, "45", 3.7f),
        City("Mulhouse", 112349, "68", 3.6f),
        City("Rouen", 111553, "76", 3.7f),
        City("Boulogne-Billancourt", 119539, "92", 4.0f),
        City("Nancy", 104885, "54", 3.6f),
        City("Argenteuil", 110210, "95", 3.5f),
        City("Montreuil", 111703, "93", 3.6f),
        City("Roubaix", 98384, "59", 3.6f),
        City("Tourcoing", 96971, "59", 3.6f),
        City("Avignon", 92736, "84", 3.6f),
        City("Nanterre", 94635, "92", 3.5f),
        City("Vitry-sur-Seine", 94344, "94", 3.6f),
        City("Créteil", 91716, "94", 3.6f),
        City("Dunkirk", 89181, "59", 3.5f),
        City("Poitiers", 87479, "86", 3.6f),
        City("Asnières-sur-Seine", 86736, "92", 3.6f),
        City("Courbevoie", 85024, "92", 3.5f),
        City("Versailles", 85334, "78", 3.6f),
        City("Colombes", 84809, "92", 3.6f),
        City("Fort-de-France", 79903, "972", 3.6f),
        City("Aulnay-sous-Bois", 82311, "93", 3.5f)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_cities)
        findViewById<RecyclerView>(R.id.recyclerViewCities).also {
            it.adapter = CityAdapter(cities){city->
                Toast.makeText(
                    this,
                    "Vous avez sélectionné ${city.name}",
                    Toast.LENGTH_SHORT).show()
            }
            it.layoutManager = LinearLayoutManager(this)
        }
    }
}