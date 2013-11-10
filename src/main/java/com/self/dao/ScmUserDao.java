package com.self.dao;

import com.self.base.BaseDao;
import com.self.entity.ScmUser;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: guodan
 * Date: 10/21/13
 * Time: 6:32 PM
 */
@Repository("scmUserDao")
public class ScmUserDao extends BaseDao {

    public List<ScmUser> getAll(){
        String sql = "Select * from tableName";
        ScmUser person = null;
        List<ScmUser> list = this.getJdbcTemplate ().query(sql,new PersonRowMapper());
        if(list == null){
            list = new ArrayList<ScmUser>(0);
        }
        return list;
    }
 
    class PersonRowMapper  implements RowMapper<ScmUser> {

        @Override
        public ScmUser mapRow(ResultSet resultSet, int i) throws SQLException {
            ScmUser person = new ScmUser();
            person.setCreateDate(resultSet.getDate("create_date"));
            person.setNick(resultSet.getString("nick"));
            person.setStatus(resultSet.getInt("status"));
            person.setUserCode(resultSet.getString("user_code"));
            return person;
        }
    }
}
