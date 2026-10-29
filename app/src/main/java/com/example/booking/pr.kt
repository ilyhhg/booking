import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.booking.Booking
import com.example.booking.RetrofitClient

@Preview
@Composable
fun h() {

    var bookings by remember { mutableStateOf<List<Booking>>(emptyList()) }

    LaunchedEffect(Unit) {
        try {
            bookings = RetrofitClient.api.getBookings()
            Log.d("API", "Получено: $bookings")
        } catch (e: Exception) {
            Log.e("API", "Ошибка: ${e.message}")
        }
    }

    LazyColumn {
        items(bookings) { b ->
            Text("${b.guestName}, ${b.data}, гостей: ${b.guests}")
        }
    }
}