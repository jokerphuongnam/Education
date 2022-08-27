package com.pnam.education.data.database.network;

import com.pnam.education.data.database.network.model.LoginResponse;

import io.reactivex.rxjava3.core.Single;

public interface UserNetwork {
    Single<LoginResponse> login(String username, String password);
}