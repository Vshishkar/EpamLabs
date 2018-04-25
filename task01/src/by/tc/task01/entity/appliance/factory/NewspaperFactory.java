package by.tc.task01.entity.appliance.factory;

import java.util.Map;



import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Newspaper;

public class NewspaperFactory implements ApplianceBuildingService {

	@Override
	public Appliance buildAppliance(Map<String, String> params) {
		by.tc.task01.entity.appliance.Newspaper newspaper = new by.tc.task01.entity.appliance.Newspaper();
		
		newspaper.setNumberOfPeriodocity(params.get(Newspaper.PERIODICITY.toString()));
		newspaper.setPaidOrFree(params.get("PAID_OR_FREE"));
		newspaper.setTitle(params.get("TITLE"));
		
		
		return newspaper;
	}

}
