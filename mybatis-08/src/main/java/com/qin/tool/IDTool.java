package com.qin.tool;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class IDTool {
    /*获取随机ID*/
    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
