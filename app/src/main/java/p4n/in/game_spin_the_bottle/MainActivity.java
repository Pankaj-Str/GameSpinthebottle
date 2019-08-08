package p4n.in.game_spin_the_bottle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RotateFunction(View a) {
        ImageView img = (ImageView) a;
        int RandomAngle = new Random().nextInt(361) + 3600;
        RotateAnimation myRotate = new RotateAnimation(0, RandomAngle,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        myRotate.setDuration(10000);
        myRotate.setFillAfter(true);
        img.startAnimation(myRotate);
    }
}
