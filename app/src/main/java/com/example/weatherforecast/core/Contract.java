package com.example.weatherforecast.core;

import com.example.weatherforecast.model.APIInterface;

import java.util.List;

public interface Contract {
    interface View {
        void onResponseFail();
        void onFailure(String errorCode);
        void onPlaceIsEmpty();
        void showProgressBar();
        void hideProgressBar();
    }
    interface Presenter {
        void callWeatherMapApi(String getPlaceQuery);
    }
    interface Model {
        APIInterface initRetrofitCallApi();
    }
}
