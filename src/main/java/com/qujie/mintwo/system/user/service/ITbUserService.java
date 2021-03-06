package com.qujie.mintwo.system.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.qujie.mintwo.system.menu.entity.Menu;
import com.qujie.mintwo.system.menu.entity.TbMenu;
import com.qujie.mintwo.system.user.entity.TbUser;
import com.qujie.mintwo.ustils.PageUtil;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-04-02
 */
public interface ITbUserService extends IService<TbUser> {

    /**
     * 用户列表
     * @param params
     * @return
     */
    PageUtil userList(Map<String, Object> params);



}
