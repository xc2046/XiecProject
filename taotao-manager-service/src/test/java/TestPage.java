import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 测试mybatis分页插件PageHelper
 */
public class TestPage {
    @Test
    public void testPageHelper() throws Exception {
        //初始化spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");
        //获得Mapper的代理对象
        TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
        //设置分页信息
        PageHelper.startPage(1, 30);
        //执行查询
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        //取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        System.out.println("总条数"+pageInfo.getTotal());
        System.out.println("总页数： "+pageInfo.getPages());
        System.out.println("当前页： "+pageInfo.getPageNum());
        System.out.println("每页显示条数： "+pageInfo.getPageSize());
    }
}
