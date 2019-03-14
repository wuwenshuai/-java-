package com.carry.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户实体类",description = "用户相关")
@Builder
public class User {


    @ApiModelProperty(value = "用户姓名",required = false)
    private String name;

    @ApiModelProperty(value = "用户id",required = true)
    private Integer id;

    @ApiModelProperty(value = "用户地址",required = true)
    private String addr;
}
