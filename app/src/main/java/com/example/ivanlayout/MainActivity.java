package com.example.ivanlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.io.InterruptedIOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] imageId = {R.drawable.a, R.drawable.d, R.drawable.c,R.drawable.d,
                R.drawable.e,R.drawable.f, R.drawable.g, R.drawable.f,R.drawable.i,};

        String [] name = {"Ольга","Денис","Стас","Иван","Настя","Лера","Яна","Никита","Максим"};
        String [] lastMessage = {"Привет","Пока","Стас","Лох","Ок","Ваня","Топ","Напишешь","Нет"};
        String [] lastMsgTime = {"7:00","8:00","9:00","10:00","11:00","12:00","13:00","14:00","15:00"};
        String [] phoneNo = {"8(8875)590-44-58","8(9086)873-02-27","8(9086)873-02-27","8(9086)873-02-27",
                "8(2065)988-98-98","8(769)953-13-97","8(318)361-33-74","8(53)321-79-76","8(62)755-51-86"};
        String [] county = {"Гаити","Норвегия","Ниуэ","Гватемала","Аргентина","Коморы","Дания","Нигерия","Самоа"};

        ArrayList <User> userArrayList = new ArrayList();
        for(int i=0; i<imageId.length; i++)
        {
            User user = new User(name[i],lastMessage[i],lastMsgTime[i],
                    phoneNo[i],county[i],imageId[i]);
            userArrayList.add(user);
        }

    }
    public void onItemClick (AdapterView<?> parent, View view, int position, long in)
    {
        Intent i = new Intent(MainActivity.this, UserActivity.class);
//        i.putExtra("name",name[position]);
//        i.putExtra("phoneNO",phoneNO[position]);
//        i.putExtra("country",country[position]);
//        i.putExtra("imageid",imageid[position]);
        startActivity(i);
    }
}