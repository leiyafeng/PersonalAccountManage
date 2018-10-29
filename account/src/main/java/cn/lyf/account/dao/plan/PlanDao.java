package cn.lyf.account.dao.plan;

import cn.lyf.account.bean.Plan;

import java.util.List;
import java.util.Map;

public interface PlanDao {
    /**
     * 创建计划
     * @param plan
     * @return
     */
    int insertPlan(Plan plan);

    /**
     * 分页查询计划列表
     * @return
     */
    List<Plan> findAllPlanByPage(Map<String,Object> map );

    /**
     * 获取列表总条数
     * @return
     */
    int getTotal(Map<String,Object> map);

    /**
     * 根据id更新计划
     * @return
     */
    int updatePlanById(Plan plan);
}
