package com.example.documentscanner;

import android.net.Uri;

public class ScannedDoc {

    private Uri uri;
    private String date;

    public ScannedDoc(Uri uri, String date) {
        this.uri = uri;
        this.date = date;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
