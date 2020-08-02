package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.DeviceType;
import com.xiaoshu.entity.DeviceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceTypeMapper extends BaseMapper<DeviceType> {
    long countByExample(DeviceTypeExample example);

    int deleteByExample(DeviceTypeExample example);

    List<DeviceType> selectByExample(DeviceTypeExample example);

    int updateByExampleSelective(@Param("record") DeviceType record, @Param("example") DeviceTypeExample example);

    int updateByExample(@Param("record") DeviceType record, @Param("example") DeviceTypeExample example);
}