package com.bo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2019-06-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User extends Model<User> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    /**
     * 1男性，2女性
     */
    private Integer gender;

    private Date birthday;

    private Date created;

    private Date updated;

    /**
     * 备注
     */
    private String note;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
