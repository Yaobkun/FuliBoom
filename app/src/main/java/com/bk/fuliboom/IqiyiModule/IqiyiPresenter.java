package com.bk.fuliboom.IqiyiModule;


import com.bk.fuliboom.Repository.Beans.AccountInfo;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Bk on 2016/8/29.
 */

public interface IqiyiPresenter {
    void setNewAccount(AccountInfo account);
    void getNewAccount(String captchar);
    void getPastAccount();
    void setPastAccount(List<AccountInfo> list);
    void getCaptchar();
    void setCaptchar(InputStream inputStream);
    void onError(String err);
}
