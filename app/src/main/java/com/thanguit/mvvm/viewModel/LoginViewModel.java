package com.thanguit.mvvm.viewModel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.databinding.library.baseAdapters.BR;

import com.thanguit.mvvm.model.User;

public class LoginViewModel extends BaseObservable {
    private String email;
    private String password;
    public ObservableField<String> messageStatus = new ObservableField<>();
    public ObservableField<Boolean> isSuccess = new ObservableField<>();

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public void onClickLogin() {
        User user = new User(getEmail(), getPassword());
        if (user.isValidEmail() && user.isValidPassword()) {
            messageStatus.set("Login success!");
            isSuccess.set(true);
        } else {
            messageStatus.set("Login fail! Please check email and password again!");
            isSuccess.set(false);
        }
    }
}
