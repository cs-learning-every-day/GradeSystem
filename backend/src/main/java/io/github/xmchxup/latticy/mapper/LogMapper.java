package io.github.xmchxup.latticy.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.github.xmchxup.latticy.model.LogDO;
import io.github.xmchxup.latticy.common.mybatis.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author pedro@TaleLin
 */
@Repository
public interface LogMapper extends BaseMapper<LogDO> {

    IPage<LogDO> findLogsByUsernameAndRange(Page<LogDO> pager, String name, Date start, Date end);

    IPage<LogDO> searchLogsByUsernameAndKeywordAndRange(Page<LogDO> pager, String name, String keyword, Date start, Date end);

    IPage<String> getUserNames(Page<LogDO> pager);
}
