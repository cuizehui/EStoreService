package com.example.cuizehui.estoredataservice.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.example.cuizehui.estoredataservice.IDataAidlInterface;
import com.example.cuizehui.estoredataservice.ShopDaTa;

import org.litepal.crud.DataSupport;

import java.util.List;


public class DataService extends Service {

    List<ShopDaTa>   shopDaTas;
    public DataService() {
    }



    //根据service生命周期 访问数据库！ 传输对象


    @Override
    public void onCreate() {
        super.onCreate();
         shopDaTas= DataSupport.findAll(ShopDaTa.class);
         Log.d("bitmapliapterl ",":" +   shopDaTas.get(0).getBitmaps().length);
         Log.d("pic adress",shopDaTas.get(0).getPicadress());
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
         Mybinder mybinder=new Mybinder();
        return mybinder;

    }

 class  Mybinder extends IDataAidlInterface.Stub{

     @Override
     public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

     }

     @Override
     public List<ShopDaTa> getShopDaTaList() throws RemoteException {

         //也可以在此处设置图片
         return shopDaTas;
     }


 }


}
