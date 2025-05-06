package senai.jandira.projetoprofile.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import senai.jandira.projetoprofile.R

@Composable
fun ProfileScreen(){
    Box(modifier = Modifier.fillMaxSize()){

        Column(modifier = Modifier.fillMaxSize()){
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(330.dp)
                .clip(shape = RoundedCornerShape(bottomStart = 15.dp, bottomEnd = 15.dp)))
            {
                Image(painter = painterResource(R.drawable.background), contentDescription = "",
                    contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
                 Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .padding(top = 20.dp), horizontalArrangement = Arrangement.SpaceBetween)
                    {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "", tint = Color.White)
                        Text(text = stringResource(R.string.details), fontSize = 20.sp, color = Color.White)
                        Box(modifier = Modifier
                            .height(1.dp)
                            .width(25.dp)){} //box só para deixar o details no centro
                    }
                     Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(top = 5.dp)){
                        Image(painter = painterResource(R.drawable.iconuser), contentDescription = "",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(shape = CircleShape))
                         Text(text = "Nicolas Silva", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.SemiBold,
                             modifier = Modifier.padding(top = 15.dp))
                         Text(text = "System Developer", color = Color.White, fontWeight = FontWeight.Light,
                             modifier = Modifier.padding(top = 5.dp))
                     }
                     Row(
                         modifier = Modifier
                             .fillMaxWidth()
                             .padding(top = 15.dp),
                         horizontalArrangement = Arrangement.SpaceAround,
                     ) {
                         Column(modifier = Modifier
                             .border(1.dp, shape = RoundedCornerShape(10.dp), color = Color.White)
                             .width(85.dp)
                             .height(70.dp)
                             .padding(10.dp),
                             horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(Icons.Filled.Email, contentDescription = "Email", tint = Color(0xffaba3e9))
                             Text(text = stringResource(id = R.string.email), fontSize = 15.sp, modifier = Modifier.padding(top = 1.dp),
                                 color = Color(0xffaba3e9), fontWeight = FontWeight.W500)
                         }
                         Column(modifier = Modifier
                             .border(1.dp, shape = RoundedCornerShape(10.dp), color = Color.White)
                             .width(85.dp)
                             .height(70.dp)
                             .padding(10.dp),
                             horizontalAlignment = Alignment.CenterHorizontally) {
                             Icon(Icons.Filled.Phone, contentDescription = "Email", tint = Color(0xffaba3e9))
                             Text(text = stringResource(id = R.string.call), fontSize = 15.sp, modifier = Modifier.padding(top = 1.dp),
                                 color = Color(0xffaba3e9), fontWeight = FontWeight.W500)
                         }
                         Column(modifier = Modifier
                             .border(1.dp, shape = RoundedCornerShape(10.dp), color = Color.White)
                             .width(85.dp)
                             .height(70.dp)
                             .padding(10.dp),
                             horizontalAlignment = Alignment.CenterHorizontally) {
                             Icon(painterResource(id = R.drawable.whatsapp), contentDescription = "Email", modifier = Modifier.size(24.dp), tint = Color(0xffaba3e9))
                             Text(text = stringResource(id = R.string.whatsapp), fontSize = 14.5.sp, modifier = Modifier.padding(top = 1.dp),
                                 color = Color(0xffaba3e9), fontWeight = FontWeight.W500)
                         }
                         Column(modifier = Modifier
                             .border(1.dp, shape = RoundedCornerShape(10.dp), color = Color.White)
                             .width(85.dp)
                             .height(70.dp)
                             .padding(10.dp),
                             horizontalAlignment = Alignment.CenterHorizontally) {
                             Icon(Icons.Outlined.Star, contentDescription = "Email", tint = Color(0xffaba3e9))
                             Text(text = stringResource(id = R.string.favorite), fontSize = 15.sp, modifier = Modifier.padding(top = 1.dp),
                                 color = Color(0xffaba3e9), fontWeight = FontWeight.W500)
                         }
                     }



                 }
            }
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.Email, contentDescription = "Email", tint = Color(0xff9489f8))
                        Text(text = stringResource(id = R.string.email), fontSize = 16.sp, fontWeight = FontWeight.W500, modifier =
                        Modifier.padding(start = 5.dp))
                    }
                    Column(modifier = Modifier
                        .padding(start = 30.dp)
                        .padding(top = 10.dp)) {
                        Text(text = stringResource(R.string.official), color = Color.Gray, fontSize = 13.sp)
                        Text(text = "nicolas@outlook.com", fontSize = 15.sp, fontWeight = FontWeight.W400)
                        Text(text = stringResource(R.string.personal), color = Color.Gray, fontSize = 13.sp, modifier = Modifier.padding(top = 10.dp))
                        Text(text = "nicolas@gmail.com", fontSize = 15.sp, fontWeight = FontWeight.W400)
                    }
                }

                HorizontalDivider(Modifier.padding(vertical = 10.dp))

                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.Phone, contentDescription = "Email", tint = Color(0xff9489f8))
                        Text(text = stringResource(id = R.string.phone_number), fontSize = 16.sp, fontWeight = FontWeight.W500, modifier =
                        Modifier.padding(start = 5.dp))
                    }
                    Column(modifier = Modifier
                        .padding(start = 30.dp)
                        .padding(top = 10.dp)) {
                        Text(text = stringResource(R.string.mobile), color = Color.Gray, fontSize = 13.sp)
                        Text(text = "(209) 555-0104", fontSize = 15.sp, fontWeight = FontWeight.W400)
                    }
                }

                HorizontalDivider(Modifier.padding(vertical = 10.dp))


                Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()){
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(painter = painterResource(id = R.drawable.group), contentDescription = "Email", tint = Color(0xff9489f8))
                            Text(text = stringResource(id = R.string.team), fontSize = 16.sp, fontWeight = FontWeight.W500, modifier =
                            Modifier.padding(start = 5.dp))
                        }
                        Column(modifier = Modifier
                            .padding(start = 30.dp)
                            .padding(top = 10.dp)) {
                            Text(text = "Project operation team", fontSize = 15.sp, fontWeight = FontWeight.W400)
                        }
                    }

                    Box(modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(40.dp)
                        .background(color = Color(0xff2f2289))){
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "", tint = Color.White, modifier = Modifier.align(alignment = Alignment.Center))
                    }
                }

                HorizontalDivider(Modifier.padding(vertical = 10.dp))

                Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()){
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Filled.Person, contentDescription = "Email", tint = Color(0xff9489f8))
                            Text(text = stringResource(id = R.string.leads_by), fontSize = 16.sp, fontWeight = FontWeight.W500, modifier =
                            Modifier.padding(start = 5.dp))
                        }
                        Column(modifier = Modifier
                            .padding(start = 30.dp)
                            .padding(top = 10.dp)) {
                            Text(text = "Nicolas", fontSize = 15.sp, fontWeight = FontWeight.W400)
                        }
                    }

                    Box(modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(40.dp)
                        .background(color = Color(0xff2f2289))){
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "", tint = Color.White, modifier = Modifier.align(alignment = Alignment.Center))
                    }
                }

                Row(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), horizontalArrangement = Arrangement.SpaceAround) {
                    Button(
                        onClick = {}, colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                        modifier = Modifier
                            .border(1.dp, shape = RoundedCornerShape(30.dp), color = Color.Gray)
                            .width(200.dp))
                    {

                        Row {
                            Icon(painter = painterResource(R.drawable.adduser), contentDescription = "", tint = Color(0xff2f2289))
                            Text(text = stringResource(id =R.string.add_to_contact), color = Color(0xff2f2289), modifier = Modifier.padding(start = 10.dp), fontSize = 15.sp)
                        }

                    }

                    Button(
                        onClick = {}, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .border(1.dp, shape = RoundedCornerShape(30.dp), color = Color.Gray)
                            .width(70.dp))
                    {
                        Icon(painter = painterResource(R.drawable.share), contentDescription = "", tint = Color(0xff2f2289))


                    }
                }



            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ProfileScreenPreview(){
    ProfileScreen()
}