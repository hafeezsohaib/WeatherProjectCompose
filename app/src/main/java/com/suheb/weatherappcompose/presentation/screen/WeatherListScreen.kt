package com.suheb.weatherappcompose.presentation.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.suheb.weatherappcompose.R



@Composable
 fun ListItem(img:Int,tittle:String,subtitle:String){

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp))

    {

        Row (verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp))

        {

            Image(painter = painterResource(id = img)  ,
              contentDescription = "",
                 modifier = Modifier
                     .size(50.dp)
                     .padding(3.dp)
                     .weight(.2f))

            ItemDescription(tittle, subtitle,Modifier.weight(.8f))

        }

        }
 }

@Composable
private fun ItemDescription(tittle: String, subtitle: String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = tittle,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 5.dp),
            color = Color.Red,

            )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(start = 5.dp),
            color = Color.Black
        )
    }
}



@Composable
fun DisplayUi(){
    LazyColumn(content = {

    items(getCategoryList()){
       item -> ListItem(img = item.img, tittle =item.tittle , subtitle = item.subtitle)
    }
})
}

data class Category(val img:Int,val tittle:String,val subtitle:String)


fun getCategoryList(): MutableList<Category> {

    val list= mutableListOf<Category>()
  list.add(Category(R.drawable.sunrise,"Program","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))

    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))


    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))


    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"AI","Python"))
    list.add(Category(R.drawable.sunrise,"C","Lab"))
    list.add(Category(R.drawable.sunrise,"AWS","Android"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))
    list.add(Category(R.drawable.sunrise,"kotlin","java"))



    return list

}

