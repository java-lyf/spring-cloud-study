package com.lyf.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyf.model.Item;

public interface ItemService {

    Page queryPage(Item item);
}
