package cn.service;

import cn.bean.TbUser;
import cn.bean.TbUserExample;
import cn.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements  UserService {
    @Autowired
    private TbUserMapper userMapper;
    @Override
    public long countByExample(TbUserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TbUserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TbUser record) {
        return 0;
    }

    @Override
    public int insertSelective(TbUser record) {
        return 0;
    }

    @Override
    public List<TbUser> selectByExample(TbUserExample example) {
        return userMapper.selectByExample(example);
    }

    @Override
    public TbUser selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbUser record, TbUserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TbUser record, TbUserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TbUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TbUser record) {
        return 0;
    }
}
