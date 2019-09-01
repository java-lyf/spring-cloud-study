package com.lyf.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyf.mapper.ItemMapper;
import com.lyf.model.Item;
import com.lyf.service.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {

    @Override
    public Page queryPage(Item item) {
        Page page = new Page(1,10);
        page.setRecords(baseMapper.queryPage(page,item));
        return page;
    }
}
