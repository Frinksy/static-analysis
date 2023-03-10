package org.eclipse.epsilon.eol.staticanalyser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;

public class ModelTypeExtensionFactory implements IModelFactory {

	@Override
	public IModel createModel(String driver) {
		IModel model = new EmfModel() ;
		
		return model;
	}

}
