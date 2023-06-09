package me.wacho.vacuum.rank.impl;

import me.wacho.vacuum.rank.Rank;

import java.util.UUID;

public class Default implements Rank {

    @Override
    public String getName(UUID uuid) {
        return "Default";
    }

    @Override
    public String getPrefix(UUID uuid) {
        return "Default";
    }

    @Override
    public String getSuffix(UUID uuid) {
        return "Default";
    }

    @Override
    public String getColor(UUID uuid) {
        return "Default";
    }

    @Override
    public int getWeight(UUID uuid) {
        return 0;
    }
}
