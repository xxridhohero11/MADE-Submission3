package com.example.katalogfilm.feature.upcomingfrag;

import com.example.katalogfilm.data.entity.Movie;

import java.util.List;

public interface UpcomingView {
    void showLoad();

    void finishLoad();

    void showList(List<Movie> data);

    void noData();
}
