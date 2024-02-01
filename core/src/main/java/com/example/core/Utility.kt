import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.core.Constants.IMAGE_BASE_URL

fun getProgressDrawable(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 10f
        centerRadius = 50f
        start()
    }
}

fun ImageView.loadImage(id: String, progressDrawable: CircularProgressDrawable, image: Int) {
    val options = RequestOptions().placeholder(progressDrawable).error(image)
    Glide.with(this.context).setDefaultRequestOptions(options).load(getPokemonImage(id)).into(this)
}

fun getPokemonImage(i: String) = IMAGE_BASE_URL + "/${i}.png"
