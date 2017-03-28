package com.present.student.service;

import com.present.common.service.ReadExcel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Larry-sea on 2017/3/23.
 *
 * 学生上传头像接口
 *
 */

public class StudentUpaloadPortraitService {
    private static Logger logger = LoggerFactory.getLogger(ReadExcel.class);


    /**
     * 读取excel文件中的用户信息，保存在数据库中
     *
     * @param excelFile
     */
    @RequestMapping("/studentUploadPortrait")
    public void readExcel(@RequestParam(value = "portrait") MultipartFile excelFile, HttpServletRequest req, HttpServletResponse resp) {




    }


}
