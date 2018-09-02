package com.project.whj.qqphotoview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.project.whj.qqphotoview.view.PhotoViewActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] image_list={
            "http://t1.27270.com/uploads/tu/201808/1001/3f6e297025.jpg",
            "http://t1.27270.com/uploads/tu/201808/1000/dc109bbcc5.jpg",
            "http://t1.27270.com/uploads/tu/201808/998/a025bc11ef.jpg"
    };
    private ArrayList<String> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        imageList = new ArrayList<>();
        for (int i=0;i<image_list.length;i++){
            imageList.add(image_list[i]);
        }
    }

    public void onClick(View v){
        Intent intent=new Intent(this, PhotoViewActivity.class);

        //传递当前位置
        intent.putExtra(PhotoViewActivity.CURRENT_POINT_KEY,0);

        //传递总的图片路劲
        intent.putStringArrayListExtra(PhotoViewActivity.IMAGE_URL_LIST_KEY,imageList);
        startActivity(intent);
    }
}
