package org.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

@Controller
public class HomeController {

    @RequestMapping(value = "/imageController/{imageName}/{imageType}", method = RequestMethod.GET)
    @ResponseBody
    public byte[] helloWorld(@PathVariable String imageName, @PathVariable String imageType) {
        byte[] fileBytes = new byte[0];
        try {
            File file = new File("/files/" + imageName + "." + imageType);
            System.out.println(file.getAbsolutePath());
            ByteArrayOutputStream bos;
            try (FileInputStream fis = new FileInputStream(file)) {
                bos = new ByteArrayOutputStream();
                int b;
                byte[] buffer = new byte[1024];
                while ((b = fis.read(buffer)) != -1) {
                    bos.write(buffer, 0, b);
                }
                fileBytes = bos.toByteArray();
            }
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileBytes;
    }
}
