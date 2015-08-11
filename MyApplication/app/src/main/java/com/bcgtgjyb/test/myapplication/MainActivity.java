package com.bcgtgjyb.test.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.bcgtgjyb.test.mylibrary.MoveAnimation;


public class MainActivity extends ActionBarActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.move_button);
        MoveAnimation moveAnimation=new MoveAnimation(button);
//        moveAnimation.setRandomAnimation(true);
        moveAnimation.setCurveMove(new float[]{0,0},new float[]{200,200},100,0);
        //�Ƿ������ƶ�
//        moveButton.setIsMove(true);
        //���������ƶ���������
//        moveButton.setCoordinateNumber(10);
        //���������˶���Χ
//        moveButton.setMoveScope(30);
        //���ö�������ʱ�䣬�ı��ٶȣ�����������A390t��android4.0.3�����ٶ��޷����ã�
//        moveButton.setMoveVelocity(1500);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
