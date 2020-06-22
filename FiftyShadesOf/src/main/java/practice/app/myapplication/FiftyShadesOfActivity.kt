package practice.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.github.florent37.fiftyshadesof.FiftyShadesOf

class FiftyShadesOfActivity : AppCompatActivity() {

    private val DELAY = 2000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

    }

    fun onLoadData(view: View) {
        loadData()
    }

    internal fun loadData() {

        val fiftyShadesOf = FiftyShadesOf.with(this)
            .on(R.id.layout, R.id.layout1, R.id.layout2)
//            .on(R.id.layoutParent)
            .start()

        Handler().postDelayed({

            fiftyShadesOf.stop()

        }, DELAY)
    }

}