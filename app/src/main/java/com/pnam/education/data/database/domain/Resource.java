package com.pnam.education.data.database.domain;

public interface Resource <T>{
    class Loading<T> implements Resource<T> {
        public Loading() {

        }
    }

    class Success<T> implements  Resource<T> {
        private final T data;

        public Success(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    class Error<T> implements  Resource<T> {
        private final Throwable throwable;

        public Error(Throwable throwable) {
            this.throwable = throwable;
        }

        public Throwable getThrowable() {
            return throwable;
        }
    }
}
