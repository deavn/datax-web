package com.wugui.datax.admin.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.wugui.datax.admin.dto.DataxJsonDto;
import com.wugui.datax.admin.service.DataxJsonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 组装datax  json的控制器
 *
 * @author zhouhongfa@gz-yibo.com
 * @ClassName DataxJsonController
 * @Version 1.0
 * @since 2019/7/31 20:47
 */

@RestController
@RequestMapping("api/dataxJson")
@Api(tags = "组装datax  json的控制器")
public class DataxJsonController extends ApiController {

    @Autowired
    private DataxJsonService dataxJsonService;

    @PostMapping("/buildJson")
    @ApiOperation("JSON构建")
    public R<String> buildJobJson(@RequestBody DataxJsonDto dataxJsonDto) {
        return success(dataxJsonService.buildJobJson(dataxJsonDto));
    }

}
