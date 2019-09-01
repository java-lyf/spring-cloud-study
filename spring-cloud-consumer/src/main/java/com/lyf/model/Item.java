package com.lyf.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@TableName("tb_item")
@Setter
@Getter
@NoArgsConstructor
@ApiModel("商品基本信息")
public class Item {

    @TableId
    @ApiModelProperty("主键Id")
    private Long id;

    @ApiModelProperty("名称")
    @NotNull(message = "姓名不能为空")
    @TableField(value = "name")
    private String name;

    @ApiModelProperty("价格")
    private BigDecimal price;

    @ApiModelProperty("备注")
    private String remark;
}
