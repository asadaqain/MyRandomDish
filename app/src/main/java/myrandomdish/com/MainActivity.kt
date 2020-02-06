package myrandomdish.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.text.htmlEncode
import androidx.core.text.parseAsHtml
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dish_name.text = "Default Dish"
        dish_description.text = "Simple Description of Dish"
//        dish_recipe_link.text =
    }

    fun getMeADish(view: View) {

    }
}
