package com.OpenGLSample;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class OpenGLSampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        MyRenderer renderer = new MyRenderer();
        GLSurfaceView glsurfaceview = new GLSurfaceView(this);
        glsurfaceview.setRenderer(renderer);
        setContentView(glsurfaceview);
    }
}