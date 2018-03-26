package com.shaoqunliu.mybatis.generator;

import org.mybatis.generator.api.ShellRunner;

public class Main {
    public static void main(String[] args) {
        args = new String[] { "-configfile", "src\\main\\resources\\generator.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
