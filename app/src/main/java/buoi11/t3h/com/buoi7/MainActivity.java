package buoi11.t3h.com.buoi7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,Animation.AnimationListener {
    private Button btnAlpha;
    private Button btnScalte;
    private Button btnRotate;
    private Button btnTranslate;
    private Button btnSet;
    private Animation animAlpha;
    private Animation animRotate;
    private Animation animTranslate;
    private Animation animScale;
    private Animation animSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initAnimation();
    }

    private void initAnimation() {
        animAlpha = AnimationUtils.loadAnimation(this,R.anim.alpha_animation);
        animRotate = AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        animTranslate = AnimationUtils.loadAnimation(this,R.anim.translate_animation);
        animScale = AnimationUtils.loadAnimation(this,R.anim.scale_animation);
        animSet = AnimationUtils.loadAnimation(this,R.anim.set_animation);
        animAlpha.setAnimationListener(this);
    }

    private void initViews() {
        btnAlpha = (Button) findViewById(R.id.btnAlpha);
        btnRotate = (Button) findViewById(R.id.btnRotate);
        btnTranslate = (Button) findViewById(R.id.btnTranslate);
        btnSet = (Button) findViewById(R.id.btnSet);
        btnScalte = (Button) findViewById(R.id.btnScale);
        btnAlpha.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        btnTranslate.setOnClickListener(this);
        btnSet.setOnClickListener(this);
        btnScalte.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAlpha:
                btnAlpha.startAnimation(animAlpha);
                break;
            case R.id.btnScale:
                btnScalte.startAnimation(animScale);
                break;
            case R.id.btnRotate:
                btnRotate.startAnimation(animRotate);
                break;
            case R.id.btnTranslate:
                btnTranslate.startAnimation(animTranslate);
                break;
            case R.id.btnSet:
                btnSet.startAnimation(animSet);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animation animation) {
        Toast.makeText(this,"onAnimationStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(this,"onAnimationEnd",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Toast.makeText(this,"onAnimationRepeat",Toast.LENGTH_SHORT).show();
    }
}
