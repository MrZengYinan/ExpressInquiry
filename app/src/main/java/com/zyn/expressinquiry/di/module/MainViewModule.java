package com.zyn.expressinquiry.di.module;

import com.zyn.expressinquiry.mvp.contract.MainContract;
import com.zyn.expressinquiry.mvp.presenter.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Desc:
 * CreateDate: 2017/7/4 17:37
 * Author: Created by ZengYinan
 * Email: 498338021@qq.com
 */
@Module
public class MainViewModule {
    @Provides
    MainContract.IMainPresenter providerMainPresenter(){
        return new MainPresenter();
    }
}
