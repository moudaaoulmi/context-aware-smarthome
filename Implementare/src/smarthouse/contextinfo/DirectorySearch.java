package smarthouse.contextinfo;

import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import jadex.runtime.IExternalAccess;

import java.util.Vector;

import smarthouse.knowledge.base.CreateModel;
import smarthouse.knowledge.base.CurrentModel;

public class DirectorySearch {
	
	public static SearchConstraints createAgentDescription(String type, String name, IExternalAccess agent){
		ServiceDescription sd = new ServiceDescription();
		if (type!=null)
		sd.setType(type);
		if (name!=null)
			sd.setName(name);
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		SearchConstraints sc = new SearchConstraints();
        sc.setMaxResults(100);
		
        return sc;
		
	}
	
	public static Vector getSensorTypes(CreateModel model) {
		Vector sensorTypes=CurrentModel.getSensorTypes(model);
		return sensorTypes;

	}
}