package net.beeway.emer.dao;

import net.beeway.emer.entry.YjUsers;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;


public interface YjUsersMapper {

    List<YjUsers> selectAll();

    /**
     * 根据用户名获取用户
     *
     * @param loginName
     * @return
     */
    List<YjUsers> getUsersByLoginName(String loginName);

    /**
     * 根据邮箱获取用户
     *
     * @param email
     * @return
     */
    List<YjUsers> getUsersByEmail(String email);

    /**
     * 根据角色ID获取当前角色下的所有用户
     *
     * @param roleId
     * @return
     */
    List<YjUsers> getUsersByRoleId(Integer roleId);

    /**
     * 根据邮箱和角色ID模糊获取,不在当前角色下的用户
     *
     * @param map
     * @return
     */
    List<YjUsers> getUserByEmailAndRoleId(Map map);

    /**
     * 修改用户登录时间
     *
     * @param users
     */
    void updateUserLoginDate(YjUsers users);

    /**
     * 根据用户ID锁定或解锁该用户
     *
     * @param users
     */
    void lockingUser(YjUsers users);

    /**
     * 用户邮箱是否存在
     *
     * @param users
     * @return
     */
    int checkUserEmailUnique(YjUsers users);

    /**
     * 用户工号是否存在
     *
     * @param users
     * @return
     */
    int checkUserNumUnique(YjUsers users);

    /**
     * 用户手机号是否存在
     *
     * @param users
     * @return
     */
    int checkUserMobileUnique(YjUsers users);

    /**
     * 根据员工号 更新用户
     *
     * @param users
     */
    void updateUserByNum(YjUsers users);

    List<Map<Integer, Integer>> countProxyNum();

    List<YjUsers> countExpandAmount();

    YjUsers getEverydayStandDetail(@Param("loginUserId") Integer loginUserId, @Param("channelType") Integer channelType,
                                   @Param("startDate") Date startDate, @Param("endDate") Date endDate);


    int deleteByPrimaryKey(Integer id);

    int insert(YjUsers record);

    int insertSelective(YjUsers record);

    YjUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YjUsers record);

    int updateByPrimaryKey(YjUsers record);

    int updatePwd(@Param("id") Integer userId, @Param("password") String password);
}