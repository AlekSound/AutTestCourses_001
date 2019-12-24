package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoStrings {
    @ParameterizedTest
    @MethodSource ("vols")
    public void llStrings(String str1, String str2) {
        Assertions.assertEquals(str1,str2);
    }

    static Stream<Arguments> vols() {
        return Stream.of (
                arguments("xxx", "xxx")
        );
    }
}
