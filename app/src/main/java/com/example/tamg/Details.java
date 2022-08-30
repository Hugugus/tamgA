package com.example.tamg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MenuItem;
import android.view.WindowManager;
import android.webkit.*;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.example.tamg.R;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent data = getIntent();

        String title = data.getStringExtra("title");
        String content = data.getStringExtra("content");
        String frg = data.getStringExtra("frg");


        WebView contentView = findViewById(R.id.contentView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        contentView.getSettings().setJavaScriptEnabled(true);
        contentView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        contentView.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView pView, String s) {
                pView.loadUrl(s);
                return false;
            }
        });


        if(frg!=null)
        {
            if(frg.equals("lmdc")) {
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
                ConstraintLayout c=findViewById(R.id.initb);
                c.setBackground(ContextCompat.getDrawable(this, R.drawable.lmdcwp));
                //constraintId.setBackground(ContextCompat.getDrawable(this, R.drawable.some_drawable))

            }

        }

        getSupportActionBar().setTitle(title);




        final String mimeType = "text/html";
        final String encoding = "UTF-8";

        if(title.equals("Info"))
        {
            TextView txt=findViewById(R.id.txtWb);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                txt.setText(Html.fromHtml(content, Html.FROM_HTML_OPTION_USE_CSS_COLORS));
            } else {
                txt.setText(Html.fromHtml(content));
            }
            txt.setTextColor(Color.WHITE);
            txt.setClickable(true);
            txt.setMovementMethod(LinkMovementMethod.getInstance());
            WebView googleMapWebView=contentView;
            String iframe = "<iframe src=https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2537.911595625812!2d3.6028990157331475!3d50.49860307948199!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x9013334c6d82f4c0!2sLa+Maison+Du+Couscous!5e0!3m2!1sfr!2sbe!4v1446800446026&language=fr  style=\"position: relative; height: 400dp; width: 100%;\"\"</iframe>";

            googleMapWebView.getSettings().setJavaScriptEnabled(true);
            googleMapWebView.loadData(iframe, "text/html", "utf-8");
            googleMapWebView.setBackgroundColor(Color.TRANSPARENT);

            contentView.setWebViewClient(new WebViewClient() {
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl(
                            "javascript:document.body.style.setProperty(\"color\", \"white\");"
                    );
                }
            });

            //webView.loadDataWithBaseURL("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2537.911595625812!2d3.6028990157331475!3d50.49860307948199!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x9013334c6d82f4c0!2sLa+Maison+Du+Couscous!5e0!3m2!1sfr!2sbe!4v1446800446026", data_html, "text/html", "UTF-8", null);
            //contentView.loadUrl("https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2537.911595625812!2d3.6028990157331475!3d50.49860307948199!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x9013334c6d82f4c0!2sLa+Maison+Du+Couscous!5e0!3m2!1sfr!2sbe!4v1446800446026");
        }
        else {

            content=content.replace("/t","");
            WebView webView=contentView;
            webView.setInitialScale(1);

            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
            webView.setScrollbarFadingEnabled(false);
            webView.getSettings().setTextSize(WebSettings.TextSize.LARGEST);
            webView.setWebViewClient(new WebViewClient()
            {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://docs.google.com/gview?embedded=true&url="+url));
                    startActivity(i);
                    return true;
                }
            });

            contentView.loadData("<html>\n" +
                    "<head>\n" +
                    "<font color='white'>"+

                    "<style>\n" +
                    "img {\n" +
                    "    width: 100%;\n" +""+
                    "}\n" +
                    "</style>"+
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=yes\">\n"+
                    "</head>\n" +
                    "<body>\n"+content, "text/html", "UTF-8");

            webView.setBackgroundColor(Color.TRANSPARENT);




            //contentView.loadDataWithBaseURL("", content, mimeType, encoding, "");
            //contentView.loadDataWithBaseURL(null,"<!DOCTYPE html><html><body style = \"text-align:center\"><img style=\"border-style:dotted;border-width:5px;border-color:black;width:99%;\" src= "  + content+ " alt=\"page Not Found\"></body></html>","text/html", "UTF-8", null);


        }

        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}