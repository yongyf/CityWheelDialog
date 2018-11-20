package com.yongzhi.citywheelview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wheelview.library.dialog.DialogStyle;
import com.wheelview.library.dialog.LoadStyle;
import com.wheelview.library.dialog.MyWheelDialog;
import com.wheelview.library.dialog.callback.OnWheelClickListener;
import com.wheelview.library.dialog.entity.Address;


public class MainActivity extends Activity implements OnWheelClickListener {

    private Button btn;
    private TextView tv;
    private MyWheelDialog d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        init();
    }

    private void initView() {
        btn = (Button) findViewById(R.id.btn);
        tv = (TextView) findViewById(R.id.tv);
    }

    private void init() {
        d = new MyWheelDialog(this, DialogStyle.STANDARD, LoadStyle.ALL,this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.show();
            }
        });

    }

    @Override
    public void onOkClick(Address address) {
        tv.setText(address.getProvinceName() + " " + address.getCountryName() + " " + address.getCountryName() + " " +
                address.getProvinceID() + " " + address.getCityID() + " " + address.getCountryID());
    }

    @Override
    public void onCancelClick() {

    }
}
