package com.imooc.jvminaction;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.UUID;

/**
 * @author : zhaojh
 * @date : 2020/12/6 18:12
 * @description :
 */
public class HeapOOMTest {
    private List<String> oomList = Lists.newArrayList();

    public static void main(String[] args) {
        HeapOOMTest heapOOMTest = new HeapOOMTest();
        while (true) {
            heapOOMTest.oomList.add(UUID.randomUUID().toString());
        }
    }
}
