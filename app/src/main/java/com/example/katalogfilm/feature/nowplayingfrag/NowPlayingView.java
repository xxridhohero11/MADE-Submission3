package com.example.katalogfilm.feature.nowplayingfrag;

import com.example.katalogfilm.data.entity.Movie;

import java.util.List;

public interface NowPlayingView {

    void showLoad();

    void finishLoad();

    void showList(List<Movie> data);

    void noData();
}
