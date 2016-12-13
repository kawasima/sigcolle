SELECT count(*)
FROM signature
WHERE campaign_id = /*campaignId*/1
GROUP BY campaign_id;