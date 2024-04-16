package com.kingking.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {

    public static void main(String[] args) {
        //获取项目根路径
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        File projectFile = new File(projectPath);

        //输入路径：ACM事例代码模版目录
        String inputPath = projectPath +File.separator +"kingking-generator-demo-projects"+File.separator+"acm-template";
        //输出路径：直接输出到项目的根目录
        String outputPath =projectPath;
        copyFilesByHutool(inputPath,outputPath);
    }

//    文件 A => 目录 B，则文件 A放在目录B下
//    文件 A =>文件 B,则文件 A 覆盖文件 B
//    目录A=>目录B，则目录A放在目录B下
//    核心思路:先创建目录，然后遍历目录内的文件，依次复制@param inputFile@param outputFile@throws IOException

    public static void copyFilesByHutool(String inputPath,String outputPath){
        FileUtil.copy(inputPath,outputPath,false);
    }
}
