package com.example.ivanlayout;
// †
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        int[] imageId = {R.drawable.a, R.drawable.d, R.drawable.c, R.drawable.d,
                R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.f, R.drawable.i,};
        String[] name = {"Ольга", "Денис", "Стас", "Иван", "Настя", "Лера", "Яна", "Никита", "Максим"};
        String[] lastMessage = {"Привет", "Пока", "Я гуль", "Стас молчи", "Ок", "Ваня", "Топ", "Напишешь", "Нет"};
        String[] lastMsgTime = {"7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00"};
        String[] phoneNo = {"8(8875)590-44-58", "8(9086)873-02-27", "8(9086)873-02-27", "8(9086)873-02-27",
                "8(2065)988-98-98", "8(769)953-13-97", "8(318)361-33-74", "8(53)321-79-76", "8(62)755-51-86"};
        String[] country = {"Гаити", "Норвегия", "Ниуэ", "Гватемала", "Аргентина", "Коморы", "Дания", "Нигерия", "Самоа"};
        ArrayList<User> userArrayList = new ArrayList();
        for (int i = 0; i < imageId.length; i++)
        {
            User user = new User(name[i], lastMessage[i], lastMsgTime[i],
                    phoneNo[i], country[i], imageId[i]);
            userArrayList.add(user);
        }
        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);
        listView.setAdapter(listAdapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(MainActivity.this,UserActivity.class);
                intent.putExtra("name",name[i]);
                intent.putExtra("phone",phoneNo[i]);
                intent.putExtra("country",country[i]);
                intent.putExtra("imageid",imageId[i]);

                startActivity(intent);
            }

        });
    }
}
