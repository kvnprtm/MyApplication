package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Laptop implements Parcelable{
    private static int gambar;
    private static String nama;
    private static String harga;
    private static String spec;

    public Laptop() {

    }


    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public static String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public static String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }


    protected Laptop(Parcel in) {
        gambar = in.readInt();
        nama = in.readString();
        harga = in.readString();
        spec = in.readString();

    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(gambar);
        parcel.writeString(nama);
        parcel.writeString(harga);
        parcel.writeString(spec);

    }
    public static final Creator<Laptop> CREATOR = new Creator<Laptop>() {
        @Override
        public Laptop createFromParcel(Parcel in) {
            return new Laptop(in);
        }

        @Override
        public Laptop[] newArray(int size) {
            return new Laptop[size];
        }
    };

}
