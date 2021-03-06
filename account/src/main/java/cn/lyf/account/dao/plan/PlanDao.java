package cn.lyf.account.dao.plan;

import cn.lyf.account.dto.QueryPlanListDTO;
import cn.lyf.account.po.Plan;

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
    int getTotal(QueryPlanListDTO queryPlanListDTO);

    /**
     * 根据id更新计划
     * @return
     */
    int updatePlanById(Plan plan);

    /**
     * 根据条件查询计划
     * @param queryPlanListDTO
     * @return
     */
    List<Plan> queryPlanByOptions(QueryPlanListDTO queryPlanListDTO);

    /**
     * 根据id查询计划详情
     * @param id
     * @return
     */
    Plan queryPlanById(Integer id);

    /**
     * 根据条件查询计划列表（不分页查询）
     * @param planStatus
     * @return
     */
    List<Plan> queryPlanByPlanStatus(Integer planStatus);

    /**
     * 根据计划名称查询计划条数
     * @param map
     * @return
     */
    int getCountGoal(Map<String,Object> map);
}
