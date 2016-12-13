package net.unit8.sigcolle.controller;

import enkan.collection.Parameters;
import enkan.component.doma2.DomaProvider;
import enkan.data.HttpResponse;
import kotowari.component.TemplateEngine;
import net.unit8.sigcolle.dao.SignatureDao;
import net.unit8.sigcolle.model.Signature;

import javax.inject.Inject;
import java.util.List;

/**
 * @author kawasima
 */
public class SignatureController {
    @Inject
    TemplateEngine templateEngine;

    @Inject
    DomaProvider domaProvider;

    public HttpResponse list(Parameters params) {
        SignatureDao dao = domaProvider.getDao(SignatureDao.class);
        List<Signature> signatures = dao.selectAllByCampaignId(params.getLong("campaignId"));
        return templateEngine.render("signature/list",
                "signatures", signatures);
    }
}
