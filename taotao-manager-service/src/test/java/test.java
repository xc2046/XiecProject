import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test {
    @Autowired
    private TbItemMapper tbItemMapper;
    @Autowired
    private TbItem tbItem;
    @Test
    public void test(){
        long s = 536563;
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(s);
        System.out.println(tbItem);

    }



}
