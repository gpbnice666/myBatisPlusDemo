package com.itheima.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.SpringBootRunner;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootRunner.class)
public class TestBoot {
    @Autowired
    private UserService userService;

    @Test
    public void testFindAll() {
        List<User> list = userService.list();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindOne() {
        User user = userService.getById(1L);
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
        //根据id更新
        User user = new User();
        user.setId(3L);
        user.setName("修改后的阿紫");
        userService.updateById(user);

        //根据条件更新
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        //设置更新内容 这里要写字段的名字
        updateWrapper.set("age", 1);
        //设置更新条件 这里要写字段的名字
        updateWrapper.like("gender", 1);
        userService.update();
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("阿青");
        user.setAge(20);
        user.setUserName("小青青");
        user.setNote("本来是条蛇");
        userService.save(user);
    }

    @Test
    public void testPage() {
        Page<User> page = new Page<>(2, 3);
        //这里要写字段的名字
        page.setDesc("id");
        IPage<User> userIPage = userService.page(page);
        System.out.println(userIPage);
        for (User user : userIPage.getRecords()) {
            System.out.println(user);
        }
    }

    @Test
    public void testQueryCondition() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //这里要写字段的名字
        wrapper.likeRight("name", "亮");
//        wrapper.eq("gender",0);
//        wrapper.ge("age",20);
        List<User> userList = userService.list(wrapper);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testDelete() {
        //根据主键id删除
        boolean b = userService.removeById(9L);
        //根据条件删除
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //这里要写字段的名字
        queryWrapper.like("name", "亮");
        userService.remove(queryWrapper);
        System.out.println(b);
    }
}
