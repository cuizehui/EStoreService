package com.example.cuizehui.estoredataservice;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.cuizehui.estoredataservice.fragments.OrderDataFragment;
import com.example.cuizehui.estoredataservice.fragments.ShopdataFragment;

import org.litepal.LitePal;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button shopmessage,ordermessage;
    private ViewPager viewpager;

    ArrayList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initview();
        initEvent();
    }

    private void initEvent() {


    }

    private void initData() {
           //创建数据存入数据库
        LitePal.getDatabase();


        ShopDaTa shopDaTa1=new ShopDaTa();
        shopDaTa1.setProductName("服务器A商品1");
        shopDaTa1.setPicadress("19.1");
        shopDaTa1.setShopName("服务器A");
        shopDaTa1.setPrice("13");

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.phone_a_big);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 90, baos);//压缩位图
        byte[] bytes= baos.toByteArray();

        Log.d("bitmap_log",":"+bytes.length);

        shopDaTa1.setBitmaps(bytes);//创建分配字节数组
        shopDaTa1.save();
        //图片地址

        ShopDaTa shopDaTa2=new ShopDaTa();
        shopDaTa2.setProductName("服务器B商品2");
        shopDaTa2.setPicadress("19.2");
        shopDaTa2.setShopName("服务器B");

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.phone_c_big);
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        bitmap1.compress(Bitmap.CompressFormat.PNG, 90, baos1);//压缩位图
        byte[] bytes1= baos1.toByteArray();
        shopDaTa2.setBitmaps(bytes1);

        shopDaTa2.setPrice("12");
        shopDaTa2.save();


        ShopDaTa shopDaTa3=new ShopDaTa();
        shopDaTa3.setProductName("服务器A商品3");
        shopDaTa3.setPicadress("19.3");
        shopDaTa3.setShopName("服务器A");
        shopDaTa3.setPrice("11");

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.phone_d_big);
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        bitmap2.compress(Bitmap.CompressFormat.PNG, 90, baos2);//压缩位图
        byte[] bytes2= baos2.toByteArray();
        shopDaTa3.setBitmaps(bytes2);
        shopDaTa3.save();


        ShopDaTa shopDaTa4=new ShopDaTa();
        shopDaTa4.setProductName("服务器C商品4");
        shopDaTa4.setPicadress("19.4");
        shopDaTa4.setShopName("服务器C");
        shopDaTa4.setPrice("10");
        shopDaTa4.save();

        ShopDaTa shopDaTa5=new ShopDaTa();
        shopDaTa5.setProductName("服务器B商品5");
        shopDaTa5.setPicadress("19.5");
        shopDaTa5.setShopName("服务器B");
        shopDaTa5.setPrice("9");
        shopDaTa5.save();
    }

    private void initview() {
        shopmessage = (Button) findViewById(R.id.bt_shopmassage);
        ordermessage= (Button) findViewById(R.id.bt_ordermessage);
        viewpager= (ViewPager) findViewById(R.id.viewpager);

        OrderDataFragment orderDataFragment=new OrderDataFragment(this);
        ShopdataFragment shopdataFragment=new ShopdataFragment(this);
     /*   VPadpter  vPadpter=new VPadpter();

        list=new ArrayList();
        list.add(orderDataFragment);
        list.add(shopdataFragment);
        viewpager.setAdapter(vPadpter);
*/


    }

    class VPadpter extends  PagerAdapter{

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }
    }


}
