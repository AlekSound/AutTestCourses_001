package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DigMoreZiro {

    @ParameterizedTest
    @ValueSource (ints = {7, 0, -156})
    public void notZiro(int x) {
        Assertions.assertTrue(x>0);
    }
}
