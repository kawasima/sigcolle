package net.unit8.sigcolle.dao;

import net.unit8.sigcolle.DomaConfig;
import net.unit8.sigcolle.model.Signature;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author kawasima
 */
@Dao(config = DomaConfig.class)
public interface SignatureDao {
    @Select
    int countByCampaignId(Long campaignId);

    @Select
    List<Signature> selectAllByCampaignId(Long campaignId);

    @Insert
    int insert(Signature signature);
}
