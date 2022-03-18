package com.company;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer>integers = Arrays.asList(5,25,3,49,1,9,-8,6,7,3,26,97);
       integers.stream().filter(x -> x%2==0).map(x->x*x).max(Integer::compare).ifPresent(System.out::println);
       
    }
}
