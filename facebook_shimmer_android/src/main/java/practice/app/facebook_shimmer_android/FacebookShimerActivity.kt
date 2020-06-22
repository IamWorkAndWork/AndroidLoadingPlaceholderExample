package practice.app.facebook_shimmer_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class FacebookShimerActivity : AppCompatActivity() {

    private val handler = Handler()

    private val DELAY = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
    }

    fun loadData() {

        contents.visibility = View.GONE
        shimmer_view_container.startShimmer()
        shimmer_view_container.visibility = View.VISIBLE

        handler.postDelayed(Runnable {

            shimmer_view_container.stopShimmer()
            shimmer_view_container.visibility = View.GONE
            contents.visibility = View.VISIBLE

        }, DELAY)

    }

    fun onClickRetry(view: View) {
        loadData()
    }
}
