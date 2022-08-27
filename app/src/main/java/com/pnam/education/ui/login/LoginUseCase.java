package com.pnam.education.ui.login;

import com.pnam.education.data.database.domain.User;

import io.reactivex.rxjava3.core.Single;

public interface LoginUseCase {
    Single<User> login(String username, String password);
}
