package life.majiang.community.community.mapper;

import life.majiang.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
        @Insert("insert into c_user (u_name,u_account_id,u_token,u_gmt_create,u_gmt_modified) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
        void insert(User user);
        //类直接写，不是类，需要加@pram
        @Select("select * from c_user where u_token = #{token}")
        User findByToken(@Param("token") String token);
}
