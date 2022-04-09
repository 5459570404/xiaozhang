package com.xiaozhang.admin.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @autor：张天治
 * @time:2018/12/9 11:30
 * @desc：
 */
public class InputStreamUtil {
    //    将输入流转为字节数组
    public static byte[] InputStreamToByte(InputStream iStrm) throws IOException {
        ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
        int ch=0;
        while ((ch = iStrm.read()) != -1)
        {
            bytestream.write(ch);
        }
        byte imgdata[]=bytestream.toByteArray();
        bytestream.close();
        return imgdata;
    }
}
