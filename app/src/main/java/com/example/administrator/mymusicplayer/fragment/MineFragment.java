package com.example.administrator.mymusicplayer.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.mymusicplayer.R;
import com.example.administrator.mymusicplayer.activity.LocalMusicActivity;
import com.example.administrator.mymusicplayer.base.MyBaseFragment;

import butterknife.Bind;
import butterknife.OnClick;

public class MineFragment extends MyBaseFragment {
    @Bind(R.id.text)
    TextView test;
    @Bind(R.id.to_local_music)
    Button mButton;
    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @OnClick({R.id.to_local_music})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.to_local_music:
                startActivity(LocalMusicActivity.class);
                break;
        }
    }

}
