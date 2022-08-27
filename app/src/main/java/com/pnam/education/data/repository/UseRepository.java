package com.pnam.education.data.repository;

import com.pnam.education.data.database.domain.User;

import io.reactivex.rxjava3.core.Single;

public interface UseRepository {
    Single<User> login(String username, String password);
}
