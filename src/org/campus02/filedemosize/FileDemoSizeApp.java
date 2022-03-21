package org.campus02.filedemosize;

import java.io.File;

public class FileDemoSizeApp {

    public static void main(String[] args) {

        String dir = "D:\\temp\\sub-ordner\\dokumente";

        long totalSizeOfDir = printAndGetSize(new File(dir));

        System.out.println("totalSizeOfDir = " + totalSizeOfDir);

    }
// totalSizeOfDir = 38.590.923
    //              -38.624.611 = 33688
    public static long printAndGetSize(File dir) { // ALT+ENTER
        if (dir.isFile())
            return 0;
        if (!dir.exists())
            return 0;

         long totalLength = 0;
        File[] filesInDir = dir.listFiles();
        for (File f : filesInDir) {
            System.out.println(f.getPath());
            if (f.isDirectory()) {
                totalLength += printAndGetSize(f);
            }
            else {
                totalLength += f.length();
            }

        }

        return totalLength;
    }
}
