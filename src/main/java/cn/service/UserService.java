package cn.service;

import cn.bean.TbUser;
import cn.bean.TbUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    long countByExample(TbUserExample example);
    int deleteByExample(TbUserExample example);
    int deleteByPrimaryKey(Integer id);
    int insert(TbUser record);
    int insertSelective(TbUser record);
    List<TbUser> selectByExample(TbUserExample example);
    TbUser selectByPrimaryKey(Integer id);
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);
    int updateByPrimaryKeySelective(TbUser record);
    int updateByPrimaryKey(TbUser record);
}
