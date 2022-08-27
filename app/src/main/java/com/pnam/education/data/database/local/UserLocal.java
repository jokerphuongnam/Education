package com.pnam.education.data.database.local;

import io.reactivex.rxjava3.core.Completable;

public interface UserLocal {
    Completable saveToken(String loginToken);
}