package com.company.skuska.builder;


public class PostavaDirector implements Director {
    @Override
    public void build(PostavaBuilder builder) {
        builder.vytvorOblecenie();
        builder.vytvorSpravanie();
        builder.vytvorZbran();
    }
}
