package com.company.builder_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public interface Builder {
    void createPostava();
    void nastavOblecenie();
    void nastavZbran();
    void nastavSpravanie();
    Postava getPostava();
}
