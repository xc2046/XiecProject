package com.taotao.service.impl;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;


//    @Override
//    public EasyUIDataGridResult getItemList(int page, int rows) {
//        //设置分页信息
//        PageHelper.startPage(page, rows);
//        //执行查询
//        TbItemExample example = new TbItemExample();
//        List<TbItem> list = tbItemMapper.selectByExample(example);
//        //取查询结果
//        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
//        EasyUIDataGridResult result = new EasyUIDataGridResult();
//        result.setRows(list);
//        result.setTotal(pageInfo.getTotal());
//        //返回结果
//        return result;
//    }

    @Override
    public TbItem getItemById(long id) {
        TbItem item = tbItemMapper.selectByPrimaryKey(id);
        return item;
    }
}
