package org.example.serverlets;

import lombok.extern.slf4j.Slf4j;
import org.example.base.MyRequest;
import org.example.base.MyResponse;

public class DefaultT extends AbstractServerlet {
    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception {

        System.out.println("DefaultT");
        StringBuilder builder = new StringBuilder();
        builder.append("HTTP/1.1 200 ok\n");
        builder.append("Content-Type: text/html;charset=utf-8\n\r\n")
                .append("this is DefaultT resp\r\n");
        response.write(builder.toString());
    }
}
