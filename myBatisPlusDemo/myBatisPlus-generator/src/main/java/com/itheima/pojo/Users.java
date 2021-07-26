package com.itheima.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author HM
 * @since 2021-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Users extends Model<Users> {

private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private Integer age;

    private Integer one;

    private Date two;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
