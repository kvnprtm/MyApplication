package com.example.myapplication;

import java.util.ArrayList;

public class DataLaptop {
    private static String[][] data = new String[][]{
        {"ASUS VivoBook S14 S433FL","Rp 13.999.000","Windows 10 Home/Intel® Core™ i5-10210U/NVIDIA® GeForce® MX250/8G/512G PCIe+32GB M.2 SSD(Intel TG)", String.valueOf(R.drawable.vivobook_s14_s433fl)},
        {"ASUS VivoBook S14 S430FN","Rp 8.199.000","Intel® Core™ i3-8145U/4G/512G PCIe/Windows 10 Home",String.valueOf(R.drawable.vivobook_s14_s430fn)},
        {"ROG Zephyrus G15","Rp 18.299.000","AMD Ryzen™ 7 3750H/GTX1660Ti_V6G/8G/512GB PCIe SSD/Windows 10 Home",String.valueOf(R.drawable.rog_zephyrus_g15)},
        {"ROG Strix G","Rp 13.099.000","Windows 10 Home/Intel® Core™ i5-9300H/GTX1050_V4G/8G/512G PCIe/Slim FHD IPS 120Hz/RGB",String.valueOf(R.drawable.rog_strix_g)},
        {"ROG Mothership (GZ700)","Rp 130.999.000","Windows 10 Home/Intel® Core™ i9-9980HK/RTX2080_V8G/64G/512G*3 PCIe/Per Key RGB",String.valueOf(R.drawable.rog_mothership_gz700)},
        {"ASUS TUF Gaming A15","Rp 14.299.000","AMD Ryzen™ 5 4600H/GTX1650Ti_V4G/8G/512GB PCIe SSD/Windows 10 Home/Fortress Gray",String.valueOf(R.drawable.asus_tuf_gaming_a15)},
        {"ASUS TUF Gaming FX505GD","Rp 14.999.000","Intel® Core™ i7-8750H/8GB/1TB HDD /GTX 1050_v4G/Windows 10 Home/RGB Keyboard/Gold Steel",String.valueOf(R.drawable.asus_tuf_gaming_fx505gd)},
    };

    static ArrayList<Laptop> getListData(){
        ArrayList<Laptop> laptops = new ArrayList<>();
        for (String[] aData : data){
            Laptop laptop = new Laptop();
            laptop.setNama(aData[0]);
            laptop.setHarga(aData[1]);
            laptop.setSpec(aData[2]);
            laptop.setGambar(Integer.parseInt(aData[3]));

            laptops.add(laptop);
        }
        return laptops;
    }
}
