package com.bo.pojo;

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
public class Dd extends Model<Dd> {

private static final long serialVersionUID=1L;

    private String a;

    private Date ab;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
