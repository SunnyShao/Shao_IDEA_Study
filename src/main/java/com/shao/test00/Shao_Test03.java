package com.shao.test00;

import lombok.Builder;
import lombok.Data;
import lombok.val;
import lombok.var;

import java.util.ArrayList;

/**
 * @author Shao
 * @date 2023/8/30 18:42
 * @description
 */

@Data
@Builder
public class Shao_Test03 {

    public String name;

    public Integer age;

    public static void main(String[] args) {
        val list1 = new ArrayList<Integer>();
        list1.add(1);
        System.out.println(list1);
        var list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
    }
}
