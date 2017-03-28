package com.present.course.service;

import com.alibaba.fastjson.JSONObject;
import com.present.common.dto.ResponseDto;
import com.present.common.service.BaseService;
import com.present.common.util.CheckUtil;
import com.present.course.bean.Course;
import com.present.course.dao.CourseClassDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Larry-sea on 2017/3/24.
 * <p>
 * 学生获取所有课程信息列表
 */

@Service("studentGetAllCourse")
public class StudentGetAllCourse extends BaseService<List<Course>> {

    /**
     * 学生获取所有课程
     */
    @Autowired
    private CourseClassDao courseClassDao;


    @Override
    public ResponseDto process(JSONObject params, HttpServletRequest request, HttpServletResponse response) {
        CheckUtil.checkEmpty(params, "classId");
        List<Course> courseList = courseClassDao.queryCourseByClassId(params.getString("classId"));
        ResponseDto<List<Course>> responseDto = new ResponseDto<List<Course>>();
        responseDto.setData(courseList);
        return responseDto;
    }
}
