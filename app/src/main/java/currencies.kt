import android.R.attr.contentDescription
import android.media.Image
import android.util.Log.i
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.booking.CardsExample
import com.example.booking.R
import kotlin.math.sin
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val items= listOf(
    CardsExample(
        name = "MASTER",
        cardNumber = "1234 5678 9000",
        crdName = "Bob Bobovich",
        balance = "10"

    ),

   CardsExample(
        name = "VISA",
        cardNumber = "1234 5678 9000",
        crdName = "Bob Bobovich",
        balance = "10"

    ),

   CardsExample(
        name = "VISA",
        cardNumber = "1234 5678 9000",
        crdName = "Bob Bobovich",
        balance = "10"

    ),

   CardsExample(
        name = "VISA",
        cardNumber = "1234 5678 9000",
        crdName = "Bob Bobovich",
        balance = "10"

    ),

   CardsExample(
        name = "VISA",
        cardNumber = "1234 5876 9000",
        crdName = "Bob Bobovich",
        balance = "10"

    )
)

@Preview
@Composable
fun CardsSection(){
    LazyRow {
        items(items.size){ index->
            cardItem(index)
        }
    }
}

@Composable
fun cardItem(
    index: Int)
{
    val card=items[index]
    var lastItemPadding=0.dp
    if(index==items.size-1){
        lastItemPadding=16.dp
    }
    var image= painterResource(id=R.drawable.ic_visa)

    if(card.name=="MASTER"){
        image=painterResource(R.drawable.ic_mastercard)

    }
    Box(
        modifier = Modifier.padding(start = 16.dp, end = lastItemPadding)
    ){
        Column(modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.Gray)
            .width(250.dp)
            .height(160.dp)
            .clickable {}
            .padding(vertical = 12.dp, horizontal = 16.dp),
        verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter=image,
                contentDescription=card.cardNumber,
                modifier = Modifier.width(60.dp)
            )
            Text(text=card.crdName,
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}