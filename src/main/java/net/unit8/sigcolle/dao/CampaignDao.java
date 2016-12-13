package net.unit8.sigcolle.dao;

import net.unit8.sigcolle.DomaConfig;
import net.unit8.sigcolle.model.Campaign;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.util.List;

/**
 * @author kawasima
 */
@Dao(config = DomaConfig.class)
public interface CampaignDao {
    @Select(ensureResult = true)
    Campaign selectById(Long campaignId);

    @Select
    List<Campaign> selectAll();

    @Insert
    int insert(Campaign campaign);
}
