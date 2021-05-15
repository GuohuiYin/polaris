package com.polaris.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageApplication {
    public static void main(String[] args) throws IOException {
        BufferedImage read = ImageIO.read(new File("/Users/guohui/Pictures/Old Time/anshan.jpg"));

        System.out.println(read.toString());

        //final ImageMetadata metadata = Imaging.
    }
}
