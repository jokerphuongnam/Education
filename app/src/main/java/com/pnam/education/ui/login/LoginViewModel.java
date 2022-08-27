package com.pnam.education.ui.login;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.pnam.education.data.database.domain.Resource;
import com.pnam.education.data.database.domain.User;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

public class LoginViewModel extends ViewModel {
    private LoginUseCase useCase;
    private CompositeDisposable disposable;

    LoginViewModel(LoginUseCase useCase) {
        this.useCase = useCase;
    }

    private MutableLiveData<Resource<Void>> mutableLiveData = new MutableLiveData<>();

    private SingleObserver<User> loginSingleObserver = new SingleObserver<User>() {
        @Override
        public void onSubscribe(@NonNull Disposable d) {
            disposable.add(d);
        }

        @Override
        public void onSuccess(@NonNull User user) {

        }

        @Override
        public void onError(@NonNull Throwable e) {

        }
    };

    public void login(String username, String password) {
        mutableLiveData.postValue(new Resource.Loading<>());
        useCase.login(username, password)
                .subscribe();
    }
}
